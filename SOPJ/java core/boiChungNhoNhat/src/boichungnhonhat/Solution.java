/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boichungnhonhat;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    static int uocChungLonNhat(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static int boiChungNhoNhat(int a, int b) {
        int bc = a * b / uocChungLonNhat(a, b);
        return bc;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("LCM(%5d, %5d) = %5d\n",a,b,boiChungNhoNhat(a, b));
        }

    }

}
