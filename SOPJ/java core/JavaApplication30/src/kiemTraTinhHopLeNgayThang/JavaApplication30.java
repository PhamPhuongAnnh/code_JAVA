/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemTraTinhHopLeNgayThang;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        if (y > 0) {

            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (d >= 1 && d <= 31) {
                        System.out.printf("%d/%d/%d: hop le", d, m, y);

                    } else {
                        System.out.printf("%d/%d/%d: khong hop le", d, m, y);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (d >= 1 && d <= 30) {
                        System.out.printf("%d/%d/%d: hop le", d, m, y);

                    } else {
                        System.out.printf("%d/%d/%d: khong hop le", d, m, y);
                    }
                    break;
                case 2:
                    if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                        if (d >= 1 && d <= 29) {
                            System.out.printf("%d/%d/%d: hop le", d, m, y);

                        } else {
                            System.out.printf("%d/%d/%d: khong hop le", d, m, y);
                        }

                    } else {
                        if (d >= 1 && d <= 28) {
                            System.out.printf("%d/%d/%d: hop le", d, m, y);

                        } else {
                            System.out.printf("%d/%d/%d: khong hop le", d, m, y);
                        }

                    }
                    break;

                default:
                    System.out.printf("%d/%d/%d: khong hop le", d, m, y);
                    break;
            }
        } else {
            System.out.printf("%d/%d/%d: khong hop le", d, m, y);
        }
    }

}
