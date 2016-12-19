package com.vn.bai15cautrucwhile;

/**
 * Created by banhu on 12/15/2016.
 * While thuong dung trong doc file, Doc bao gio het thi dung
 * Cau truc For thi khong the dung duoc vi khong co gia tri co dinh
 */
public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;
        int a = 0;
        int b = 0;
        while (i < 3){ /**cau truc kieu kien boolean de no dung lai*/
            System.out.println("i:" + i);
            i++;
        }
/**        while(a > -10){
            System.out.println("a: " + a);
            //a++; lap vo han
        }
**/
        while (b < 10){
            System.out.println("b: " + b);
            b += 3;
        }
    }
}
