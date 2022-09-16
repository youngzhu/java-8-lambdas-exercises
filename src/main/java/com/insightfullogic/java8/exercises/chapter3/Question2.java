package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.List;
import java.util.stream.Stream;

public class Question2 {
    // Q3
    public static int countBandMembersInternal(List<Artist> artists) {
        /*
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMembers();
            totalMembers += members.count();
        }
        return totalMembers;
         */

        return (int) artists.stream()
                        // flatMap 是对集合的集合进行操作
                        .flatMap(artist -> artist.getMembers())
                        .count();
    }
}
