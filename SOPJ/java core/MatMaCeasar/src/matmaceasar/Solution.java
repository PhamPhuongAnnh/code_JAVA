/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matmaceasar;

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
        //giai ma
        Scanner sc = new Scanner(System.in);
//        char a;
//        int b;
//        a = sc.next().charAt(0);
//        b = sc.nextInt();
//        char c = (char) (((a-65)+b+26)%26+65);
//        System.out.printf("%c", c);
        //Ma hoa
      
        char a;
        int b;
        a = sc.next().charAt(0);
        b = sc.nextInt();
        char c = (char) (((a-65)-b+26)%26+65);
        System.out.printf("%c", c);
    }
    
}
