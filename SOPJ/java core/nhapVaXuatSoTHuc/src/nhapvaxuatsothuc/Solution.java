/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapvaxuatsothuc;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        BÀi 1
//        double a = sc.nextDouble();    
//        System.out.printf("%.5f",a);
//        Bài 2
        double a = sc.nextDouble();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        System.out.printf("a = %*.*lf", d1,d2,a);
    }

}
