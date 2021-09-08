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
public class TADEC001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 != 0) {
            System.out.println(a + " la so le");
        } else {
            System.out.println(a + " la so chan");

        }
    }
}
