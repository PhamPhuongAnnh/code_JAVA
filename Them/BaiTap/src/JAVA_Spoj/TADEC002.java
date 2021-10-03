/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_Spoj;

import java.util.Scanner;

/**
 *
 * @author phuon
 */


public class TADEC002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        if (x > 0) {
            System.out.printf("%.3f la so duong", x);
        }
        else if (x < 0) {
            System.out.printf("%.3f la so am", x);
        } 
        else{
            System.out.println("x = 0");
        }
    }
}
