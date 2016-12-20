package com.javabasic.vn.bai23.accessmodififer;

/**
 * Created by banhu on 12/19/2016.
 * la pham vi truy cap cua 1 class 1 pthuc 1 thuoc tinh
 * public
 * protected
 * defualt
 * private
 */
public class AccessmodifiersDemo {
    public static void main(String[] args) {
        /**trong lam thuc te khong nen dung cai nay*/
        NgocBoss nb1 = new NgocBoss();
        System.out.println(nb1.age);
        System.out.println(nb1.name);
        System.out.println(nb1.address);
        // error when using the private attribute
        //System.out.println(nb1.numberOfNames);

        /** nen dung cai nay*/
        nb1.showNumberOfNames();
        //nb1.showAge(); // loi o day vi ben duoi dung access modifiers la private
        nb1.showName();
        nb1.showAddress();
    }
}

class NgocBoss {
    //Every where
    public int age;
    //Same packet, subclasses
    protected String name;
    //Same packet
    String address;
    //Only for it
    //khuyen cao cac thuoc tinh nen dung private, che giau thong tin
    // cac thuoc tinh nay se dung API de giao tiep truy cap
    // thay doi gia tri, lay gia tri
    private int numberOfNames;

    private void showAge() {
        System.out.println(age);
    }

    void showName() {
        System.out.println(name);
    }

    public void showAddress() {
        System.out.println(address);
    }

    public void showNumberOfNames() {
        System.out.println(numberOfNames);
    }
}