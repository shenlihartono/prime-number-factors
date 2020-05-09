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
}
