package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Question1 {
    public static int addUp(Stream<Integer> numbers) {
        /*
        第一个参数是初始值
        第二个参数是二元操作函数 BinaryOperator
         */
        return numbers.reduce(0, (acc, num) -> acc+num);
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        return Exercises.replaceThisWithSolution();
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        return Exercises.replaceThisWithSolution();
    }
}
