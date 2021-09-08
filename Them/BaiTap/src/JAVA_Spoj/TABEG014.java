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
public class TABEG014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        if (x > 0) {
            System.out.printf("%.4f\n", Math.sqrt(x));
        } else {
            System.out.printf("%.4f\n", Math.sqrt(- x));

        }
    }
}
