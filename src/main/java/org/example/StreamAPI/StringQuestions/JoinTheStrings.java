package org.example.StreamAPI.StringQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinTheStrings {
    public static void main(String[] args) {
        //Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        List<String> list = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String collect = list.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect);
    }
}
