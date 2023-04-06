package com.example.employeesecurityjwt.repo;

import com.example.employeesecurityjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // getters will be triggered
    User findByUsername(String username);
}