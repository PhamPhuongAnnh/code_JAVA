/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtrasochinhphuong;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    static int soChinhPhuong(int n) {
        for(int i = 0; i<=n; i++){
            if(i*i == n ){
                return 1; 
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            if (soChinhPhuong(a) == 1) {
                System.out.printf("%5d : YES\n", a);

            } else {
                System.out.printf("%5d : NO\n", a);
            }
        }
    }

}
