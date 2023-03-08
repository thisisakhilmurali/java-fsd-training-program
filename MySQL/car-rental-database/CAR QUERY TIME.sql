USE carrentalinformation;

SELECT * FROM owners;
SELECT * FROM cars;
SELECT * FROM customers;
SELECT * FROM rentals;

# Display car_id, car_name, car_type not taken for rent, sort on car_id
SELECT r.car_id, car_name, car_type FROM cars
INNER JOIN rentals r ON cars.car_id = r.car_id
WHERE pickup_date IS NULL
ORDER BY r.car_id;

# Display car_id, car_name, owner_id where car type is Hatchback or SUV\
SELECT car_id, car_name, owner_id FROM cars
WHERE car_type IN ('Hatchback', 'SUV')
ORDER BY car_id;

# Add a new column car_regno to cars table
ALTER TABLE cars ADD COLUMN car_regno VARCHAR(10);
SELECT * FROM cars;

# Maruthi Swift, Sedan Cars
SELECT car_id, car_name, car_type FROM cars
WHERE car_name LIKE 'Maruthi%' AND car_type='Sedan'
ORDER BY car_id;

# Maruthi Car owner details
SELECT DISTINCT owners.owner_id, owner_name, address, phone_no FROM owners
INNER JOIN cars c ON owners.owner_id = c.owner_id
WHERE car_name LIKE 'Maruthi%' ORDER BY owner_id;

# Rental details based on date
SELECT rental_id, car_id, customer_id, km_driven FROM rentals
WHERE pickup_date BETWEEN '2019-08-01' AND '2019-08-31';


# No of time rented by each car
SELECT car_id, count(car_id) AS NO_OF_TRIPS FROM rentals
GROUP BY car_id
ORDER BY car_id;












