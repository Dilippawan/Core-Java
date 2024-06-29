package org.example.StreamAPI.StringQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckStringsAreAnagramsOrNot {
    public static void main(String[] args) {
        //Java 8 program to check if two strings are anagrams or not?
        String s1 = "RaceCar";
        String s2 = "CarRace";

        String s11 = Stream.of(s1.split("")).sorted().collect(Collectors.joining(""));
        String s22 = Stream.of(s2.split("")).sorted().collect(Collectors.joining(""));
        if(s11.equals(s22)){
            System.out.println(s1+" and "+s2+" are Anagrams String");
        }else{
            System.out.println(s1+" and "+s2+" are not Anagrams String");
        }

    }
}
