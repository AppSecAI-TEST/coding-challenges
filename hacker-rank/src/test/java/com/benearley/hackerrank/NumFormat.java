package com.benearley.hackerrank;

import org.junit.Test;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by 578803 on 2/27/2017.
 */
public class NumFormat {

    @Test
    public void test(){
        double payment = 12324.134;
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String inNf = NumberFormat.getCurrencyInstance(new Locale(Locale.ENGLISH.getLanguage(),"IN")).format(payment);
        String cnNf = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String frNf = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

    }
}
