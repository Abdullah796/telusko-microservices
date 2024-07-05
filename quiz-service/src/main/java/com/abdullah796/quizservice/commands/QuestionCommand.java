package com.abdullah796.quizservice.commands;

import lombok.Data;

import java.util.List;

@Data
public class QuestionCommand {
    private List<Long> questionIds;
}
