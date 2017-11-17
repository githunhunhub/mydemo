package com.test.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created on 2017/10/13
 **/

public class DateUtil {
    public final static String format = "yyyy-MM-dd HH:mm:ss";

    public static String formatDate(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static String formatDate(Date date, String format){
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static Date getQuarterStart() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        try {
            if (month >= 1 && month <= 3)
                calendar.set(Calendar.MONTH, 0);
            else if (month >= 4 && month <= 6)
                calendar.set(Calendar.MONTH, 3);
            else if (month >= 7 && month <= 9)
                calendar.set(Calendar.MONTH, 6);
            else if (month >= 10 && month <= 12)
                calendar.set(Calendar.MONTH, 9);
        } catch (Exception e) {
            e.printStackTrace();
        }
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1, 0, 0, 0);
        Date temp = calendar.getTime();
        return calendar.getTime();
    }

    public static Date getQuarterEnd() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        try {
            if (month >= 1 && month <= 3)
                calendar.set(Calendar.MONTH, 2);
            else if (month >= 4 && month <= 6)
                calendar.set(Calendar.MONTH, 5);
            else if (month >= 7 && month <= 9)
                calendar.set(Calendar.MONTH, 8);
            else if (month >= 10 && month <= 12)
                calendar.set(Calendar.MONTH, 11);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), day, 23, 59, 59);
        System.out.println(formatDate(calendar.getTime(), format) + "***********");
        return calendar.getTime();
    }

}
