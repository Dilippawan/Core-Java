package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortReverseOrderDecimals {
    public static void main(String[] args) {
        //How do you sort the given list of decimals in reverse order?
        List<Double> list = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
