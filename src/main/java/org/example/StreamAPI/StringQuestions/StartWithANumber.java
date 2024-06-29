package org.example.StreamAPI.StringQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithANumber {
    public static void main(String[] args) {
        //Given a list of strings, find out those strings which start with a number?
        List<String> list = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        List<String> collect = list.stream().filter(word -> Character.isDigit(word.charAt(0))).collect(Collectors.toList());
        System.out.println(collect);
    }
}
