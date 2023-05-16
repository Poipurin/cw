package main.java.sixkyu;

import java.util.Arrays;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(value -> Arrays.stream(b).noneMatch(compareValue -> compareValue == value))
                .toArray();
    }
}