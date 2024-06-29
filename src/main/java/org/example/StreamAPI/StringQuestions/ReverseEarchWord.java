package org.example.StreamAPI.StringQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEarchWord {
    public static void main(String[] args) {
        //Reverse each word of a string using Java 8 streams?
        String s = "Java Concept Of The Day";
        String collect = Stream.of(s.split(" ")).map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
