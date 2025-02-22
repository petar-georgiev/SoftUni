CREATE DATABASE `gamebar`;

USE `gamebar`;

CREATE TABLE `employees` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`first_name` VARCHAR(30) NOT NULL,
`last_name` VARCHAR(30) NOT NULL
);

CREATE TABLE `categories`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR (30) NOT NULL
);

CREATE TABLE `products`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR (40) NOT NULL,
`category_id` INT 
);

INSERT INTO `employees` 
VALUES
(1,'Pesho','Peshov'),
(2,'Ivan','Ivanov'),
(3,'Gosho','Gochov');

ALTER TABLE `employees`
ADD COLUMN `middle_name` VARCHAR(20);

ALTER TABLE `products`
ADD CONSTRAINT fk_products_categories
FOREIGN KEY (`category_id`)
REFERENCES `categories`(`id`);

ALTER TABLE `employees` 
CHANGE COLUMN `middle_name` `middle_name` 
VARCHAR(100);

