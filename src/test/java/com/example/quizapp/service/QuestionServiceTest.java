package com.example.quizapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.quizapp.entity.Question;

@SpringBootTest
public class QuestionServiceTest {
    @Autowired
    private QuestionService questionService;

    private static final Logger logger = LoggerFactory.getLogger(QuestionServiceTest.class);

    @Test
    void testFindById() {
        logger.info("testFindById start");
        long testId = 1;
        List<Question> questions = questionService.findById(testId);
        assertNotNull(questions, "questions should not be null");
        logger.info("testFindById retrieved: " + questions.size() + " records");
    }

    @Test
    void testFindAll() {
        logger.info("testFindAll start");
        List<Question> questions = questionService.findAll();
        assertNotNull(questions, "questions should not be null");
        logger.info("testFindAll retrieved: " + questions.size() + " records");
    }
}
