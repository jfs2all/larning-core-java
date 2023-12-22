package com.careerit.lcj.day9.quiz;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public final class JsonUtil {

    private JsonUtil() {
    }

    public static List<QuestionDetails> loadQuestions() {
        ObjectMapper objMapper = new ObjectMapper();
        List<QuestionDetails> questionDetailsList = new ArrayList<>();
        try {
            questionDetailsList = objMapper.readValue(JsonUtil.class.getResourceAsStream("/questions.json"),
                    new TypeReference<List<QuestionDetails>>() {
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionDetailsList;
    }
}
