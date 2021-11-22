/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtratinhdoixung;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class KiemTraTinhDoiXung {

    static Scanner sc = new Scanner(System.in);

    static int nhap() {
        int a = sc.nextInt();
        return a;
    }

    static int kiemTraDoiXung(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n/2; i++) {
            if (a[i] != a[n - i - 1]) {
                dem =1;
                
            }
            break;
        }
        if (dem == 0) {
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
            if (kiemTraDoiXung(a, j) == 1) {
                System.out.printf("Testcase %d: Symmetric\n", i);
            } else {
                System.out.printf("Testcase %d: Asymmetric\n", i);
            }
        }
    }

}
