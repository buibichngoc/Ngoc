package com.vn.bai24.extenddemo;

/**
 * Created by banhu on 12/19/2016.
 * Neu giua 2 imterface thua ke thi dung extends
 * Neu giua 2 class thua ke thi su dung extends
 * Neu giua 2 class va interface thua ke dung implements
 */
public class ExtendDemo {
}

interface Document {
    void show();
}

//don thua ke
interface ReferentDoc extends Document {

}

class Book implements Document {
    public void show() {

    }
}

class Paper implements Document {
    public void show() {

    }

    public void move(){

    }
}

//da thua ke, khong the thua ke 2 class, thua ke tu interface thi dc nhieu
class ReferentBook extends Book implements Document, ReferentDoc {

}



