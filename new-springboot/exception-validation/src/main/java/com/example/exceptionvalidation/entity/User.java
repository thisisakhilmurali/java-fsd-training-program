package com.example.exceptionvalidation.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_details")
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @NotBlank
    @NotNull(message = "Name shouldn't be null")
    private String name;

    @Email(regexp = "^(.+)@(\\S+)$", message = "invalid email address")
    private String email;

    @Pattern(regexp = "\\d{10}$", message = "Invalid mobile number")
    private String mobile;

    private String gender;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank(message = "Nationality should not be empty")
    private String nationality;

}
