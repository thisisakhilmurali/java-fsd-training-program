package com.example.employeejpastreamer.repository;

import com.example.employeejpastreamer.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ERepository extends JpaRepository<Employee, Integer> {
}
