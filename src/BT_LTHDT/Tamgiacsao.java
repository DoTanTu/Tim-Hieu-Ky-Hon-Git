/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT_LTHDT;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Tamgiacsao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Nhap vao do dai: ");
        a = sc.nextInt();
        for(int i = 1; i <=a; i++){
           for(int j = 1; j <= i; j++){
              System.out.print(" * ");
           }
           System.out.println();
        }
    }
    
}
