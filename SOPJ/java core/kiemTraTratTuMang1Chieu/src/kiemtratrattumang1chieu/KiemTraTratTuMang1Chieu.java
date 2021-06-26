/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtratrattumang1chieu;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class KiemTraTratTuMang1Chieu {

    static Scanner sc = new Scanner(System.in);

    static int nhap() {
        int a = sc.nextInt();
        return a;
    }

    static int kiemtraTang(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] >= a[i]) {
                dem++;
            }
        }
        if (dem == n - 1) {
            return 1;
        } else {
            return 0;
        }

    }

    static int kiemtragiam(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] <= a[i]) {
                dem++;
            }
        }
        if (dem == n - 1) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[5000];
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int j = 0;
            a[j] = nhap();
            while (a[j] != 0) {
                j++;
                a[j] = nhap();
            }
            if (kiemtragiam(a, j) == 1) {
                System.out.printf("Testcase %d: Sorted descending\n", i);
            } else if (kiemtraTang(a, j) == 1) {
                System.out.printf("Testcase %d: Sorted ascending\n", i);
            } else {
                System.out.printf("Testcase %d: Unsorted\n", i);
            }

        }
    }

}
