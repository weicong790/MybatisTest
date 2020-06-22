package com.example.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public  class TimeUtil {
    public static String getTime(){
        long now=new Date().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
        return df.format(now);
    }
}
