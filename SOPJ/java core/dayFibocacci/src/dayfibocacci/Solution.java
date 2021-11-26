/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayfibocacci;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    static int fibocacci(int n) {
        int F0 = 1, F1 = 1, Fn = 0;
        for(int i=0; i<n; i++){
            if(i==0|| i == 1){
                Fn = 1;
            }
            else{
                Fn = F0+F1;
                F0=F1;
                F1 = Fn;
            }
        }
        return Fn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n =sc.nextInt();
            System.out.printf("%d\n",fibocacci(n));
        }
    }

}
