package com.zephyra.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zephyra.quizapp.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    
}
