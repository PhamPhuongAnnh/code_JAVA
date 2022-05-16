/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_chia_Se.De2;

/**
 *
 * @author phuon
 */
public class NhanVien extends Person{
    private String phongBan; 
    private double heSoLuong; 
    private double luongCoBan; 
    private int thamNien; 

    public NhanVien(String phongBan, double heSoLuong, double luongCoBan, int thamNien) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.thamNien = thamNien;
    }

    public NhanVien(String phongBan, double heSoLuong, double luongCoBan, int thamNien, String hoten, String ngaySinh, String gioiTinh, String diachi) {
        super(hoten, ngaySinh, gioiTinh, diachi);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.thamNien = thamNien;
    }

    public NhanVien() {
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

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    

    @Override
    public String toString() {
        return super.toString() + ", phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", luongCoBan=" + luongCoBan + ", thamNien=" + thamNien + ", luongThuLinh="+luongTHuLinh()+ '}';
    }
    double luongTHuLinh(){
        return luongCoBan*heSoLuong*(1+ thamNien/100);
    }
    
}
