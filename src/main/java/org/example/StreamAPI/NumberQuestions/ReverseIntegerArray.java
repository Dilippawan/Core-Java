package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        //Reverse an integer array
        int[] array = new int[]{5, 1, 7, 3, 9, 6};
        int[] array1 = IntStream.range(0,array.length).map(e -> array[array.length - e -1]).toArray();
        System.out.println(Arrays.toString(array1));
    }

}
