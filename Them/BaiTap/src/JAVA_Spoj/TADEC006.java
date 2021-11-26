/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_Spoj;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class TADEC006 {
 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a; 
        if (a < b) {
            max = b;
        }
        if (a < c) {
            max = c;
        }

        System.out.printf("max{%d, %d, %d} = %d", a, b, c, max);
    }
}
