/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJAVACore;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class TABEG012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("a   = " + a);
        System.out.println("b   = " + b);
        System.out.println("a+b = " + String.format("%" + 10 + "." + 3 + "f", a + b));
        System.out.println("a-b = " + String.format("%" + 10 + "." + 3 + "f",a - b));
        System.out.println("a*b = " + String.format("%" + 10 + "." + 3 + "f",a * b));
        System.out.println("a/b = " + String.format("%" + 10 + "." + 3 + "f",a / b));

    }
}
