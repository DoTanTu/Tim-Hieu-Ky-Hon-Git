/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author ACER
 */
public class Multip {
    public static void main(String[] args) {
        try{
           int a = 0;
           int c[] = {1,5,8};
           int b = 42 /a ;
           c[42] = 99;
            System.out.println("a = " + a);
            
        }
        catch(ArithmeticException e){
            System.out.println("Mau so phai khac 0: ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Chi so cua mang phai < 3: ");
        }
        finally{
            System.out.println("allways exercied");
        }
        System.out.println("Afte try / catch block.");
    }
}
