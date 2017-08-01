package com.benearley.hackerrank;

import org.junit.Test;

import java.util.Arrays;

public class VeryBigSum {

    @Test
    public void test(){
        int[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        int t = 0;
        for (int i : ar){
            System.out.println(i);
            t += i;
        }
        System.out.println(Arrays.stream(ar).mapToLong(i -> (long) i).sum());
    }

}
