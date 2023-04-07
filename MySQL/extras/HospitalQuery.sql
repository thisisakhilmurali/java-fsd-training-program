USE demo_training;

CREATE TABLE orders (
    order_id VARCHAR(10),
    order_date DATE,
    person_name VARCHAR(10),
    location VARCHAR(10),
    item VARCHAR(10),
    price DECIMAL(10, 2)
);

INSERT INTO orders (order_id, order_date, person_name, location, item, price)
VALUES ('1000', '2023-01-01', 'AB1', 'TVM', 'Chappati', 100),
       ('1001', '2023-01-01', 'AB2', 'Cochin', 'Chappati', 200),
       ('1002', '2023-01-01', 'AB3', 'Hyderabad', 'Chappati', 300),
       ('1003', '2023-01-02', 'AB4', 'TVM', 'Chappati', 200),
       ('1004', '2023-01-02', 'AB5', 'Hyderabad', 'Chappati', 300),
       ('1005', '2023-01-03', 'AB6', 'TVM', 'Chappati', 600),
       ('1006', '2023-01-03', 'AB7', 'TVM', 'Chappati', 700),
       ('1000', '2023-01-03', 'AB1', 'TVM', 'Chappati', 400);

SELECT location, price, order_date
FROM orders
GROUP BY order_date ;

