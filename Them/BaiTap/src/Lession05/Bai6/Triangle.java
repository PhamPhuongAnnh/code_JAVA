/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession05.Bai6;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // nhập 3 canahj của tam giác 
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài 3 cạnh: ");
        this.a = sc.nextInt();
        this.b = sc.nextInt();
        this.c = sc.nextInt();

    }

    // xác định loại tam giác
    public String Loai() {
        if (this.a + this.b > this.c && this.c + this.b > this.a && this.a + this.c > this.b) {
            if (this.a == this.b && this.b == this.c) {
                return ("Tam Giac Deu");
            } else if (this.a == this.b && this.b != this.c || this.a == this.c && this.b != this.c || this.b == this.c && this.c != this.a) {
                return ("Tam giac Can ");
            } else if (this.a * this.a == this.b * this.b + this.c * this.c || this.b * this.b == this.a * this.a + this.c * this.c || this.c * this.c == this.b * this.b + this.a * this.a) {
                return ("Tam giac vuong");
            } else {
                return ("Tam Giac Thuong");
            }
        } else {
            return ("Khong phai tam giac");
        }

    }

    public int chuVi() {
        return this.a + this.b + this.c;
    }

    public double dienTic() {
        double p = chuVi() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }
}
