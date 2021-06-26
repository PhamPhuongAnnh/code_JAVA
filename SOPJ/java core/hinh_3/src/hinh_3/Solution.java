/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinh_3;

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
        int t, a;
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            for (int k = 0; k < a; k++) {
                for (int j = 0; j < a; j++) {
                    if (k == 0 || k == a - 1 || j == 0 || j == a - 1 || k == j) {
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
