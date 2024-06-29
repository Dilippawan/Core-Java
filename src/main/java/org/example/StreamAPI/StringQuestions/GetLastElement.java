package org.example.StreamAPI.StringQuestions;

import java.util.Arrays;
import java.util.List;

public class GetLastElement {
    public static void main(String[] args) {
        //How do you get last element of an array?
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        list.stream().skip(list.size()-1).forEach(System.out::println);
    }
}
