package com.app.backend.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.backend.model.Question;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

    Question findQuestionByPostedbyAndTimestampAndTopic(String user,String timestamp, String topic);
}
