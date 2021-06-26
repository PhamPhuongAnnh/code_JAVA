/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxeptang;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static void nhapMaTran(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
           {
                a[i] = sc.nextInt();
            }
        }
    }

    static void inMaTran(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.printf("%5d", a[i]);
        }
        System.out.println("");
    }
    static void sapXepTang(int[] a) {
        int i, j;
        for (i = 0; i < a.length; i++) {
                for ( j = i + 1; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        int tmp = a[i];
                        a[i]=a[j];
                        a[j]= tmp;
                    }
                }
        }
        inMaTran(a);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        nhapMaTran(a);
        inMaTran(a);
        sapXepTang(a);
    }

}
