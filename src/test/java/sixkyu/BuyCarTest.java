package test.java.sixkyu;

import main.java.sixkyu.BuyCar;
import org.junit.Test;

import static org.junit.Assert.*;


public class BuyCarTest {

    @Test
    public void test1() {
        int[] r = new int[]{6, 766};
        assertArrayEquals(r, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
    }
}