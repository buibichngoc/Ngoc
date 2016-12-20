package com.javabasic.vn.bai26.finaldemo;

/**
 * Created by banhu on 12/19/2016.
 * Static apdung cho blockcode, pthuc, thuoc tinh
 * Final apdung cho class, pthuc, thuoc tinh
 * Final khong the thay doi gtri, thuoc tinh , pthuc, ko dc thua ke class
 */
public class FinalDemo extends FinalNgoc {
    final float PI = 3.14f; //float phai co tu "f" o cuoi
    int number;

    public static void main(String[] args) {
        FinalDemo test = new FinalDemo();
        test.number = 15;
        // test.PI = 3.15f; // error vi hang so khong the thay doi
    }

    public void change() {
        number = 30;
        //PI = 3.15f; // error vi hang so khong the thay doi
    }

    // override tu class cha FinalNgoc
    void show() {

    }
}

//class cha, them chu final vao class thi class FinalDemo ko thethua ke
//them chu final vao void show(){} thi void show(){} ben tren se khong the override
class FinalNgoc {
    void show() {

    }
}