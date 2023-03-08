SELECT * FROM employee;
SELECT * FROM department;

# Write a query to fetch the first_name from the Employee table in the upper case and use the ALIAS name as EmpName.
SELECT UPPER(first_name) AS EmpName FROM employee;


# Write a query to fetch the number of employees working in the department ‘HR’.
SELECT COUNT(department_name) FROM employee
JOIN department d ON d.department_id = employee.department_id
WHERE d.department_name = 'HR';


# Write a query to get the current date.
SELECT CURRENT_DATE;


# Write a query to retrieve the first four characters of  EmpLname from the EmployeeInfo table.
SELECT LEFT(last_name, 4) FROM employee;
SELECT SUBSTRING(last_name, 1, 4) FROM employee;


# Write a query to fetch only the place name(string before brackets) from the Address column of EmployeeInfo table.
SELECT SUBSTRING_INDEX(location, '(', 1) AS Location FROM department;


# Write a query to create a new table that consists of data and structure copied from the other table.
CREATE TABLE new_table_employee LIKE employee;
INSERT INTO new_table_employee SELECT * FROM employee;
SELECT  * FROM new_table_employee;


# Write q query to find all the employees whose salary is between 50000 to 100000.
SELECT * FROM employee
         WHERE salary BETWEEN 50000 AND 100000;


# Write a query to find the names of employees that begin with ‘S’
SELECT first_name, last_name FROM employee WHERE first_name LIKE 'S%';


# Write a query to fetch top N records.
SELECT * FROM employee ORDER BY salary DESC;


# Write a query to retrieve the EmpFname and EmpLname in a single column as “FullName”. The first name and the last name must be separated with space.
SELECT CONCAT_WS(' ', first_name, last_name) AS FullName FROM employee ;





