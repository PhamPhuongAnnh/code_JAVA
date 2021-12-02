/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH8.B1;

import thuchanhoopnam3.TH5.B2.*;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SinhVien {

    private String maSV;
    private String hoTen;
    private String diaChi;
    private double diem1;
    private double diem2;
    private double diem3;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String diaChi, double diem1, double diem2, double diem3) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public void nhap() {
        System.out.println("Nhập mã sinh vien: ");
        Scanner sc = new Scanner(System.in);
        maSV = sc.nextLine();
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.println("Nhập điểm 1: ");
        diem1 = sc.nextDouble();
        System.out.println("Nhập điểm 2: ");
        diem2 = sc.nextDouble();
        System.out.println("Nhập điểm 3: ");
        diem3 = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Điểm 1: " + diem1);
        System.out.println("Điểm 2: " + diem2);
        System.out.println("Điểm 3: " + diem3);
        System.out.println("Điểm trung bình: " + tinhDiemTB());
    }

    public double tinhDiemTB() {
        return (diem1 + diem2 + diem3) / 3;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

}
