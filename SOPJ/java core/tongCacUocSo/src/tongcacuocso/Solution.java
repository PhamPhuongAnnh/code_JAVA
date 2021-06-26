/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tongcacuocso;

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
    static long[] sum = new long[500001];
    
    static void tong(int x) {
        sum[x] = 1;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                if(i*i==x){
                    sum[x]+=i;
                }
                else {
                    sum[x] += i +(x/i);
                }
            }
        }
       
    }

    public static void main(String[] args) {
        int t;
        int x;
        t = sc.nextInt();
        for(int i=0; i<500001 ; i++){
            tong(i);
        }
        for(int i=0; i<t; i++){
            x = sc.nextInt();
            System.out.println(sum[x]);
        }
        
    }

}
