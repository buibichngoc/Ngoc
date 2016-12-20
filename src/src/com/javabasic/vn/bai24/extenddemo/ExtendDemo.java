package com.javabasic.vn.bai24.extenddemo;

/**
 * Created by banhu on 12/19/2016.
 * Neu giua 2 imterface thua ke thi dung extends
 * Neu giua 2 class thua ke thi su dung extends
 * Neu giua 2 class va interface thua ke dung implements
 */
public class ExtendDemo {
    public static void main(String[] args) {
        ReferentBook book = new ReferentBook();
        book.show();
        book.move();
    }
}

interface Document {
    void show();
}

//don thua ke
interface ReferentDoc extends Document {
    void show();
}

class Book implements Document {

    public void show() {

    }


    public void move(){

    }
}

class Paper implements Document {
    public void show() {

    }
}

//da thua ke, khong the thua ke 2 class, thua ke tu interface thi dc nhieu
class ReferentBook extends Book implements Document, ReferentDoc {

}



