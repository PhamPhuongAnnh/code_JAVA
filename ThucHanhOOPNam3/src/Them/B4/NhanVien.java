/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B4;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class NhanVien extends Person implements Serializable{

    private String phongBan;
    private double heSoLuong;
    private int thamNien;
    private double luongCB;

    public NhanVien() {
    }

    public NhanVien(String phongBan, double heSoLuong, int thamNien, double luongCB) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCB = luongCB;
    }

    public NhanVien(String phongBan, double heSoLuong, int thamNien, double luongCB, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCB = luongCB;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
// nhập nhân viên 
    @Override
    public void nhap() {
        super.nhap();// lấy hàm nhập từ bên cha sang 
        System.out.println("Phòng ban: ");
        Scanner sc = new Scanner(System.in);
        phongBan = sc.nextLine();
        System.out.println("Hệ số lương: ");
        heSoLuong = sc.nextDouble();
        System.out.println("Thâm niên: ");
        thamNien = sc.nextInt();
        System.out.println("Lương cơ bản: ");
        luongCB =  sc.nextDouble();
    }

    @Override
    public String toString(){
        String s = super.toString();
        return s+ ", phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luongCB=" + luongCB + ", Luong thuc linh: "+luongThucLinh()+'}';
    }
    public double luongThucLinh(){
        return luongCB*heSoLuong*(1+thamNien/100);
    }
}
