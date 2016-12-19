package com.vn.bai19classabstractclassinterface;

/**
 * Created by banhu on 12/16/2016.
 */
public class Bai19 {
    //Ten class phai trung voi public class
}

class Ngoc {

    /**Mot class gom 2 tp thuoc tinh va phuong thuc
     * La muon implement thang, muon lam j do truc tiep*/
    private String name;//thuoc tinh
    public void studyNgoc() { //phuong thuc

    }
}

/**
interface va abstract la chuan vi cho nhieu thang khac su dung
 implement va extend tu no*/

interface BanhU {
    /**trong interface thi cac thuoc tinh la hang so luon luon khong doi*/
    public final static String COUNTRY_NAME = "Viet Nam";

    /** trong interface thi pthuc ket thuc = giau ; chua dc implement
    trong class binh thuong thi ket thuc = {}
    trong interface thi phai implement moi dung dc*/
    public void show();
}

abstract class Beo {
    private  String name;
    public abstract void move(); // mot la kthuc = ;
    public abstract void ngocjava { // hai la kthuc = {}

    }
}