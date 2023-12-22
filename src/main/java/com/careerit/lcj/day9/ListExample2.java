package com.careerit.lcj.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ListExample2 {

    public static void main(String[] args) {

        int[] questions = getQuestionsFromQuestionBank();

        // Pick the 20 questions randomly from the question bank and ensure that there is no duplicate questions

        List<Integer> questionList = new ArrayList<>();

        while(questionList.size() != 20) {
            int rn = ThreadLocalRandom.current().nextInt(0, questions.length);
            int question = questions[rn];
            if(!questionList.contains(question)) {
                questionList.add(question);
            }
        }
        System.out.println(questionList);

    }

    public static int[] getQuestionsFromQuestionBank() {
        int[] arr = new int[100];
        int index = 1000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = index++;
        }
        return arr;
    }

}
