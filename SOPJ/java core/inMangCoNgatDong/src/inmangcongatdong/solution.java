/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmangcongatdong;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class solution {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static void nhapMang(int a[]) {

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void inMang(int a[], int r) {
        int dem = 0;
        for (int x : a) {

            if (dem % r == 0) {
                System.out.printf("\n");
            }
            System.out.printf("%6d", x);
            dem++;
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        int a[] = new int[n];
        nhapMang(a);
        int r = sc.nextInt();
        inMang(a, r);
    }
}
