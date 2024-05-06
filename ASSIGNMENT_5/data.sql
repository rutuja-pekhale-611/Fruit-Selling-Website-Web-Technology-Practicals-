 CREATE DATABASE IF NOT EXISTS fruitshop;

USE fruitshop;

CREATE TABLE IF NOT EXISTS fruits (
    fruit_id INT AUTO_INCREMENT PRIMARY KEY,
    fruit_name VARCHAR(255) NOT NULL,
    fruit_price DECIMAL(10, 2) NOT NULL,
    quantity INT NOT NULL
);
