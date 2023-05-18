package main.java.sixkyu;

import java.util.ArrayList;
import java.util.List;

public class ArrayDiff2 {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            boolean match = false;
            for (int j = 0; j < b.length; j++) {
                int compareValue = b[j];
                if (value == compareValue) {
                    match = true;
                    break;
                }
            }
            if (!match) {
                diff.add(value);
            }
        }
        int[] result = new int[diff.size()];
        for (int i = 0; i < diff.size(); i++) {
            result[i] = diff.get(i);
        }
        return result;
    }
}
