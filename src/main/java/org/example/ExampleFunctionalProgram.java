package org.example;


import java.util.Arrays;
import java.util.Comparator;

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

public class ExampleFunctionalProgram {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // lambda expression
        Calculator mc = (a, b) -> a + b;
        int result = mc.sum(3, 4);

        // stream
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result2 = Arrays.stream(data)  // IntStream
                .boxed()// Stream<Integer>
                .filter(x -> x % 2 == 0) // filter out odd numbers
                .distinct()// remove duplicates
                .sorted(Comparator.reverseOrder()) // sort in reverse order
                .mapToInt(Integer::intValue) // IntStream
                .toArray(); // int[]

    }
}
