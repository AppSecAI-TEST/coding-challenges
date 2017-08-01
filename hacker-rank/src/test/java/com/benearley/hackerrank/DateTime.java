package com.benearley.hackerrank;


import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by 578803 on 2/27/2017.
 */
public class DateTime {

    @Test
    public void test(){

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,Integer.parseInt("2015"));
        cal.set(Calendar.MONTH,Integer.parseInt("08") - 1);
        cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt("05"));
        System.out.println(cal.getTime());
        DateFormat df = new SimpleDateFormat("EEEE");


        System.out.println(df.format(cal.getTime()).toUpperCase());

        StringBuilder sb = new StringBuilder();
        assert df.format(cal.getTime()).toUpperCase().equals("WEDNESDAY");
    }


}
