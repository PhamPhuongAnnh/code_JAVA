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
public class TADEC012 {
//ax + by = e
//cx + dy = f 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double e = sc.nextDouble();

        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double f = sc.nextDouble();

        if(a*d - c*b != 0){
            System.out.println("He phuong trinh co nghiem duy nhat");
            System.out.println("x = ");
        }
    }
}
