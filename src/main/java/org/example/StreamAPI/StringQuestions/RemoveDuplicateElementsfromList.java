package org.example.StreamAPI.StringQuestions;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsfromList {


    public static void main(String[] args) {
        //How do you remove duplicate elements from a list using Java 8 streams?
        List<String> list = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

    }




}
