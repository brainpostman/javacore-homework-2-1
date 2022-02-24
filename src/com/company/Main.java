package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        nums.stream()
                .filter(n -> n > 0)
                .filter(n -> (n & 1) == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
