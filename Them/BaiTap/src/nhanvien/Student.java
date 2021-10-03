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
public class Student {

    private String maSV;
    private double diemTB;
    private int namSinh;
    private String lop;

    public Student() {
    }

    public Student(String maSV, double diemTB, int namSinh, String lop) {
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.namSinh = namSinh;
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        maSV = sc.nextLine();
        System.out.println("nhap diem: ");
        diemTB = sc.nextDouble();
        System.out.println("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        System.out.println("Nhap lop: ");
        sc.nextLine();
        lop = sc.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("Nhap ma: " + maSV);

        System.out.println("nhap diem: " + diemTB);

        System.out.println("Nhap nam sinh: " + namSinh);

        System.out.println("Nhap lop: " + lop);

    }
    
    public boolean checkScholarship(){
        if(this.diemTB>=8){
            return true;
        }
        else {
            return false;
        }
    }
}
