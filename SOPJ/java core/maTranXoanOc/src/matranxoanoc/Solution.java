/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matranxoanoc;

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

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int d = 0, gt = 1;
        int hang = m - 1, cot = n - 1;
        while (gt <= m * n) {
            for (int i = d; i <= cot; i++) {
                a[d][i] = gt++;
            }
            for (int i = d + 1; i <= hang; i++) {
                a[i][cot] = gt++;
            }
            for (int i = cot - 1; i >= d && gt <= m * n; i--) {
                a[hang][i] = gt++;
            }
            for (int i = hang - 1; i > d && gt <= m * n; i--) {
                a[i][d] = gt++;
            }
            d++;
            hang--;
            cot--;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println("");
        }

    }

}

