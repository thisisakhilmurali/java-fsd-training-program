package com.example.interviewscheduler.controller;

import com.example.interviewscheduler.entity.Scheduler;
import com.example.interviewscheduler.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interview")
public class InterviewController {

    @Autowired
    private InterviewService interviewService;

    // Adding a new interview details
    @PostMapping("/addInterview")
    public Scheduler addInterview(@RequestBody Scheduler scheduler) {
        return interviewService.addInterview(scheduler);
    }

    // Get details by email id
    @GetMapping("/getCandidate/{email}")
    public Scheduler getCandidate(@PathVariable String email) {
        return interviewService.getCandidate(email);
    }

    // Deleting an entry by email
    @DeleteMapping("/deleteCandidate/{email}")
    public String deleteCandidate(@PathVariable String email) {
        return interviewService.deleteCandidate(email);
    }

}
