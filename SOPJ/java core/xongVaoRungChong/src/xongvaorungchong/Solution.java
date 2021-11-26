/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xongvaorungchong;

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
        b = sc.nextInt();
        n = sc.nextInt();

        if (b == 1) {
            System.out.printf("%x", ~0);
        } else {
            x = 1 << n;
            x = ~x;
            System.out.printf("%x", x);
        }
    }

}
