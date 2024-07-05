package com.abdullah796.questionservice.controllers;

import com.abdullah796.questionservice.commands.QuestionCommand;
import com.abdullah796.questionservice.persistence.entities.Question;
import com.abdullah796.questionservice.services.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
public class QuestionController {

    private QuestionService questionService;

    @PostMapping("/questions")
    public List<Question> getAll(@RequestBody QuestionCommand questionCommand) {
        return questionService.getAllQuestions(questionCommand);
    }

    @GetMapping("/random-questions")
    public List<Long> getRandomQuestions() {
        return questionService.getRandomQuestions().stream().map(Question::getId).collect(Collectors.toList());
    }

    @PostMapping("/question")
    public Question save(@RequestBody Question question) {
        return questionService.saveQuestion(question);
    }
}
