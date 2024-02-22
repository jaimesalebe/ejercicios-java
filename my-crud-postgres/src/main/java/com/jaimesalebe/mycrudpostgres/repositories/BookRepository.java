package com.jaimesalebe.mycrudpostgres.repositories;

import com.jaimesalebe.mycrudpostgres.model.Book;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final SimpleJdbcInsert insert;

    private final BookMapper mapper = new BookMapper();

    private final String table = "books";


    public BookRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate, DataSource dataSource) {
        this.jdbcTemplate = namedParameterJdbcTemplate;
        this.insert = new SimpleJdbcInsert(dataSource).withTableName(table).usingGeneratedKeyColumns("id");
    }

    public List<Book> getAllBooks() {
        String sql = "select * from " + table;
        return jdbcTemplate.query(sql, mapper);
    }

    public void createBook(Book newBook) {
        insert.executeAndReturnKey(
                new MapSqlParameterSource("name", newBook.name)
        );
    }

    private static class BookMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            long id = rs.getLong("id");
            String name = rs.getString("name");

            return new Book(id, name);
        }
    }

}
