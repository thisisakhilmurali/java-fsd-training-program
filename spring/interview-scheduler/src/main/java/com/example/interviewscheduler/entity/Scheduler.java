package com.example.interviewscheduler.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "scheduler")
public class Scheduler {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String phnumber;
    private String skills;
    private String experience;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date date;
    private String time;
    private String link;
    private String poc;

}
