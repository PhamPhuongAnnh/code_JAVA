/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matranziczac3;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class MaTranZicZac3 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int gt = 1;
        int cot = 0, hang = m - 1;
        while (gt <= m * n) {
            if (cot <= n && cot%2==0) {
                for (int i = 0; i <= hang; i++) {
                    a[i][cot] = gt++;
                    
                }
                cot++;
            }
            else {
                for (int i = hang; i >= 0; i--) {
                    a[i][cot] = gt++;
                }
                cot ++;
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
