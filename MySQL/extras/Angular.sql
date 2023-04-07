CREATE DATABASE user;
USE user;

CREATE TABLE USER_REG_TBL (
    id INT PRIMARY KEY ,
    name VARCHAR(20),
    email VARCHAR(20),
    experience INT,
    domain VARCHAR(20)
);


SELECT * FROM user_reg_tbl;