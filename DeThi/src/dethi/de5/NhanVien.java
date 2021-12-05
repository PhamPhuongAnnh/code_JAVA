/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethi.de5;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class NhanVien extends Person {

    private String maNhanVien;
    private double heSoLuong;
    private String donVi;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, double heSoLuong, String donVi) {
        this.maNhanVien = maNhanVien;
        this.heSoLuong = heSoLuong;
        this.donVi = donVi;
    }

    public NhanVien(String maNhanVien, double heSoLuong, String donVi, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maNhanVien = maNhanVien;
        this.heSoLuong = heSoLuong;
        this.donVi = donVi;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Mã nhân viên: ");
        Scanner sc = new Scanner(System.in);
        maNhanVien = sc.nextLine();
        System.out.println("Hệ số lương: ");
        heSoLuong = sc.nextDouble();
        System.out.println("Đơn vị: ");
        sc.nextLine();
        donVi = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Mã nhân viên: "+maNhanVien);
        System.out.println("Hệ số lương: "+heSoLuong);
        System.out.println("Đơn vị: "+donVi);
    }
}
