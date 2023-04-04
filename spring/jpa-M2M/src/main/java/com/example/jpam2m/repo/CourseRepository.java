package com.example.jpam2m.repo;

import com.example.jpam2m.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long> {
//    List<Courses> findLessThanPrice(double price);
}
