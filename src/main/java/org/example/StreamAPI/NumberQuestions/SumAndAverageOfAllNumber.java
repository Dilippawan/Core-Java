package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;

public class SumAndAverageOfAllNumber {
    public static void main(String[] args) {
        //Given an integer array, find sum and average of all elements?
        int[] ints = {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(ints).sum();
        System.out.println(sum);
        double asDouble = Arrays.stream(ints).average().getAsDouble();
        System.out.println(asDouble);
    }
}
