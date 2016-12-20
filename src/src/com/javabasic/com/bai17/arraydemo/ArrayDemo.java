package com.javabasic.com.bai17.arraydemo;

/**
 * Created by banhu on 12/16/2016.
 * Mang la 1 loat DL thanh phan khac nhau sap sep thanh 1 day...
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] arrInt1 = new int[10]; //mang 1chieu co 10 ptu nhung chu biet cac giatri
        int[] arrInt2 = {2, 3, 4, 5}; //mang 2 chieu co 4 ptu va ptu co gitri ro rang

        int[][] arrInt3 = new int[5][4];

        String[] arrString = new String[5];
        ArrayDemo[] arrDemos = new ArrayDemo[5];

        System.out.println("arrInt1:");
        for (int i = 0; i < arrInt1.length; i++) {
            System.out.println(arrInt1[i]);
        }

        System.out.println("arrInt2:");
        for (int i = 0; i < arrInt2.length; i++) {
            System.out.println(arrInt2[i]);
        }

        System.out.println("arrInt3:");
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(arrInt3[j][k] + " ");
            }
            System.out.println("");
        }
    }

}
