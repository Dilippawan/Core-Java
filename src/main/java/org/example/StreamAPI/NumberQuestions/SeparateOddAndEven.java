package org.example.StreamAPI.NumberQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateOddAndEven {
    public static void main(String[] args) {
        //Given a list of integers, separate odd and even numbers?
        List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entries = collect.entrySet();
        for (Map.Entry<Boolean, List<Integer>> entry: entries){
            if(entry.getKey()){
                System.out.println("Even Numbers");
            }else{
                System.out.println("Odd Numbers");
            }
            System.out.println("-------------------------");
            for (Integer number: entry.getValue()){
                System.out.println(number);
            }
        }
    }
}
