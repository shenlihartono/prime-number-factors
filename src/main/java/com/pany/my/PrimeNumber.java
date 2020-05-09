package com.pany.my;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public static List<Integer> factorsOf(int n) {
        List<Integer> result = new ArrayList<>();
        if (n < 2) {
            return result;
        }
        result.add(n);

        return result;
    }
}
