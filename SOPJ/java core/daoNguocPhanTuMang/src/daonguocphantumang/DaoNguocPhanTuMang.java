/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daonguocphantumang;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class DaoNguocPhanTuMang {

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
  static void inDaoNguoc(int[] a){
      int i;
        for (i = 0; i < a.length; i++) {
            System.out.printf("%5d", a[a.length-i-1]);
        }
        System.out.println("");
  }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        nhapMang(a);
        inMang(a);
        inDaoNguoc(a);
    }
    
}
