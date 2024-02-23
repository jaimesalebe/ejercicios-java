package com.jaimesalebe.crudmysql.Repository;

import com.jaimesalebe.crudmysql.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
