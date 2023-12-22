package com.careerit.lcj.day9.quiz;

import lombok.SneakyThrows;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizService {

    @SneakyThrows
    public void startQuiz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String username = sc.nextLine();
        System.out.println("Welcome : "+username);
        System.out.println("Quiz is going to start, please wait....");
        TimeUnit.SECONDS.sleep(2);
        List<QuestionDetails> questionDetailsList = JsonUtil.loadQuestions();
        System.out.println("Total number of questions : "+questionDetailsList.size());
        int score = 0;
        for(QuestionDetails questionDetails:questionDetailsList){
            System.out.println(questionDetails.getQuestion());
            List<String> options = questionDetails.getOptions();
            for(int i=0;i<options.size();i++){
                System.out.println((i+1)+") "+options.get(i));
            }
            System.out.println("Enter your answer : ");
            int userAnswer = sc.nextInt();
            if(userAnswer == questionDetails.getAnswer()) {
                score++;
            }
        }
        System.out.println("Please wait we are calculating your score....");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Total number of questions : "+questionDetailsList.size());
        System.out.println("Total number of correct answers : "+score);
        System.out.println("Total number of wrong answers : "+(questionDetailsList.size()-score));
        System.out.println("Your score is : "+score);

    }
}
