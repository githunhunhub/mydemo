package com.test;

import com.test.util.DateUtil;

import java.util.Calendar;

/**
 * Created on 2017/10/13
 **/

public class Calendar2 {

    public static void main(String[] args) {
        Calendar lastQuarterStart = Calendar.getInstance();
        lastQuarterStart.setTime(DateUtil.getQuarterStart());
        lastQuarterStart.add(Calendar.MONTH, -3);
        Calendar lastQuarterEnd = Calendar.getInstance();
        lastQuarterEnd.setTime(DateUtil.getQuarterEnd());
        lastQuarterEnd.add(Calendar.MONTH, -3);
        System.out.println(DateUtil.formatDate(lastQuarterStart.getTime(), DateUtil.format));
        System.out.println(DateUtil.formatDate(lastQuarterEnd.getTime(), DateUtil.format));
    }


}
