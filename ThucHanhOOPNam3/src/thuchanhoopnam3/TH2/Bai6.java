/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH2;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Bai6 {

    public static int C1(int n) {
        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    public static int giaiThua(int n) {
        int giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }

    public static int sum(int n) {
        int sum = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static float sumC4(int n) {
        float sum = 0;
        for (int i = 2; i <= n; i++) {
            sum += (float) (i - 1) / (i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
//        1
        System.out.println("Tổng S = " + C1(n));
//        2
        int giaithua = 0;
        for (int i = 1; i <= n; i++) {
            giaithua += giaiThua(i);
        }
        System.out.println("Tổng giai thừa: " + giaithua);
//3
        System.out.println("Tổng câu 3: " + sum(n));
//        4
        System.out.println("Câu 4: " + sumC4(n));
    }
}
