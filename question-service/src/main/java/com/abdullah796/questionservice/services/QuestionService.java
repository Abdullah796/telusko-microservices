package com.abdullah796.questionservice.services;


import com.abdullah796.questionservice.commands.QuestionCommand;
import com.abdullah796.questionservice.persistence.entities.Question;
import com.abdullah796.questionservice.persistence.repositories.QuestionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getAllQuestions(QuestionCommand questionCommand) {
        return questionRepository.findAllByIdIn(questionCommand.getQuestionIds());
    }

    public List<Question> getRandomQuestions() {
        return questionRepository.findAllRandomQuestions();
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }
}
