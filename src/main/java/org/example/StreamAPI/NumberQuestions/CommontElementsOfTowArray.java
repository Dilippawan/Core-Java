package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommontElementsOfTowArray {
    public static void main(String[] args) {
        //How do you find common elements between two arrays?
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(collect);

    }
}
