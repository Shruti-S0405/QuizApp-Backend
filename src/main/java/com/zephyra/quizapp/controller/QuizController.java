package com.zephyra.quizapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zephyra.quizapp.Model.QuestionWrapper;
import com.zephyra.quizapp.Model.Response;
import com.zephyra.quizapp.service.QuizService;

@RestController
@RequestMapping("quiz")

public class QuizController {
    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title ){
        return quizService.createQuiz(category, numQ, title);
    }

    @GetMapping("get/{Id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer Id){
        return quizService.getQuizQuestions(Id);
    }

    @PostMapping("submit/{Id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer Id, @RequestBody List<Response> response){
        return quizService.submitQuiz(Id, response);
    }
}
