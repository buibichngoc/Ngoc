package com.vn.bai25.staticdemo;

/**
 * Created by banhu on 12/19/2016.
 * Trong class java co thuoc tinh va pthuc
 * thuoc tinh va pthuc phu thuoc vao doi tuong tao ra
 * hoac truy cap truc tiep bang dau "."
 * VD: class Book co cac doi tuong book1 book2 book3
 * muon sd chung tat ca cac book , dung chung tat ca cac bien
 * 1 thang thay doi cac thang khac thay doi theo
 */
public class StaticDemo {
    public static void main(String[] args) {
        Room r1 = new Room();
        r1.number = 10;
        System.out.println("r1: " + r1.number);
        System.out.println("r1 area before: " + r1.area);
        r1.area = 300;
        System.out.println("r1 area after: " + r1.area);

        Room r2 = new Room();
        r2.number = 20;
        System.out.println("r2: " + r2.number);
        System.out.println("r2 area before: " + r2.area);
        r2.area = 400; //thay doi gia tri theo lan thay doi gan nhat
        System.out.println("r2 area after: " + r2.area);

        Room r3 = new Room();
        r3.number = 30;
        System.out.println("r3: " + r3.number);
        System.out.println("r3 area : " + r3.area);
    }
}

class Room{
    /**Giai thich, area ban dau la 200, nhung khi len r1 gan lai bang 300
     * thi gia tri area bi thay doi het ca r2 r3
     * luu y no se thay roi theo gia tri thay doi gan nhat*/
    static int area = 200;
    int number;
}
