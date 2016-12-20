package com.javabasic.vn.bai22.interfacedemo;

/**
 * Created by banhu on 12/19/2016.
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Manager man = new Manager();
        man.show();
    }

}

interface  Human{
    public static final int AGV_EGD = 100;
    /**Mac du thuoc tinh int AVG khong viet la public static final
     * nhung no van dc hieu la psf*/
    int AVG_WEIGHT = 60;

    public abstract void show();
/**mac du khong co public abstract nhung no van dc hieu la
 * public abstract */
    void study();
}

class Manager implements Human{

    //muon implement thi dung override no ra de dung
    @Override
    public void show() {
        System.out.println("AGV_AGE: " + Human.AGV_EGD);
    }

    @Override
    public void study() {

    }
}
