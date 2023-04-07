USE demo_training;

CREATE TABLE employee (
    eid VARCHAR(6),
    name VARCHAR(32),
    email VARCHAR(64),
    phone_number VARCHAR(10),
    address VARCHAR(64),
    location VARCHAR(32),
    salary DECIMAL(10, 2)
);

SELECT * FROM employee;

DROP TABLE employee;