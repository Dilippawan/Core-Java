package org.example.StreamAPI.NumberQuestions;

import java.util.stream.IntStream;

public class SumOfFirstTenNumbers {
    public static void main(String[] args) {
        //How do you find sum of first 10 natural numbers?
        int sum = IntStream.iterate(1, e -> e + 1).limit(10).sum();
        System.out.println(sum);
    }
}
