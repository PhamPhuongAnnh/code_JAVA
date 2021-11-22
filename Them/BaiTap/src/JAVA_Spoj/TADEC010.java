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
public class TADEC010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();


        if (a == 0) {
            if (b == 0) {
                System.out.println("Moi x la nghiem\n");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double x; 
            System.out.printf( "%.5f",-b / a);
        }
    }

}
