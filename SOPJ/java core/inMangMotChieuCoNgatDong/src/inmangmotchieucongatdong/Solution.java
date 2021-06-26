/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmangmotchieucongatdong;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
     static void nhapMang(int a[]) {
       Scanner sc  = new Scanner(System.in);
       for(int i = 0; i<a.length; i++){
           a[i]= sc.nextInt();
       }
    }
    static void inMang(int a[], int r) {
        int dem =1;
        for (int x: a) {
            dem +=1;
            if (dem % r == 0) {
                System.out.printf("\n");
            }
            System.out.printf("%6d", x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        nhapMang(a);
        int r = sc.nextInt();
        inMang(a, r);
    }

}
