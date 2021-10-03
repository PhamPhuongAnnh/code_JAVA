/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class TamGiac {

    private int a;
    private int b;
    private int c;

    public TamGiac() {
    }

    public TamGiac(int a, int b, int c) {
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

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        a = sc.nextInt();
        System.out.println("nhap b: ");
        b = sc.nextInt();
        System.out.println("nhap c: ");
        c = sc.nextInt();
    }
    
    public void Xuat(){
        System.out.printf("nhap a: %d\n",a);
        System.out.println("nhap b: "+b);
        System.out.println("nhap c: "+c);

    }
    
}
