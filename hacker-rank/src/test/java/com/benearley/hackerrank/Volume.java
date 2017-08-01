package com.benearley.hackerrank;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 578803 on 2/27/2017.
 */
public class Volume {

    @Test
    public void test(){

        Scanner scanner = new Scanner(System.in);
        List<String> nums = new ArrayList<>();
        while (scanner.hasNext()){
            nums.add(scanner.next());
        }

        Iterator<String> it = nums.iterator();

        String a = it.next();

    }

    public int getVolume(Object a){
        int i = (Integer) a;
        return i;
    }

}
