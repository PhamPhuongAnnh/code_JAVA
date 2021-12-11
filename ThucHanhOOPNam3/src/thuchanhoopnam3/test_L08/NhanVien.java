/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.test_L08;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class NhanVien {

    private String maNV;
    private String hoTen;
    private double luong;
    private double thuNhap;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void nhapTT() {
        System.out.println("Mã nhân viên: ");
        Scanner sc = new Scanner(System.in);
        maNV = sc.nextLine();
        System.out.println("Họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Lương: ");
        luong = sc.nextDouble();
    }

    public void xuatTT() {
        System.out.println("------------------------------------");
        System.out.println("Mã nhân viên: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương: " + luong);

    }

    public double thuNhap() {
        double  thu = this.getLuong();
        if (thu <= 15 && thu > 9) {
            thu = thu - thu * 0.1;
        }
        if (thu > 15) {
            thu = thu - thu * 0.12;
        }
        return thu;
    }

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }
}
