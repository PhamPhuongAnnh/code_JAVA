/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pheptoantrensothuc;

import java.util.Scanner;

public class Solution {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//BÀI 1
//        float a, b;
//        a = sc.nextFloat();
//        b = sc.nextFloat();
//        System.out.printf("a" + "   = %10.3f\n", a);
//        System.out.printf("b" + "   = %10.3f\n", b);
//        System.out.printf("a+b" + " = %10.3f\n", (a + b));
//        System.out.printf("a-b" + " = %10.3f\n", (a - b));
//        System.out.printf("a*b" + " = %10.3f\n", (a * b));
//        System.out.printf("a/b" + " = %10.3f\n", (a / b));
//        BAI 2
          float a, b;
        a = sc.nextFloat();
        b = sc.nextFloat();
        int d1,d2;
        d1 = sc.nextInt();
            d2 = sc.nextInt();
        
        System.out.printf("(%*.*lf) + (%*.*lf) = %*.*lf\n", d1, d2, a, d1, d2, b, d1, d2, a+b);
        System.out.printf("(%*.*lf) - (%*.*lf) = %*.*lf\n", d1, d2, a, d1, d2, b, d1, d2, a-b);
        System.out.printf("(%*.*lf) * (%*.*lf) = %*.*lf\n", d1, d2, a, d1, d2, b, d1, d2, a*b);
        System.out.printf("(%*.*lf) / (%*.*lf) = %*.*lf\n", d1, d2, a, d1, d2, b, d1, d2, a/b);

    }

}
