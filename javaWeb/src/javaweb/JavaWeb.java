/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaweb;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class JavaWeb {

   static Scanner sc = new Scanner(System.in);
 
    public static int daoNguoc(int n) {
        int tmp, res = 0;
        n = sc.nextInt();
        while (n > 0) {
            tmp = n % 10;
            res = res * 10 + tmp;
            n /= 10;
        }
        System.out.println(+res);
        return res;
    }
 
    public static void main(String[] args) {
        int a, b, c = 0, T;
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = daoNguoc(daoNguoc(a) + daoNguoc(b));
        }
    }
}
