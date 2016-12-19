package com.vn.bai19classabstractclassinterface;

/**
 * Created by banhu on 12/16/2016.
 */
public class Bai19 {
    //Ten class phai trung voi public class

}

class Ngoc {
    //Mot class gom thuoc tinh va phuong thuc
    private String name;//thuoc tinh

    public void study() { //phuong thuc

    }

}

interface BanhU {
    /**
     * aaa
     */
    public final static String COUNTRY_NAME = "Viet Nam";

    public void show();

}

abstract class Beo {
    private  String name;

    public abstract void move();
}