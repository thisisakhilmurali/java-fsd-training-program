package com.example.findthedistricts.repository;

import com.example.findthedistricts.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {
}
