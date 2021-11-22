/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuyenmangvekhaibaomang;

import java.util.Scanner;

class ChuyenMangVeKhaiBaoMang {

    static Scanner sc = new Scanner(System.in);

    static void nhapMaTran(int[] a) {
        int i, j;
        for (i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();

        }
    }

    static void inMaTran(int[] a) {
        int i;
        System.out.printf("a[%d] = {", a.length);
        for (i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.printf("%3d};", a[i]);
            } else {
                System.out.printf("%3d, ", a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int m = sc.nextInt();
        int[] a = new int[m];
        nhapMaTran(a);
        inMaTran(a);
    }

}
