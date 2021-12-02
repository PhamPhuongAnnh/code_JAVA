/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH5.B1;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class main {

    public static void main(String[] args) {
        Nguoi n1 = new Nguoi();
        Nguoi n2 = new Nguoi();
        NhanSu n3 = new NhanSu();
        NhanSu n4 = new NhanSu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập luong cơ bản: ");
        double d = sc.nextDouble();
        n3.setLuongCB(d);
        n4.setLuongCB(d);
        n1.nhap();
        n2.nhap();
        n3.nhap();
        n4.nhap();
        n1.xuat();
        n2.xuat();
        n3.xuat();
        n4.xuat();

    }
}
