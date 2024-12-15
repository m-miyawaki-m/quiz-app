package com.example.quizapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.quizapp.entity.Question;
import com.example.quizapp.mapper.QuestionMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionMapper questionMapper;
    private static final Logger logger = LoggerFactory.getLogger(QuestionService.class);

    public List<Question> findById(long id) {
        logger.info("findById called");
        return questionMapper.findById(id);
    }
    
    public List<Question> findAll() {
        logger.info("findAll called");
        return questionMapper.findAll();
    }
}
