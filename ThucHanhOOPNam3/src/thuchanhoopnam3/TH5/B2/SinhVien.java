/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH5.B2;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SinhVien extends Nguoi {

    private String maSV;
    private String tenLop;
    private double diem1;
    private double diem2;
    private double diem3;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenLop, double diem1, double diem2, double diem3, String hoTen, String diaChi, int namSinh) {
        super(hoTen, diaChi, namSinh);
        this.maSV = maSV;
        this.tenLop = tenLop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập mã sinh vien: ");
        Scanner sc = new Scanner(System.in);
        maSV = sc.nextLine();
        System.out.println("Nhập điểm 1: ");
        diem1 = sc.nextDouble();
        System.out.println("Nhập điểm 2: ");
        diem2 = sc.nextDouble();
        System.out.println("Nhập điểm 3: ");
        diem3 = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Điểm 1: " + diem1);
        System.out.println("Điểm 2: " + diem2);
        System.out.println("Điểm 3: " + diem3);
        System.out.println("Điểm trung bình: "+tinhDiemTB());
    }
    
    public double tinhDiemTB(){
        return  (diem1+diem2+diem3)/3;
    }
    
}
