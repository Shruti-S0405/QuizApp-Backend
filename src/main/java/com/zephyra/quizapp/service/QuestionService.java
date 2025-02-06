package com.zephyra.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zephyra.quizapp.Question;
import com.zephyra.quizapp.dao.QuestionDao;

@Service

public class QuestionService {

        @Autowired
        QuestionDao questionDao;

        public List<Question> getAllQuestions(){
            return questionDao.findAll();
        }
}
