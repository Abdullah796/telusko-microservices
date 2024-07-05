package com.abdullah796.quizservice.feign;

import com.abdullah796.quizservice.commands.QuestionCommand;
import com.abdullah796.quizservice.persistence.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {
    @PostMapping("/questions")
    List<Question> getAll(@RequestBody QuestionCommand questionCommand);

    @GetMapping("/random-questions")
    List<Long> getRandomQuestions();
}
