/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxeptang2;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class SapXepTang2 {

    static Scanner sc = new Scanner(System.in);

    static void nhapMang(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            {
                a[i] = sc.nextInt();
            }
        }
    }

    static void inMang(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.printf("%5d", a[i]);
        }
        System.out.println("");
    }

  
    static void sapXepTang(int a[], int vitri[], int n) {
        int i, j, temp;
        for (i = n - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    temp = vitri[j];
                    vitri[j] = vitri[j + 1];
                    vitri[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] vt = new int[n];

        nhapMang(a);
        for (int i = 0; i < n; i++) {
            System.out.printf("%5d",i);
        }
        System.out.println("");
        inMang(a);
        
        for (int i = 0; i < n; i++) {
            vt[i] = i;
        }
        
        sapXepTang(a, vt, n);
        inMang(a);
        inMang(vt);
    }

}
