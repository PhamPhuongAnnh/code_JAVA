/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timminmax;

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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            double a, max = 0, min = 0;

            for (int j = 0; j < n; j++) {
                a = sc.nextDouble();
                if(j == 0){
                     max = a;
                     min = a;
                }
                if (n == 1) {
                    max = a;
                    min = a;
                } else {
                    if (max < a) {
                        max = a;
                    }
                    if (min > a) {
                        min = a;
                    }
                }

            }
            System.out.printf("Min = %15.3f;     Max = %15.3f\n", min, max);

        }
    }

}
