package org.example.StreamAPI.StringQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findMoreRepeatingWord {
    public static void main(String[] args) {
        //How do you find the most repeated element in an array?
        List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        String key = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(key);
    }
}
