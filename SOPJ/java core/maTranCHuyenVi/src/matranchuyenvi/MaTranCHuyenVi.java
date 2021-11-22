/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matranchuyenvi;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class MaTranCHuyenVi {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static void nhapMaTran(int[][] a) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    static void chuyenVi(int[][] a,int[][] b){
        int i,j;
        
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
               b[j][i] =  a[i][j] ;
            }
        }
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b[i].length; j++) {
                System.out.printf("%4d",b[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a =new int [m][n];
        int[][] b = new int[n][m];
        nhapMaTran(a);
        chuyenVi(a, b);
        
    }
    
}
