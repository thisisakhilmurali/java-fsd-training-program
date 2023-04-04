package com.example.jpam2m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication(scanBasePackages={"com.example.jpam2m"})
public class JpaM2MApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaM2MApplication.class, args);
    }

}
