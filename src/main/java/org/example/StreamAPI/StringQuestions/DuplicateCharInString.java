package org.example.StreamAPI.StringQuestions;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharInString {
    public static void main(String[] args) {
        //Print duplicate characters in a string?
        String str = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        HashSet<String> set = new HashSet<>();
        List<String> collect = Stream.of(str.split("")).filter(character -> !set.add(character))
                .distinct().collect(Collectors.toList());
        System.out.println(collect);

    }
}
