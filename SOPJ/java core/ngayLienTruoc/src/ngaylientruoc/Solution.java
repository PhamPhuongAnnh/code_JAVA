 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngaylientruoc;

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
        System.out.println("Ngay hien tai: " + d + "/" + m + "/" + y);
        if (m == 1 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d == 1) {
                if (m == 1) {
                    d = 31;
                    m = 12;
                    y--;
                } else if (m == 8) {
                    d = 31;
                    m--;
                } else {
                    d = 30;
                    m--;
                }

            } else if (d > 1 && d <= 31) {
                d--;
            } else {
                return;
            }
        } else if (m == 2 || m == 4 || m == 6 || m == 9 || m == 11) {
            if (d == 1) {
                d = 31;
                m--;
            } else if (d > 1 && d <= 30) {
                d--;
            } else {
                return;
            }
        } else if (m == 3) {
            if ((y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))) {
                if (d == 1) {
                    d = 29;
                    m--;
                } else if (d > 1 && d <= 29) {
                    d--;
                } else {
                    return;
                }
            } else {
                if (d == 1) {
                    d = 28;
                    m--;
                } else if (d > 1 && d <= 28) {
                    d--;
                } else {
                    return;
                }
            }
        }

        System.out.println("Ngay truoc do: " + d + "/" + m + "/" + y);
    }
    
}
