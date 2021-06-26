/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timcapphantuthuantrongmang;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class TimCapPhanTuThuanTrongMang {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static void nhapMang(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            {
                a[i] = sc.nextInt();
            }
        }
    }

    static void inMang(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.printf("%5d", a[i]);
        }
        System.out.println("");
    }

    static void inviTri(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println("");
    }

    static void inThuan(int[] a) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i] < a[j] && i < j) {
                    System.out.printf("(%2d, %2d) = (%5d, %5d)\n", i, j, a[i], a[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        nhapMang(a);
        inviTri(a);
        inMang(a);
        inThuan(a);
    }

}
