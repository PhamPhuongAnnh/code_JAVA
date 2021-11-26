/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngayketiep;

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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Ngay hien tai: " + d + "/" + m + "/" + y);
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {

            if (d == 31) {
                if (m == 12) {
                    d = 1;
                    m = 1;
                    y++;
                } else {
                    d = 1;
                    m++;
                }
            } else if (d > 0 && d < 31) {
                d++;
            } else {
                return;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d == 30) {
                d = 1;
                m++;
            } else if (d > 0 && d < 30) {
                d++;
            } else {
                return;
            }
        } else if (m == 2) {
            if ((y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))) {
                if (d == 29) {
                    d = 1;
                    m++;
                } else if (d > 0 && d < 29) {
                    d++;
                } else {
                    return;
                }
            } else {
                if (d == 28) {
                    d = 1;
                    m++;
                } else if (d > 0 && d < 28) {
                    d++;
                } else {
                    return;
                }
            }
        }
        System.out.println("Ngay ke tiep: " + d + "/" + m + "/" + y);
    }
    
}
