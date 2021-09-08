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
public class TADEC004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a >0){
            System.out.println("|a| = "+a);
        }
        else{
            System.out.println("|a| = "+(-a));
        }
        if(b >0){
            System.out.println("|b| = "+b);
        }
        else{
            System.out.println("|b| = "+(-b));
        }if(c >0){
            System.out.println("|c| = "+c);
        }
        else{
            System.out.println("|c| = "+(-c));
        }
    }
}
