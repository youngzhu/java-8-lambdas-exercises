package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringExercises {

    // Question 6
    public static int countLowercaseLetters(String string) {
        return (int) string.chars()
                .filter(c -> 'a' <= c && 'z' >= c)
                .count();
    }

    // Question 7
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return Exercises.replaceThisWithSolution();
    }

}
