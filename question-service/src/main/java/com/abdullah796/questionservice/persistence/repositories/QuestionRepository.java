package com.abdullah796.questionservice.persistence.repositories;

import com.abdullah796.questionservice.persistence.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query(value = "SELECT * FROM questions ORDER BY RAND() LIMIT 5", nativeQuery = true)
    List<Question> findAllRandomQuestions();

    List<Question> findAllByIdIn(List<Long> ids);
}
