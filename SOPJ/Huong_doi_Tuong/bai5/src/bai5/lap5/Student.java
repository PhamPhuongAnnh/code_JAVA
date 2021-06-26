/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.lap5;

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

    public Student(String maSV, double diemTB, int namSinh, String lop) {
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.namSinh = namSinh;
        this.lop = lop;
    }

    public Student() {
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien: ");
        System.out.print("Ma sinh vien: ");
        this.maSV = sc.nextLine();
        if (checkMa() == false) {
//            System.out.println(this.checkMa());
            System.out.print("Moi nhap lai Ma sinh vien nhieu nhat gom 8 ki tu: ");
            this.maSV = sc.nextLine();
        }
        System.out.print("Diem trung binh: ");
        this.diemTB = sc.nextDouble();
        if (checkDiem() == false) {
//            System.out.println(this.checkDiem());
            System.out.println("Moi nhap lai gia tri diem trung binh từ 0 den 10 diem: ");
            this.diemTB = sc.nextDouble();
        }
        System.out.print("Nam sinh: ");
        this.namSinh = sc.nextInt();
        if (this.checkNam() == false) {
//            System.out.println(this.checkNam());
            System.out.print("Moi nhap lai nam sinh lon hon 2002: ");
            this.namSinh = sc.nextInt();
        }
        System.out.print("Lop: ");
        sc.nextLine();
        this.lop = sc.nextLine();
        if (this.checklop() == false) {
//            System.out.println(this.checkNam());
            System.out.print("Moi nhap lai lop bat dau bang chu cai  A C D: ");
            this.lop = sc.nextLine();

        }
    }

    public void printInfo() {
        System.out.println("__________________________");
        System.out.print("Ma sinh vien: ");
        System.out.println(this.maSV);
        System.out.print("Diem trung binh: ");
        System.out.println(this.diemTB);
        System.out.print("Nam sinh: ");
        System.out.println(this.namSinh);
        System.out.print("Lop: ");
        System.out.println(this.lop);
        if (checkScholarship()) {
            System.out.println("Dat hoc bong");
        } else {
            System.out.println("Khong dat hoc bong");
        }
    }

    public boolean checkMa() {
        boolean flag = true;
        if (this.maSV.length() > 8) {
            System.out.println("Ma sinh vien khong hop le!!!");
            flag = false;
        }
        return flag;
    }

    public boolean checkDiem() {
        boolean flag = true;
        if (this.diemTB < 0 || this.diemTB > 10) {
            System.out.println("Diem trung binh khong hop le!!!");
            flag = false;
        }
        return flag;
    }

    public boolean checkNam() {
        boolean flag = true;
        if (this.namSinh < 2002) {
            System.out.println("Nam sinh khong hop le!!!");
            flag = false;
        }
        return flag;
    }

    public boolean checklop() {
        boolean flag = true;
        char a = this.lop.charAt(0);

        if (a != 'A' && a != 'C' && a != 'D') {
            System.out.println("Lop khong hop le");
            flag = false;
        }
        return flag;
    }

    public boolean checkScholarship() {
        if (this.diemTB >= 8.0) {
            return true;
        } else {
            return false;
        }
    }
}
