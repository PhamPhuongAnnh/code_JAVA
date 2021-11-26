/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thietlapgiatribit;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int b, n, x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        n = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%08x\n", x);
        if (b == 0) {
            x = x & (~(1 << n));
            System.out.printf("%08x", x);
        } else {
            x = x | (1 << n);
            System.out.printf("%x", x);
        }
    }

}
