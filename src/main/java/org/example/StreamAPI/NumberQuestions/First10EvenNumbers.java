package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class First10EvenNumbers {
    public static void main(String[] args) {
        //Print first 10 even numbers
        int[] array = IntStream.iterate(2, e -> e + 2).limit(10).toArray();
        System.out.println(Arrays.toString(array));
    }
}
