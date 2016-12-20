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
        //1 try co the co nhieu catch
        try {
            System.out.println("Before: ");
            //System.out.println(test.substring(50)); //doc cac ptu thu 50
            System.out.println(test.substring(6));
            int a = 5;
            int b = 0;
            System.out.println("a/b= " + (a / b));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.toString());
        }
        catch(ArithmeticException e){
            System.out.println("error: " + e.toString());
        }
        //try catch co them thang finally la tphan cuoi
        //finally du loi hay ko loi exception hay ko exception no van thuc hien
        //
        finally {
            System.out.println("Always done");
        }
        System.out.println("After: ");

    }
}
