/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thutungaytrongnam;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        
        int l = d;
        for (int i = 1; i < m; i++) {
            switch (i) {
                case 4:
                case 6:
                case 9:
                case 11:
                    l += 30;
                    break;
                case 2:
                    if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                        l += 29;
                    } else {
                        l += 28;
                    }
                    break;
                default:
                    l += 31;
            }
        }
        System.out.println("Ngay " + d + "/" + m + " la ngay thu " + l + " cua nam " + y);
    }
    
}
