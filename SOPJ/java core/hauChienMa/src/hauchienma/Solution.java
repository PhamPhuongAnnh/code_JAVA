/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauchienma;

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
        int xH = sc.nextInt();
        int yH = sc.nextInt();
        int xM = sc.nextInt();
        int yM = sc.nextInt();
        if ((xH == xM || yH == yM) || xM - yM == xH - yH || xM + yM == xH + yH) {
            System.out.println("Hau an duoc ma");
        } else {
            System.out.println("Hau khong an duoc ma");
            
        }
        if ((xM - xH) * (yM - yH) == 2 || (xM - xH) * (yM - yH) == -2) {
            System.out.println("Ma an duoc hau"); 
        } else {
            System.out.println("Ma khong an duoc hau");

        }
    }
    
}
