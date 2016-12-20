package com.javabasic.vn.bai18.thoigianhethong;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by banhu on 12/16/2016.
 * Lay time theo 3 cach: mili second,nano second, hien thi thoi gian theo he thong
 * Tai sao can? VD chung ta muon tinh toan time thuc hien time ket thuc
 *
 */
public class TimeDemo {
    public static void main(String[] args) {
        //Get time by millis khi tinh 10000 record trong database thi nen dung
        long start = System.currentTimeMillis();
        try {
            for (int i = 0; i < 1000; i++)
                Thread.sleep(2);
        } catch (Exception e){

        }
        long end = System.currentTimeMillis();
        System.out.println("millis: " + (end - start));

        //Get time by  nano: 10^-9 cua giay
        start = System.nanoTime();
        end = System.nanoTime();
        System.out.println("Nano: " + (end - start));

        //Display the system time
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String day = dateFormat.format(date);
        System.out.println(day);
    }
}
