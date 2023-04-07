USE demo_training;

CREATE TABLE SalesData (
    city VARCHAR(64),
    price_with_material DOUBLE,
    price_without_material DOUBLE
);

INSERT INTO SalesData
VALUES ("TVM", 1600, 800),
       ("Chennai", 1800, 1000),
       ("Hyderabad", 2000, 900),
       ("Mumbai", 2500, 1200),
       ("Cochin", 1800, 1200);

SELECT * FROM SalesData;

SELECT (price_with_material * 2) + (price_without_material * 2) AS TOTAL_PRICE
FROM SalesData
WHERE city = "TVM";

CREATE DATABASE jdbc_demo;
USE jdbc_demo;