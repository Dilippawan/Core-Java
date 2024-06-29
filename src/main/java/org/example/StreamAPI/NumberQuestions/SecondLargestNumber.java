package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        //Find second largest number in an integer array?
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer i = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);
    }
}
