package org.example.StreamAPI.StringQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAccordingtoStringLength {
    public static void main(String[] args) {
        //Given a list of strings, sort them according to increasing order of their length?
        List<String> list = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> collect = list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
