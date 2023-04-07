CREATE TABLE Department (

    department_id INT NOT NULL AUTO_INCREMENT,

    department_name VARCHAR(50) NOT NULL,

    manager_id INT,

    location VARCHAR(100),

    PRIMARY KEY (department_id)

);

CREATE TABLE Employee (

    employee_id INT NOT NULL AUTO_INCREMENT,

    first_name VARCHAR(50) NOT NULL,

    last_name VARCHAR(50) NOT NULL,

    email VARCHAR(100) UNIQUE NOT NULL,

    phone VARCHAR(20),

    hire_date DATE NOT NULL,

    job_title VARCHAR(50) NOT NULL,

    department_id INT NOT NULL,

    salary DECIMAL(10,2) NOT NULL,

    PRIMARY KEY (employee_id),

    FOREIGN KEY (department_id) REFERENCES Department(department_id)

);
