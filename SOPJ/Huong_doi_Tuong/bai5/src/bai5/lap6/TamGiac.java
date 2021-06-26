/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.lap6;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class TamGiac {

    public int a;
    public int b;
    public int c;

    public TamGiac() {
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void input() {
        System.out.println("Nhap do dai 3 canh cua tam gia: ");
        Scanner sc = new Scanner(System.in);
        this.a = sc.nextInt();
        this.b = sc.nextInt();
        this.c = sc.nextInt();
    }

    public void check() {
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if (a == b && b != c || a == c && b != c || c == b && b == a) {
                System.out.println("Tam giac can");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a) {
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("Khong phai la tam giac");
        }
    }

    public double chuVi() {
        double P;
        P = (a + b + c);
        return P;
    }

    public double dienTich() {
        double P = chuVi() / 2;
        double S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        return S;
    }

    public void output() {
        check();
        if (a < b + c && b < a + c && c < b + a) {
            System.out.println("Dien tich: " + dienTich());
            System.out.println("Chu vi: " + chuVi());
        } else {
            return;
        }

    }
}
