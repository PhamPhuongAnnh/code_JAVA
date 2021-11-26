/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pheptoantrensonguyen;

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
      //  BÀI 1
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a+b);
//        System.out.println(a-b);

//        BÀI 2
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a+" + "+b+" = "+(a+b));
//        System.out.println(a+" - "+b+" = "+(a-b));
//        System.out.println(a+" * "+b+" = "+(a*b));
//        System.out.println(a+" / "+b+" = "+(a/b));
//        System.out.println(a+" % "+b+" = "+(a%b));
        //Bài 3
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        
        System.out.printf(a+" : "+b+" = " +String.format("%" + d1 + "." +d2 + "f",(float)a/b));
    } 

}
