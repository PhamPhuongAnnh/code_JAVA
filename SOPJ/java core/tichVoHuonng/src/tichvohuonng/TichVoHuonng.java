/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tichvohuonng;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class TichVoHuonng {

    /**
     * @param args the command line arguments
     */static Scanner sc = new Scanner(System.in);

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
    static int tichVoHuong(int[] a,int[] b ){
        int i,j;
        int s = 0;
        for(i=0; i<a.length; i++){
            for(j=0; j<b.length;j++){
                if(i == j){
                  s+= a[i]*b[j];  
                }
            }
        }
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        nhapMang(a);
        nhapMang(b);
        System.out.println(tichVoHuong(a, b));
    }
    
}
