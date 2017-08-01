package com.benearley.googlefoobar.challenges;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by 578803 on 4/11/2017.
 */
public class Challenge2 {

    @Test
    public void test(){
        assert Arrays.equals(answer(new int[]{4,3,10,2,8},12),(new int[]{2,3}));
        assert Arrays.equals(answer(new int[]{1,2,3,4},15),(new int[]{-1,-1}));
    }

    public static int[] answer(int[] l, int t){
        int length = l.length;
        for (int i = 0; i < length; i++){
            int total = l[i];
            if (total == t){
                return new int[]{i, i};
            }
            for (int j = i + 1; j < length; j++) {
                total += l[j];
                if (total == t){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
