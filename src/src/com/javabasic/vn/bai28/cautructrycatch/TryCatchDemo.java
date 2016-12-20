package com.javabasic.vn.bai28.cautructrycatch;

/**
 * Created by banhu on 12/20/2016.
 * try-catch la sd khi bat cac exception
 * exception la ngoai le ko mong muon khi chay hoac bien dich
 * VD chia cho 0, loi connect database
 * try catch giup ko bi break
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        String test = "BuiBichNgoc";
        try {
            System.out.println("Before: ");
            System.out.println(test.substring(50));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.println("After: ");


    }
}
