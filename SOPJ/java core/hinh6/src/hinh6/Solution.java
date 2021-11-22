/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinh6;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,r,c;
        t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            r = sc.nextInt();
            c = sc.nextInt();
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if(i%2==0){
                        if(j %2==0){
                            System.out.printf("*");
                        }
                        else{
                             System.out.printf(".");
                        }
                    }
                    else{
                         if(j %2==0){
                            System.out.printf(".");
                        }
                        else{
                             System.out.printf("*");
                        }
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
    
}
