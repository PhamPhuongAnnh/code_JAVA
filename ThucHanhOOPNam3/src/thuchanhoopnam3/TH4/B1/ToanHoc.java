/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH4.B1;

import thuchanhoopnam3.TH2.*;
import java.util.Scanner;

/**
 * Xây dựng lớp ToanHoc, với n là số nguyên dương. 1. Kiểm tra xem một số nguyên
 * n có phải là số nguyên tố hay không ? 2. Kiểm tra xem một nguyên n có phải là
 * số hoàn hảo hay không ? 3. In ra các số chính phương <=n (n nhập tử bàn phím).
 * 4. Tính phần tử thứ n của dãy Fibonaci: public static int tinhFibo(int n)
 * Với công thức truy hồi được tính như sau:
 * Ln = 2 (n =0)
 * Ln = 1  (n = 1)
 *Ln = L(n-1) + L(n-2) (n>1)
 */
public class ToanHoc {

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

    public static boolean kiemTraSoHoanHao(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) //tổng các ước số của a
            {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean kiemTraSoChinhPhuong(int n) {
        for (int i = 0; i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    static int fibocacci(int n) {
        int F0 = 1, F1 = 1, Fn = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                Fn = 1;
            } else {
                Fn = F0 + F1;
                F0 = F1;
                F1 = Fn;
            }
        }
        return Fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();

//        1
        if (kiemTraSoNguyenTo(n) == true) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không là số nguyên tố");
        }

//         2
        if (kiemTraSoHoanHao(n)) {
            System.out.println(n + " là số hoàn hảo");

        } else {
            System.out.println(n + " không là số hoàn hảo");
        }
//        3
        System.out.print("số chính phương <= " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (kiemTraSoChinhPhuong(i)) {
                System.out.print("\t" + i);
            }
        }
//        4
        System.out.println("\nFibocaci: "+fibocacci(n));
    }
}
