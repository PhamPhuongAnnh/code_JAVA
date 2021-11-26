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
public class TADEC011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        if (a == 0) {

            if (b == 0) {

                if (c == 0) {
                    System.out.println("Moi x la nghiem");
                } else {
                    System.out.println("phuong trinh vo nghiem");
                }

            } else {
                System.out.printf("Phuong trinh co 1 nghiem dơn %.5f", -c / b);
            }
        } else {
            double denta = b * b - 4 * a * c;
            if (denta > 0) {
                System.out.println("Phuong trinh co hai nghiem phan biet");
                System.out.printf("x1 = %.5f\t", ((-b + Math.sqrt(denta) )/ (2 * a)));
                System.out.printf("x2 = %.5f", ((-b - Math.sqrt(denta)) / (2 * a)));
            } else if (denta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                double x = -b / 2 * a;
                System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.5f", x);
            }
        }
    }
}
