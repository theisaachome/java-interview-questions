-- create database pet_shop_db;
-- use pet_shop_db;

Create Table Cats(
  name VARCHAR(225) NOT NULl,
  breed VARCHAR(225),
  age INT
);


--  Setup  Not Null

CREATE TABLE Cats2(
  name VARCHAR(100) NOT NUll ,
  age INT NOT Null 
)

-- Setup Default Values

CREATE TABLE Cats3(
  name VARCHAR(100) NOT NULL DEFAULT 'unamed',
  age INT NOT NULL DEFAULT 99
)

--  Setup Primaty Key
CREATE TABLE unique_cats2 (
  cat_id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100),
  age INT,
  PRIMARY KEY (cat_id));


-- 