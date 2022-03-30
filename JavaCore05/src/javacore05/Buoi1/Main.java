/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore05.Buoi1;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Main {

    public static void main(String[] args) {
        //System.setIn(new FileInputStream("D:\\input\\input.txt"));
        Scanner sc = new Scanner(System.in);

        int i, j, t, n;
        t = sc.nextInt();
        for (int a = 0; a < t; i++) {
            n = sc.nextInt();
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.printf("*");
                    } else if (i == j) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
