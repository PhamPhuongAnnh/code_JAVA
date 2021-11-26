/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.bai5_lap5;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Student {

    public String maSV;
    public double diemTB;
    public int namSinh;
    public String lop;

    public Student() {
    }

    public Student(String maSV, double diemTB, int namSinh, String lop) {
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.namSinh = namSinh;
        this.lop = lop;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap ma sinh vien: ");
        this.maSV = sc.nextLine();
        System.out.print("nhap diem trung binh ");
        this.diemTB = sc.nextDouble();
        System.out.print("nhap nam sinh: ");
        this.namSinh = sc.nextInt();
        System.out.print("Nhap lơp: ");
        sc.nextLine();
        this.lop = sc.nextLine();
    }

    public boolean check() {
        boolean flag = true;
        if (this.maSV.length() != 8) {
            System.out.println("Ma sinh vien khong hop le");
            flag = false;
        }
        if (this.diemTB < 0.0 || this.diemTB > 10.0) {
            System.out.println("Diem trung binh khong hop le");
            flag = false;
        }
        if (this.namSinh < 2002) {
            System.out.println("Nam sinh khong hop le");
            flag = false;
        }
        //String.charAt(index i); ABC12345
        // Nhay kep danh cho chuoi. Nhay don dung cho cho ki tu
        char a = this.lop.charAt(0);
        if (a != 'A' && a != 'C' && a != 'D') {
            System.out.println("Lop khong hop le");
            flag = false;
        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }

    public void xuat() {
        System.out.print("Ma sinh vien: ");
        System.out.println(this.maSV);
        System.out.print("Diem trung binh ");
        System.out.println(this.diemTB);
        System.out.print("Nam sinh: ");
        System.out.println(this.namSinh);
        System.out.print("Lop: ");
        System.out.println(this.lop);
        System.out.print("Hoc bong: ");
        System.out.println(this.checkschool());
    }

    public boolean checkschool() {
        if (this.diemTB >= 8.0) {
            return true;
        } else {
            return false;
        }
    }
}
