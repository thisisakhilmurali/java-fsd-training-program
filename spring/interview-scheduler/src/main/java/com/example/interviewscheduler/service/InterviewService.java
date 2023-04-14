package com.example.interviewscheduler.service;

import com.example.interviewscheduler.entity.Scheduler;
import com.example.interviewscheduler.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InterviewService {

    @Autowired
    private InterviewRepository interviewRepository;


    // Saving the interview details
    public Scheduler addInterview(Scheduler scheduler) {
        return interviewRepository.save(scheduler);
    }

    // Retrieving the details by email id
    public Scheduler getCandidate(String email) {
        return interviewRepository.findByEmail(email);
    }

    // Delete a candidate by email id
    public String deleteCandidate(String email) {
        interviewRepository.deleteByEmail(email);
        return "Deletion Successful";
    }
}
