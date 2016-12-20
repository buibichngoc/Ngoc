package com.javabasic.vn.bai20.multiclasses;

/**
 * Created by banhu on 12/19/2016.
 * Cach su dung nhieu class trong 1 file source code
 * hay bi nham lan giua class va doituong
 * class la khai bao chung mot lop thuc the nao day(public class)
 * khi implement code thi chung tao ra cac doi tuong (class)
 */
public class DemoMulticlasses {
    public static void main(String[] args) {
        // cung mot class nhung thuoc tinh no khac nhau
        A a1 = new A();
        a1.setName("ngoc");
        System.out.println("a1:" + a1.getName());

        A a2 = new A();
        a2.setName("ngocngoc");
        System.out.println("a2: " + a2.getName());

        B b1 = new B();
        System.out.println("b1: ");
    }
}

class A {
    private String name; //khai bao

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class B {

}