/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xacdinhvitrimang;

import java.util.Scanner;

class Solution {

    static Scanner sc = new Scanner(System.in);

    static void nhapMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void viTri(int[] a, int n, int m) {
        System.out.printf("At the following position(s):");
        for (int i = 0; i < n; i++) {
            if (a[i] == m) {
                System.out.printf(" %d", i);
            }
        }
    }

    static void kiemTraTonTai(int[] a, int n, int m) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == m) {
                dem++;
            }
        }
        if (dem > 0) {
            System.out.printf("The value %d appears %d time(s)", m, dem);
            System.out.println("");
            viTri(a, n, m);
        } else {
            System.out.printf("The value %d does not exist in the given array",m);
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        nhapMang(a, n);
        int m = sc.nextInt();
        kiemTraTonTai(a, n, m);
    }
}
