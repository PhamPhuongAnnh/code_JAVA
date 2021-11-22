/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demsoluongphantu;

import java.util.Scanner;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    static void nhap(int a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void demChanLe(int a[], int n, int t) {
        int demChan = 0, demLe = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                demChan++;
            } else {
                demLe++;
            }
        }
        System.out.printf("Testcase %d: %d even element(s), %d odd element(s)\n", t, demChan, demLe);
    }

    public static void main(String[] args) {
        int n, t;
        t = sc.nextInt();
        n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < t; i++) {
            nhap(a, n);
            demChanLe(a, n, i);
        }
    }
}
