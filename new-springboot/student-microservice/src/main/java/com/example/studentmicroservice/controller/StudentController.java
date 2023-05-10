package com.example.studentmicroservice.controller;

import com.example.studentmicroservice.entity.Student;
import com.example.studentmicroservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;


    // Add a student
    @PostMapping("/student")
    public ResponseEntity<Student> add(@RequestBody Student student) {
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.OK);
    }

    // Get all students
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAll() {
        List<Student> studentList = studentRepository.findAll();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    // Get Student by ID
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> get(@PathVariable Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()) {
            return new ResponseEntity<>(student.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Update Student Details
    @PutMapping("/students")
    public ResponseEntity<Student> update(@RequestBody Student student) {
        Optional<Student> oldStudent = studentRepository.findById(student.getId());
        if(oldStudent.isPresent()) {
            Student newStudent = oldStudent.get();
            newStudent.setId(student.getId());
            newStudent.setName(student.getName());
            return new ResponseEntity<>(studentRepository.save(newStudent), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete Mapping
    @DeleteMapping("/students/{id}")
    public ResponseEntity<Student> delete(@PathVariable Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()) {
            studentRepository.delete(student.get());
            return new ResponseEntity<>(student.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

























