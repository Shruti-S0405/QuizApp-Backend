package com.zephyra.quizapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")

public class QuestionController {
    @GetMapping("allQuestions")

    public String getAllQuestions(){
        return "Hi! Welcome to the Quiz Application :)";
    }
}
