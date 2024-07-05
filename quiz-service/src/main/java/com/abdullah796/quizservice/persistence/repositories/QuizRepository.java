package com.abdullah796.quizservice.persistence.repositories;

import com.abdullah796.quizservice.persistence.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
