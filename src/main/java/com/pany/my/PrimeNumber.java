package com.pany.my;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public static List<Integer> factorsOf(int n) {
        List<Integer> result = new ArrayList<>();
        int divisor = 2;
        while (n > 1) {
            while (n % divisor == 0) {
                result.add(divisor);
                n /= divisor;
            }
            divisor++;
        }

        return result;
    }
}
