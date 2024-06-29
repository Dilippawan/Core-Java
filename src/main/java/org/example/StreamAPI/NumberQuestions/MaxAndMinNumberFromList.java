package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumberFromList {
    public static void main(String[] args) {
        //Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer minValue = list.stream().min(Comparator.comparingInt(Integer::valueOf)).get();
        Integer maxValue = list.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
        System.out.println("Min Value "+minValue+" & Max Value "+maxValue);

    }
}
