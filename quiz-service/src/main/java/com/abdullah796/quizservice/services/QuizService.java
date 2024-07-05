package com.abdullah796.quizservice.services;

import com.abdullah796.quizservice.feign.QuizInterface;
import com.abdullah796.quizservice.persistence.entities.Quiz;
import com.abdullah796.quizservice.persistence.repositories.QuizRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class QuizService {

    private final QuizRepository quizRepository;
    private final QuizInterface quizInterface;

    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }

    public Quiz saveQuiz() {
        List<Long> questionIds = quizInterface.getRandomQuestions();
        Quiz quiz = new Quiz();
        quiz.setQuestionIds(questionIds);
        return quizRepository.save(quiz);
    }
}
