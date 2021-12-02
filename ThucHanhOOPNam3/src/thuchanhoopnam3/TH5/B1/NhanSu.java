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
public class NhanSu extends Nguoi {

    private String maNhanSu;
    private double heSoChuc;
    private double heSoLuong;
    private double luongCB;
    public NhanSu() {
    }

    public NhanSu(String maNhanSu, double heSoChuc, double heSoLuong, String hoTen, String diaChi, int namSinh) {
        super(hoTen, diaChi, namSinh);
        this.maNhanSu = maNhanSu;
        this.heSoChuc = heSoChuc;
        this.heSoLuong = heSoLuong;
    }
    
    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public double getHeSoChuc() {
        return heSoChuc;
    }

    public void setHeSoChuc(double heSoChuc) {
        this.heSoChuc = heSoChuc;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập mã nhân sự: ");
        Scanner sc = new Scanner(System.in);
        maNhanSu = sc.nextLine();
        System.out.println("Nhập hệ số chức vụ: ");
        heSoChuc = sc.nextDouble();
        System.out.println("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Mã nhân sự: " + maNhanSu);
        System.out.println("Hệ số chức vụ: " + heSoChuc);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Luong: "+luong());
    }
    public double luong(){
        return (heSoLuong+heSoChuc)*luongCB-heSoLuong*luongCB*0.05;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
}
