INSERT INTO rentals (rental_id, customer_id, car_id, pickup_date, return_date, km_driven, fare_amount)
VALUES
    ('R001', 'C007', 'V004', '2018-03-10', '2018-03-10', 800, 9000),
    ('R002', 'C001', 'V007', '2018-03-11', '2018-03-12', 200, 3000),
    ('R003', 'C007', 'V003', '2018-04-15', '2018-03-15', 100, 1500),
    ('R004', 'C007', 'V001', '2018-05-16', '2018-03-18', 1000, 10000),
    ('R005', 'C004', 'V005', '2018-05-10', '2018-03-12', 900, 11000),
    ('R006', 'C004', 'V006', '2018-05-20', '2018-03-21', 200, 2500);

INSERT INTO cars (car_id, car_name, car_type, owner_id)
VALUES
    ('V001', 'Swift', 'Hatchback', 'W001'),
    ('V003', 'City', 'Sedan', 'W002'),
    ('V004', 'Fortuner', 'SUV', 'W003'),
    ('V005', 'Alto', 'Hatchback', 'W004'),
    ('V006', 'Elantra', 'Sedan', 'W005'),
    ('V007', 'Innova', 'SUV', 'W006');

INSERT INTO owners (owner_id, owner_name, address, phone_no, email_id)
VALUES
    ('W001', 'Jack', 'Delhi', 9876543423, 'jack@yahoo.com'),
    ('W002', 'Ryan', 'Mumbai', 9876543423, 'ryan@yahoo.com'),
    ('W003', 'Mike', 'Bangalore', 9826543423, 'mike@yahoo.com'),
    ('W004', 'James', 'TVM', 9879873423, 'james@yahoo.com'),
    ('W005', 'Greer', 'Kochi', 9234543423, 'greer@yahoo.com'),
    ('W006', 'Eliza', 'Noida', 9876987423, 'eliza@yahoo.com');

INSERT INTO customers (customer_id, customer_name, address, phone_no, email_id)
VALUES
    ('C001', 'Tommy', 'Delhi', 2342654345, 'tommy@yahoo.com'),
    ('C002', 'Joey', 'Mumbai', 2345676545, 'joey@yahoo.com'),
    ('C003', 'Shaz', 'Gurgaon', 2345454345, 'shaz@yahoo.com'),
    ('C004', 'Shahanna', 'NCR', 2345234345, 'shahanna@yahoo.com'),
    ('C005', 'Joe', 'Noida', 2345654654, 'joe@yahoo.com'),
    ('C006', 'Martin', 'Bangalore', 2347654345, 'martin@yahoo.com'),
    ('C007', 'Fraz', 'Kochi', 2345658765, 'fraz@yahoo.com');

INSERT INTO rentals (rental_id, customer_id, car_id, pickup_date, return_date, km_driven, fare_amount)
VALUES ('R008', 'C004', 'V007', NULL, NULL, 300, 4000), ('R009', 'C005', 'V006', NULL, NULL, 370, 7000);

INSERT INTO cars (car_id, car_name, car_type, owner_id, car_regno)
VALUES ('V010', 'Maruthi Dezire', 'Sedan', 'W006', NULL),
     ('V011', 'Maruthi Tour S', 'Sedan', 'W002', NULL);

INSERT INTO rentals (rental_id, customer_id, car_id, pickup_date, return_date, km_driven, fare_amount)
VALUES
    ('R011', 'C007', 'V004', '2019-08-10', '2018-03-10', 800, 9000),
    ('R012', 'C001', 'V007', '2019-08-01', '2018-03-12', 200, 3000),
    ('R013', 'C007', 'V003', '2019-08-15', '2018-03-15', 100, 1500),
    ('R010', 'C007', 'V001', '2019-08-16', '2018-03-18', 1000, 10000);

SELECT * FROM owners;
SELECT * FROM cars;
SELECT * FROM customers;
SELECT * FROM rentals;
