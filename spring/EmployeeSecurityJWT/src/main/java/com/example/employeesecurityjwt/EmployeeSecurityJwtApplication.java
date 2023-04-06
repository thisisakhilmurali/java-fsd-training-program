package com.example.employeesecurityjwt;

import com.example.employeesecurityjwt.entity.User;
import com.example.employeesecurityjwt.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@SpringBootApplication(scanBasePackages={"com.example.employeesecurityjwt"})
public class EmployeeSecurityJwtApplication {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "user0", "pwd0", "user0@gmail.com","12345678"),
                new User(102, "user1", "pwd1", "user1@gmail.com","12345678"),
                new User(103, "user2", "pwd2", "user2@gmail.com","12345678"),
                new User(104, "user3", "pwd3", "user3@gmail.com","12345678")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }


    public static void main(String[] args) {
        SpringApplication.run(EmployeeSecurityJwtApplication.class, args);
    }

}
