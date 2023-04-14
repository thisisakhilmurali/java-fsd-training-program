package com.example.interviewfeedback.entity;

import javax.persistence.*;

@Entity
@Table(name = "feedbacks")
public class InterviewFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String candidateName;
    private String position;
    private String interviewerName;
    private String interviewerId;
    private String status;
    private int rating;

    public InterviewFeedback(Long id, String userId, String candidateName, String position, String interviewerName, String interviewerId, String status, int rating) {
        this.id = id;
        this.userId = userId;
        this.candidateName = candidateName;
        this.position = position;
        this.interviewerName = interviewerName;
        this.interviewerId = interviewerId;
        this.status = status;
        this.rating = rating;
    }

    public InterviewFeedback() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public String getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(String interviewerId) {
        this.interviewerId = interviewerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
