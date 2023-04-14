package com.example.interviewscheduler.repository;

import com.example.interviewscheduler.entity.Scheduler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Scheduler, Long> {
    Scheduler findByEmail(String email);
    void deleteByEmail(String email);
}
