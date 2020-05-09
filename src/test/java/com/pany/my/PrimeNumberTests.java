package com.pany.my;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PrimeNumberTests {
    @Test
    void testPrimeFactors() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = PrimeNumber.factorsOf(1);
        assertThat(actual, equalTo(expected));
    }

    @Test
    void testPrimeFactorsOf2() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        List<Integer> actual = PrimeNumber.factorsOf(2);
        assertThat(actual, equalTo(expected));
    }

    @Test
    void testPrimeFactorsOf3() {
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        List<Integer> actual = PrimeNumber.factorsOf(3);
        assertThat(actual, equalTo(expected));
    }

    @Test
    void testPrimeFactorsOf4() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        List<Integer> actual = PrimeNumber.factorsOf(4);
        assertThat(actual, equalTo(expected));
    }
}
