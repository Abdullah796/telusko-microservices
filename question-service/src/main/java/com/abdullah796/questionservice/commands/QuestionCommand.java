package com.abdullah796.questionservice.commands;

import lombok.Data;

import java.util.List;

@Data
public class QuestionCommand {
    private List<Long> questionIds;
}
