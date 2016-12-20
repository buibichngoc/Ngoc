package com.javabasic.com.bai13.cautrucswitch;

/**
 * Created by banhu on 12/14/2016.
 */
public class CautrucSwitch {
    public static void main(String[] args) {
        int age = 0;
        switch (age){
            case 0:
                System.out.println("Zero");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 20:
                System.out.println("twenty");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
