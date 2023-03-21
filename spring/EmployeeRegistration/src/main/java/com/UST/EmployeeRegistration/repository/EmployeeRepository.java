package com.UST.EmployeeRegistration.repository;

import com.UST.EmployeeRegistration.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
