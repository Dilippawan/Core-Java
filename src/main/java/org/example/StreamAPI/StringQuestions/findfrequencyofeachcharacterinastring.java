package org.example.StreamAPI.StringQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findfrequencyofeachcharacterinastring {
    public static void main(String[] args) {
        //How do you find frequency of each character in a string using Java 8 streams?
        String str = "Java Concept Of The Day";
        Map<String, Long> collect = Stream.of(str.split("")).filter(e -> !e.equalsIgnoreCase(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
