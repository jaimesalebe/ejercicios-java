CREATE DATABASE IF NOT EXISTS books_system;
USE books_system;


CREATE TABLE IF NOT EXISTS book (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) UNIQUE NOT NULL,
    author VARCHAR(255)
);

INSERT INTO book (title, author) VALUES
    ('The Great Gatsby', 'F. Scott Fitzgerald'),
    ('To Kill a Mockingbird', 'Harper Lee'),
    ('1984', 'George Orwell');
