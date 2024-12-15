package com.example.quizapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.quizapp.entity.Question;

@Mapper
public interface QuestionMapper {
    // パラメータidを受け取り、そのidに対応するレコードを取得するメソッド例
    List<Question> findById(long id);

    List<Question> findAll();
}
