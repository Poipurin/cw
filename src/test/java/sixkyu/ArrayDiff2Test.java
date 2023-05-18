package test.java.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import main.java.sixkyu.ArrayDiff2;

public class ArrayDiff2Test {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[]{2}, ArrayDiff2.arrayDiff(new int[]{1, 2}, new int[]{1}));
        assertArrayEquals(new int[]{2, 2}, ArrayDiff2.arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, ArrayDiff2.arrayDiff(new int[]{1, 2, 2}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2, 2}, ArrayDiff2.arrayDiff(new int[]{1, 2, 2}, new int[]{}));
        assertArrayEquals(new int[]{}, ArrayDiff2.arrayDiff(new int[]{}, new int[]{1, 2}));
    }
}

