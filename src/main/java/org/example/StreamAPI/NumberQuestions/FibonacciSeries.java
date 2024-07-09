package org.example.StreamAPI.NumberQuestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci Series
        //Output : 0 1 1 2 3 5 8 13 21 34
        List<Integer> collect = Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .map(fib -> fib[0]).limit(10).collect(Collectors.toList());
        System.out.println(collect);
    }
}
