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
public class TADEC007 {
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > b) {
            double tg = a;
            a = b;
            b = tg;

        }

        if (a > c) {
            double tg = a;
            a = c;
            c = tg;
        }

        if (b > c) {
            double tg = b;
            b = c;
            c = tg;
        }

        System.out.printf("%.2f --> %.2f --> %.2f", a, b, c);
    }
}
