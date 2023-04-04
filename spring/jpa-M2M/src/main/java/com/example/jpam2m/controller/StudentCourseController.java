package com.example.jpam2m.controller;

import com.example.jpam2m.entity.Courses;
import com.example.jpam2m.entity.Student;
import com.example.jpam2m.repo.CourseRepository;
import com.example.jpam2m.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public Student saveStudentWithCourse(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{student}")
    public Student findStudentById(@PathVariable Long student) {
        return studentRepository.findById(student).orElse(null);
    }

    @GetMapping("/find/{name}")
    public List<Student> findStudentByName(@PathVariable String name) {
        return studentRepository.findByName(name);
    }

//    @GetMapping("/search/{price}")
//    public List<Courses> findCourseLessThanPrice(@PathVariable double price) {
//        return courseRepository.findLessThanPrice(price);
//    }

}
