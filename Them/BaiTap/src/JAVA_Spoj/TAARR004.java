/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_Spoj;

import java.util.Scanner;

public class TAARR004 {
//    biến cục bộ: 

    static Scanner sc = new Scanner(System.in);

    public static void nhapMang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    public  static void inNgatDong(int a[], int n, int x){
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if ((dem) % x != 0) {
                dem++;
                System.out.print(a[i] + "        ");

            } else {
                System.out.println(a[i] + "        ");
                dem++;
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        nhapMang(a, n);
//        xuatMang(a, n);
        int x = sc.nextInt();
        inNgatDong(a, n, x);
    }
}
