package com.benearley.reddit.challenges.e314;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

public class ConcatenatedIntegers {

    public static List<Long> getLargestAndSmallestCat(List<Integer> inputs){
        List<Long> outputs = Lists.newArrayList();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Collections.sort(inputs);
        inputs.forEach(sb1::append);
        outputs.add(Long.valueOf(sb1.toString()));
        Collections.reverse(inputs);
        inputs.forEach(sb2::append);
        outputs.add(Long.valueOf(sb2.toString()));

        return outputs;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Lists.newArrayList(5, 56, 50);
        getLargestAndSmallestCat(inputList).forEach(l -> System.out.print(l + " "));
    }


}
