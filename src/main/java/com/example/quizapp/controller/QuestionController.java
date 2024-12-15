package com.example.quizapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizapp.entity.QueryForm;
import com.example.quizapp.entity.Question;
import com.example.quizapp.service.QuestionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;
    private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);

    // curl -v "http://localhost:8080/questions?id=1"
    @GetMapping("/questions")
    public List<Question> getQuestions(@ModelAttribute QueryForm form) {
        long id = form.getId();
        logger.info("GET /questions called with id={}", id);
        return questionService.findById(id);
    }
    
    // curl -v "http://localhost:8080/questions/all"
    @GetMapping("/questions/all")
    public List<Question> getAllQuestions() {
        logger.info("GET /questions called with all");
        return questionService.findAll();
    }
    
}
