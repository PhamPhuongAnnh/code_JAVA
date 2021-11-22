/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhcanbachai;

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
        double c = sc.nextDouble();
        if(c<0){
            System.out.printf("%.4f",Math.sqrt(-c));
        }
        else {
            System.out.printf("%.4f",Math.sqrt(c));
        }
    }
    
}
