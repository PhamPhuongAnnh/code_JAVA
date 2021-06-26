/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaTriCuaBit;

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
        long a, n;
        a = sc.nextLong();
        n = sc.nextLong();
        a = (a >> n) & 1;
        if (a == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

}
