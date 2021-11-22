/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtrasutontaiphantumang;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    static Scanner sc = new Scanner(System.in);

    static void nhapMnag(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }
//
//    static void inMnag(int[] a, int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.printf("%.2f ", a[i]);
//        }
//        System.out.println();
//    }
    static int kiemTra(int[] a, int n,int m){
        for(int i=0; i<n; i++){
            if(m == a[i]){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        nhapMnag(a, n);
        int m = sc.nextInt();
        if(kiemTra(a, n, m)==1){
            System.out.println("Yes");
        }
        else
        {
               System.out.println("No");
        }
    }

}
