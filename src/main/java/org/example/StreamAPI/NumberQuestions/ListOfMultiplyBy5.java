package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.List;

public class ListOfMultiplyBy5 {
    public static void main(String[] args) {
        //From the given list of integers, print the numbers which are multiples of 5?
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        list.stream().filter(number->number%5==0).forEach(System.out::println);
    }
}
