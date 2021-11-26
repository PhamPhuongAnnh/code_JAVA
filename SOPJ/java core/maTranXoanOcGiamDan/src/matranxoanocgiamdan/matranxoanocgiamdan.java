/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matranxoanocgiamdan;

import java.util.Scanner;

class matranxoanocgiamdan {

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
                if (j == a[i].length) {
                    System.out.printf("%4d", a[i][j]);
                } else {
                    System.out.printf("%4d ", a[i][j]);
                }
            }
            System.out.println("");
        }
    }

    static void chuyenVeMang(int[][] a, int[] b) {
        int i, j, k = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                b[k] = a[i][j];
                k++;
            }
        }
    }

    static void sapXepGiamDan(int[] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - 1 - i; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int[] b = new int[m * n];
        int[][] c = new int[m][n];
        nhapMaTran(a);
        chuyenVeMang(a, b);
        sapXepGiamDan(b);
        int vong = 0;
        int cot = n - 1;
        int hang = m - 1;
        int k = 0;
        int i, j;
        while (k < b.length) {
            for (i = hang; i >= vong; i--) {
                c[i][cot] = b[k++];
            }
            for (j = cot - 1; j > vong; j--) {
                c[vong][j] = b[k++];
            }
            for (i = vong; i <= hang && k < b.length; i++) {
                c[i][vong] = b[k++];
            }
            for (j = vong + 1; j <= cot - 1 && k < b.length; j++) {
                c[hang][j] = b[k++];
            }
            vong++;
            hang--;
            cot--;
        }
        inMaTran(c);
    }
}
