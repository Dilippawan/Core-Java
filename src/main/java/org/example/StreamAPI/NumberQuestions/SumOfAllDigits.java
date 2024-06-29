package org.example.StreamAPI.NumberQuestions;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        //Find sum of all digits of a number in Java 8?
        int i = 15623;
        int sum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
