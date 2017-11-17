package com.test;

import com.test.util.DateUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * Created on 2017/10/12
 **/

public class CalendarTest {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int i = 1;
        calendar.add(Calendar.MONTH, i);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        String date = DateUtil.formatDate(calendar.getTime(), DateUtil.format);
        System.out.println(date);
    }
}
