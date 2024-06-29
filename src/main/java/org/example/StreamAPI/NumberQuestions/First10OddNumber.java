package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class First10OddNumber {
    public static void main(String[] args) {
        //First 10 odd numbers
        int[] array = IntStream.iterate(1, e -> e + 2).limit(10).toArray();
        System.out.println(Arrays.toString(array));
    }
}
