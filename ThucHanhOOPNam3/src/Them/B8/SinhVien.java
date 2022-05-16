/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B8;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SinhVien {
    private String maSV;
    private String hoTen; 
    private String ngaySinh;
    private String gioiTinh;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemTB=" + diemTB + '}';
    }
     public void nhap() {
        System.out.println("Mã sinh viên: ");
        Scanner sc = new Scanner(System.in);
        maSV = sc.nextLine();
        System.out.println("Họ tên: ");
        hoTen = sc.nextLine();

        System.out.println("Ngày sinh: ");
        ngaySinh = sc.nextLine();

        System.out.println("Giới tính: ");
        gioiTinh = sc.nextLine();

        System.out.println("Diểm trung bình: ");
        diemTB = sc.nextDouble();

    }

}
