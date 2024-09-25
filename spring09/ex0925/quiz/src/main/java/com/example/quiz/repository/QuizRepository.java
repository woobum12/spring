package com.example.quiz.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.quiz.entity.Quiz;

/** Quiz테이블: repositoryImpl */
public interface QuizRepository extends CrudRepository<Quiz, Integer> {

}
