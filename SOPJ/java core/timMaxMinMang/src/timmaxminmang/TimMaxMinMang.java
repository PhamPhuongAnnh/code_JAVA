/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timmaxminmang;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class TimMaxMinMang {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static void nhapMang(double[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }
    }

    static void giaTriMax(double a[], int n) {
        double max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.printf("Max = %.3f\n", max);
    }

    static void giaTriMin(double a[], int n) {
        double min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.printf("Min = %.3f\n", min);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int n = sc.nextInt();
        double[] a = new double[n];
        nhapMang(a);
        giaTriMin(a, n);
        giaTriMax(a, n);

    }

}
