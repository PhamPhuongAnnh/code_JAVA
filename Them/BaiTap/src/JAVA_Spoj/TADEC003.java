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
public class TADEC003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        if(a > 0 && b > 0 || a<0 &&b<0){
            System.out.println("Cung dau");
        }
        else{
            System.out.println("Trai dau");
        }
    }
}
