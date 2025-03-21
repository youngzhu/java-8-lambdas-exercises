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
        return artists.stream()
                .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
                .collect(toList());
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        return input.stream()
                // 为什么加{}不行？？
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(toList());
    }
}
