/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vonglap1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

//        long i, n;
//        double s = 0, daiThua = 1;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextLong();
//        for (i = 1; i <= n; i++) {
//
//            daiThua *= i;
//            s =s+ (1.0) /  daiThua;
//        }
//
//        System.out.printf("%.10f\n", s);
//        1/n
//        long i, n;
//        double s = 0;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextLong();
//        for (i = 1; i <= n; i++) {
//
//           
//            s =s+ (1.0) / i;
//        }
//
//        System.out.printf("%.10f\n", s);
        //tong hieu xen ke 1/n
//        long i, n;
//        double s = 0;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextLong();
//        for (i = 1; i <= 2 * n; i++) {
//
//            if (i % 2 == 0) {
//                s -= (double) 1 / i;
//            } else {
//                s += (double) 1 / i;
//            }
//        }
//        System.out.printf("%.13lf", s);
        
        
        //tong xen ke 1/n!
//            long i, n;
//        double s = 0, daiThua = 1;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextLong();
//        for (i = 1; i <= 2 * n; i++) {
//            daiThua *= i;
//            if (i % 2 == 0) {
//                s -= (double) 1 / daiThua;
//            } else {
//                s += (double) 1 / daiThua;
//            }
//        }
//        System.out.printf("%.13f", s);
        
        //Tinh tong cua day so thuc
        double s = 0,n;
        Scanner sc = new Scanner(System.in);
       
        do{
             n = sc.nextDouble();
             s+=n;
        }while(n!=0);
        System.out.printf("%.3f",s);
        
    }

}
