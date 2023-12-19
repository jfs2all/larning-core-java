package com.careerit.lcj.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathCommonQuestionsTest {

    @Test
    void biggestOfThreeNumberBiggestAtFirst() {
        int a = 300;
        int b = 100;
        int c = 200;
        int actual = MathCommonQuestions.biggestOf(a, b, c);
        int expected = 300;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void biggestOfThreeNumberBiggestAtSecond() {
        int a = 100;
        int b = 300;
        int c = 200;
        int actual = MathCommonQuestions.biggestOf(a, b, c);
        int expected = 300;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void biggestOfThreeNumberBiggestAtThird() {
        int a = 100;
        int b = 200;
        int c = 300;
        int actual = MathCommonQuestions.biggestOf(a, b, c);
        int expected = 300;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void biggestOfThreeNumberWithSameNumbers() {
        int a = 300;
        int b = 300;
        int c = 300;
        int actual = MathCommonQuestions.biggestOf(a, b, c);
        int expected = 300;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void biggestWithNegativeNumbers() {
        int a = -300;
        int b = -100;
        int c = -200;
        int actual = MathCommonQuestions.biggestOf(a, b, c);
        int expected = -100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sumOfDigitsUntilSingleDigitUsingSingleDigitNumber() {
        int num = 9;
        int actual = MathCommonQuestions.sumOfDigitsUntilSingleDigit(num);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sumOfDigitsUntilSingleDigitUsingMultipleDigitNumber() {
        int num = 9819;
        int actual = MathCommonQuestions.sumOfDigitsUntilSingleDigit(num);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

}
