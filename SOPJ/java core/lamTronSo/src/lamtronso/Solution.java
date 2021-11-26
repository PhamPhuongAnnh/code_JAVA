/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamtronso;

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
//        double a = sc.nextDouble();
//        a = Math.round(a);
//        System.out.printf("%d",(int)a);

        float a = sc.nextFloat();
        float c, d;

        c = Math.round(a * 10);
        c = c / 10;
        d = (float) Math.pow(c, 2);
        System.out.printf("%.2f", d);
    }

}
