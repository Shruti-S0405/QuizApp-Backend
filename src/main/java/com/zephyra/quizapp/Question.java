package com.zephyra.quizapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Integer Id;
    private String difficultyLevel;
    private String questionText;
    private String option1;
    private String option2;
    private String option3;
    private String correctAnswer;

}
