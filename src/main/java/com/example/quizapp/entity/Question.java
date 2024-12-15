package com.example.quizapp.entity;

import lombok.Data;

@Data
public class Question {
    private long questionId;
    private String questionText;
    private String mediaUrl;
    private long genreId;
    private long fieldId;
    private long mockId;
    private int difficulty;
    // created_at, updated_atも必要に応じて定義
}
