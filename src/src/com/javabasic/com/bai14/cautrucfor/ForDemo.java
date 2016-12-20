package com.javabasic.com.bai14.cautrucfor;

/**
 * Created by banhu on 12/15/2016.
 */
public class ForDemo {
    public static void main(String[] args) {
        int a;
        int b = 0;
        int c = 0;
/**cautruc khai bao for gom 3 tphan:
        Phan 1: tu khoa for
        Phan 2: buoc khoi tao, kiem tra lenh, lenh thuc hien tiep theo,
        Phan 3: la khoi lenh ma cau truc for thuc hien
 **/
        for (int i = 100; i < 103; i++) {
            System.out.println("i: " + i);
        }

         for ( a = 0; a < 2; a++) {
             System.out.println("a: " + a);
         }
         for (; b < 2; b++){
            System.out.println("b++: " + b);
         }
         for (; c < 3; ++c){
             System.out.println("++c: " + b);
         }
/**
a phai dc khai bao o ngoai, vi neu khong khoi tao
 no se bao loi vi a chi dung trong vong FOR
*/
        System.out.println("outer a: " + a);
    }
}
