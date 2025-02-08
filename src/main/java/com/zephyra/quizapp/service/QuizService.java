package com.zephyra.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.*;
import com.zephyra.quizapp.Model.Quiz;
import com.zephyra.quizapp.Repository.QuestionRepository;
import com.zephyra.quizapp.Model.Question;
import com.zephyra.quizapp.Repository.QuizRepository;

@Service
public class QuizService {
    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    QuizRepository quizRepository;
    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionRepository.findRandomQuestionsByCategory(category, numQ);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepository.save(quiz);
        return new ResponseEntity<>("Successs", HttpStatus.CREATED);
    }
}
