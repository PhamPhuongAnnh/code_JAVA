/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtrasonguyento;

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

    static int kiemTraSoNguyenTo(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            if (kiemTraSoNguyenTo(a) == 1) {
                System.out.printf("%5d : " + "YES\n",a);
            } else {
                System.out.printf("%5d : " + "NO\n",a);
            }
        }

    }

}
