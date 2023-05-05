package com.example.moviedatabase.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "imdb_movies_india")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Year")
    private String year;

    @Column(name = "Duration")
    private String duration;

    @Column(name = "Genre")
    private String genre;

    @Column(name = "Votes")
    private String votes;

    @Column(name = "Director")
    private String director;

    @Column(name = "Actor 1")
    private String actorOne;

    @Column(name = "Actor 2")
    private String actorTwo;

    @Column(name = "Actor 3")
    private String actorThree;
}


