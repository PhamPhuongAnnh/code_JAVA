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
public class BAI1 {

    static Scanner sc = new Scanner(System.in);

    static void nhapMang(int a[]){
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }
    }

    static void InMang(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d", a[i]);

        }
        System.out.println("");
    }

    static int sum(int a[]) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];

        }
        return s;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        nhapMang(a);
        System.out.println(sum(a));

    }
}
