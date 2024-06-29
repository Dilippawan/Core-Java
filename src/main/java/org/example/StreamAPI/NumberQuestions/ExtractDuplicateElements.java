package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractDuplicateElements {
    public static void main(String[] args) {
        //How do you extract duplicate elements from an array?
        List<Integer> list = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        HashSet<Integer> set = new HashSet<>();
        List<Integer> collect = list.stream().filter(number -> !set.add(number)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
