package com.example.jpam2m.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="STUDENT_TABLE")
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private String dept;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name="STUDENT_COURSE_TABLE",

            joinColumns = {
                    @JoinColumn(name="student_id", referencedColumnName = "id")
            },

            inverseJoinColumns = {
                    @JoinColumn(name="course_id", referencedColumnName = "id")
            }
    )
    @JsonBackReference
    private Set<Courses> course;

    public Student(Long id, String name, int age, String dept, Set<Courses> course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.course = course;
    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Set<Courses> getCourse() {
        return course;
    }

    public void setCourse(Set<Courses> course) {
        this.course = course;
    }
}
