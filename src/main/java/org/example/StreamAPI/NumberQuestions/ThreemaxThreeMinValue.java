package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreemaxThreeMinValue {
    public static void main(String[] args) {
        //How do you get three maximum numbers and three minimum numbers from the given list of integers?
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> minValue = list.stream().sorted(Comparator.comparingInt(Integer::valueOf)).limit(3).collect(Collectors.toList());
        List<Integer> maxValue = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

        System.out.println("Three Min Values are "+minValue);
        System.out.println("Three Max Values are "+maxValue);
    }
}
