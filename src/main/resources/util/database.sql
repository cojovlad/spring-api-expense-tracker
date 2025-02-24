CREATE DATABASE expense_db;

USE expense_db;

CREATE TABLE expense (
                         id INT PRIMARY KEY AUTO_INCREMENT,
                         expense_name VARCHAR(255) NOT NULL,
                         expense_type VARCHAR(255) NOT NULL,
                         expense_price INT NOT NULL,
                         date DATE NOT NULL
);