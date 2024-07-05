package com.abdullah796.quizservice.controllers;


import com.abdullah796.quizservice.persistence.entities.Quiz;
import com.abdullah796.quizservice.services.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class QuizController {

    private QuizService quizService;

    @GetMapping("/quiz/{id}")
    public Quiz getQuiz(@PathVariable Long id) {
        return quizService.getQuizById(id);
    }

    @PostMapping("/quiz")
    public Quiz save() {
        return quizService.saveQuiz();
    }
}
