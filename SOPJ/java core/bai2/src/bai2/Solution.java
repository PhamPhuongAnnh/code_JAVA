/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Solution {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.println("Hay nhap ho ten cua ban: ");
        String hoTen = sc.nextLine();
        System.out.println("Họ và tên: " +hoTen);
        System.out.println("Hay nhap vao mot so Float: ");
        float n = sc.nextFloat();
        System.out.println("Gia tri cua n la: " + n);
        System.out.println("Hay nhap vao mot so double: ");
        double a = sc.nextDouble();
        System.out.println("Gia tri cua n la: " + a);
        sc.nextLine();
       
       
        
        
    }

}
