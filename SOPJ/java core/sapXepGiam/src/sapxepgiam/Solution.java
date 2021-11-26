/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepgiam;

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

    static int nhapDay() {
        int a = sc.nextInt();
        return a;
    }

    static void inMaTran(int[] a,int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.printf("%5d", a[i]);
        }
        System.out.println("");
    }
    static void sapXepGiam(int[] a,int n) {
        int i, j;
        for (i = 0; i < n; i++) {
                for ( j = i + 1; j < n; j++) {
                    if (a[i] < a[j]) {
                        int tmp = a[i];
                        a[i]=a[j];
                        a[j]= tmp;
                    }
                }
        }
        inMaTran(a,n);
       
    }
    static void hienThiMaTranSapXep(int[] a,int n,int t){
        System.out.printf("Testcase %02d: n = %d\n",t,n);
        System.out.printf("Orig: ");
        inMaTran(a,n);
        
        System.out.printf("Sort: ");
        sapXepGiam(a,n);
        System.out.println("");
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        int[] a= new int[100005];
        for(int i=0; i<t; i++){
            int j = 0;
            a[j] = nhapDay();
            while(a[j] !=0){
                j++; 
                a[j] = nhapDay();
            }
            hienThiMaTranSapXep(a, j+1,i);
        }
       
        
    }

}
