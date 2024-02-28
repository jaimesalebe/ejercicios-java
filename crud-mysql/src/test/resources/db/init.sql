CREATE DATABASE IF NOT EXISTS books_system;
USE books_system;


CREATE TABLE IF NOT EXISTS book (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) UNIQUE NOT NULL,
    author VARCHAR(255),
    image_url VARCHAR(255)
);

INSERT INTO book (title, author, image_url) VALUES
    ('The Great Gatsby', 'F. Scott Fitzgerald', '/media/the-great-gatsby.jpg'),
    ('To Kill a Mockingbird', 'Harper Lee', '/media/to-kill-a-mockingbird.jpg'),
    ('1984', 'George Orwell', '/media/1984.jpg');