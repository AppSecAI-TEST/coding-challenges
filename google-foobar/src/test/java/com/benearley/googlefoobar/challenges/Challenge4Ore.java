package com.benearley.googlefoobar.challenges;

import org.junit.Test;

import java.util.Arrays;

public class Challenge4Ore {

    @Test
    public void test(){
        assert Arrays.equals(new int[]{7, 6, 8, 21},
                answer(new int[][]{{0, 2, 1, 0, 0}, {0, 0, 0, 3, 4}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
        }));

        assert Arrays.equals(new int[]{0, 3, 2, 9, 14},
                answer(new int[][]{{0, 1, 0, 0, 0, 1}, {4, 0, 0, 3, 2, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}
                }));

    }

    private static int[] answer(int[][] m){
        for (int i = 0; i < m.length; i++){
            if (m[0][i] != 0){

            }
        }

        return null;
    }

    private static int getLevelTotal(int[] l){
        int t = 0;
        for (int i : l){
            t+=i;
        }
        return t;
    }

}
