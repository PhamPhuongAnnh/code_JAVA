/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tichhaimatran;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static void nhapMaTran(int[][] a) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void inMaTran(int[][] a) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.printf("%6d", a[i][j]);
            }
            System.out.println("");
        }
    }

    static void tichHaiMaTran(int[][] a, int[][] b,int[][] c ) {
        int i, j, k;
     
        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c[i].length; j++) {
                c[i][j] = 0;
                for (k = 0; k < b.length; k++) {
                    c[i][j] = c[i][j]+ a[i][k] * b[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();
        
        int[][] a = new int[m][n];
        int[][] b = new int[n][p];
        int[][] c = new int[m][p];
        
        nhapMaTran(a);
        nhapMaTran(b);
        tichHaiMaTran(a, b,c);
        inMaTran(c);
    }

}
