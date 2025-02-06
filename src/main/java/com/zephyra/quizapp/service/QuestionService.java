package com.zephyra.quizapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zephyra.quizapp.Model.Question;
import com.zephyra.quizapp.Repository.QuestionRepository;

@Service
public class QuestionService {
        @Autowired
        QuestionRepository questionDao;
        public List<Question> getAllQuestions(){
            return questionDao.findAll();
        }
}
