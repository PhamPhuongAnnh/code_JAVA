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
public class TAARR001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        
        int x = sc.nextInt();
        
        int flag = 0;
        
      
        for (int c: a){
            if(x == c){
               flag = 1;
            }
        }
        
//        for(int i=0; i<n; i++){
//            if(x == a[i]){
//               flag = 1;
//            }
//        }
        
        if(flag == 0){
             System.out.println("no");
        }
        else {
            System.out.println("yes");
        }
       
        
    }
}
