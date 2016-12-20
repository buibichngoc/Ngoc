package com.javabasic.com.bai16.cautrucdowhile;

/**
 * Created by banhu on 12/15/2016.
 * DoWhile luon thuc hien it nhat 1 vong lap
 * Do - thuc hien xong moi kiem tra dieu kien - While
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println("i: " + i);
            i++;
        } while (i < 10);/*cau truc lenh do-while luon luon ket thuc bang dau ; */
    }
}