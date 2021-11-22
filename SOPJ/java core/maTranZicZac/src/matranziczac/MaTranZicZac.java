/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matranziczac;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class MaTranZicZac {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int gt = 1;
        int hang = 0, cot = n - 1;
        while (gt <= m * n) {
            if (hang <= m && hang%2==0) {
                for (int i = 0; i <= cot; i++) {
                    a[hang][i] = gt++;
                    
                }
                hang++;
            }
            else {
                for (int i = cot; i >= 0; i--) {
                    a[hang][i] = gt++;
                }
                hang ++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println("");
        }

    }
    
}
