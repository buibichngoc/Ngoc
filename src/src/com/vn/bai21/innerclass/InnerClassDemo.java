package com.vn.bai21.innerclass;

/**
 * Created by banhu on 12/19/2016.
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.show();
    }

}

class Outer {
    public void show() {
        Inner in = new Inner();
        in.display();
    }

    class Inner {
        public void display() {
            System.out.println("I'm an inner class");
        }
    }
}

class C {
    public void show() {
        Outer.Inner in = new Outer().new Inner();
        in.display();
    }
}
