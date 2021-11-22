/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinh_2;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, m, n;
        t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            m = sc.nextInt();            n = sc.nextInt();
            for (int r=0; r<m; r++) {
                for (int c=0; c<n; c++) {
                    if (r==0 || r==m-1 || c==0 || c==n-1) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
    
}
