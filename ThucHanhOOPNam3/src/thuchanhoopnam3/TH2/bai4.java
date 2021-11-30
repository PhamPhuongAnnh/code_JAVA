/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH2;

import java.util.Scanner;

/**
 * 4
 * Viết chương trình tìm các số nguyên tố nhỏ hơn một số n cho trước a. Chỉ sử
 * dụng chu trình for b. Chỉ sử dụng chu trình while c. Chỉ sử dụng chu trình
 * do-while
 */
public class bai4 {

    public static boolean kiemTraSoNguyenTo(int n) {
        if (n < 2 || (n > 2 && n % 2 == 0)) {
            return false;
        }
        int i;
        for (i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Nhập n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Cau a: ");
        for (int i = 2; i < n; i++) {
            if (kiemTraSoNguyenTo(i) == true) {
                System.out.print("\t" + i);
            }
        }
        System.out.println("");

        System.out.print("Câu b: ");
        int i = 2;
        while (i < n) {
            if (kiemTraSoNguyenTo(i) == true) {
                System.out.print("\t" + i);
            }
            i++;
        }
        System.out.println("");
        i = 1;
        System.out.print("Câu c: ");
        do {
            if (kiemTraSoNguyenTo(i) == true) {
                System.out.print("\t" + i);
            }
            i++;
        } while (i < n);
    }

}
