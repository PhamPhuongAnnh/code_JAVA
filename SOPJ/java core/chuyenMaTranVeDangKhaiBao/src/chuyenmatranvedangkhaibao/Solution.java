/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuyenmatranvedangkhaibao;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    static Scanner sc = new Scanner(System.in);

    static void nhapMaTran(int[][] a) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void inMaTran(int[][] a, int m, int n) {
        int i, j;

        System.out.printf("int a[%d][%d] = {", m, n);

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.printf("\t{%d,", a[i][j]);
                } else if (j == n - 2) {
                    System.out.printf("%3d}\n", a[i][j]);
                } else if (i == m - 1 &&j == n - 2 ) {
                    System.out.printf("%3d}\n};", a[i][j]);
                } else {
                    System.out.printf("{%3d,", a[i][j]);
                }

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        nhapMaTran(a);
        inMaTran(a, m, n);
    }

}
