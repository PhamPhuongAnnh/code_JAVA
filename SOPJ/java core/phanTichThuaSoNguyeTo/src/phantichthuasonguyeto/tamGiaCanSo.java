/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phantichthuasonguyeto;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class tamGiaCanSo {

    public static void main(String[] args) {
        System.out.println("Nhap chieu cao cua tam gia");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int i, j, z, y;
        for (i = 1; i <= h; i++) {
            for (j = 0; j <= h - i - 1; j++) {
                System.out.printf(" ");
            }
            for (y = i; y < i * 2; y++) {
                if (y <= i*2/2) {
                    System.out.printf("%d", y % 10 - i + 1);
                } else {
                    System.out.printf("%d", y % 10 - i - 1);

                }
            }
            for (z = y - 2; z >= i; z--) {
                System.out.printf("%d", z % 10);
            }

            System.out.printf("\n");
        }
    }

}
