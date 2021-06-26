/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truonghaco;

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
        Scanner sc = new Scanner(System.in);
        long a, n, t;
        a = sc.nextLong();
        n = sc.nextLong();
//        Trương co
        long b = a;
        a = (a << (31 - n))>>31;
        if (a == 0) {
            int x = 1;
            for (int i = 0; i < n; i++) {
                x = x * 2;
            }
            System.out.println(b+x);
            
        } else {
            System.out.println(b);
        }
        

        
        //ha co
//        t = a;
//        for (int i = 0; i < n; i++) {
//            a /= 2;
//        }
//        if (a % 2 != 0) {
//            long kq = (long) (t - Math.pow(2, n));
//            System.out.println(kq);
//        } else {
//            System.out.println(t);
//        }   
    }

}
