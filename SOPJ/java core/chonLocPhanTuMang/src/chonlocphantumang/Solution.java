/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chonlocphantumang;

import java.util.Scanner;

/**
 *
 * @author LaptopDT
 */
public class Solution {

    static Scanner sc = new Scanner(System.in);

    static void nhapMnag(double[] a, int n) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
    }

    static void inMnag(double[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", a[i]);
        }
        System.out.println();
    }

    static void lonHonTB(double[] a, int n) {
        double avg;
        double s = 0;
        for (int i = 0; i < n; i++) {
            s = s + a[i];
        }
        avg = s / n;
        System.out.printf("Avg = %.3f\n", avg);
        for (int i = 0; i < n; i++) {
            if (a[i] > avg) {
                System.out.printf("%.2f ", a[i]);
            }
        }
    }

    public static void main(String[] args) {

        int n;
        double[] a = new double[50];
        n = sc.nextInt();
        nhapMnag(a, n);
        inMnag(a, n);
        lonHonTB(a, n);
        System.out.println();
    }
}
