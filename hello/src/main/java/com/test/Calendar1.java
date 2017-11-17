package com.test;
import com.test.util.DateUtil;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * Created on 2017/10/24
 **/

public class Calendar1 {

    @Test
    public void dayStart(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(1000000000));
        System.out.println(DateUtil.formatDate(calendar.getTime()));

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        System.out.println(DateUtil.formatDate(calendar.getTime()));
    }
}
