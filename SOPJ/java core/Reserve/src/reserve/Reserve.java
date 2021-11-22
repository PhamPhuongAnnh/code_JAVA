/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserve;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Reserve {

    /**
     * @param args the command line arguments
     */
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

    static void kiemTra(int[] a, int[] b) {
        int i;
        
        int[] c = new int[200];
        for (i = 0; i < a.length; i++) {
            int kt = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    kt = 1;
                    break;
                }
            }
            if(kt != 1){
                System.out.printf("%d ",a[i]);
               
            }
            
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int n, m;
        n = sc.nextInt();
        int[] a = new int[n];
        nhapMang(a);
        m = sc.nextInt();
        int[] b = new int[m];
        nhapMang(b);
        kiemTra(a, b);
    }

}
