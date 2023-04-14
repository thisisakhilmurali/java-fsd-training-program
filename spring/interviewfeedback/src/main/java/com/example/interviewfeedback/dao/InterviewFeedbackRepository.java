package com.example.interviewfeedback.dao;

import com.example.interviewfeedback.entity.InterviewFeedback;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewFeedbackRepository extends PagingAndSortingRepository<InterviewFeedback, Long> {
}