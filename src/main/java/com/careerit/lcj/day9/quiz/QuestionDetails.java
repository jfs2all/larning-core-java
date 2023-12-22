package com.careerit.lcj.day9.quiz;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestionDetails {
    private long qid;
    private String question;
    private List<String> options;
    private int answer;
}
