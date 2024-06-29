package org.example.StreamAPI.StringQuestions;

import java.util.HashSet;
import java.util.stream.Stream;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        //Find first non-repeated character in a string?
        String str = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        HashSet<String> set = new HashSet<>();
        String s = Stream.of(str.split("")).filter(set::add).findFirst().get();
        System.out.println(s);
    }
}
