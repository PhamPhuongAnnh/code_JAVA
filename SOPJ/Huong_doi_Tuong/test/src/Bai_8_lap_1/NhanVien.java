/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_8_lap_1;

/**
 *
 * @author Phương Lan
 */
public abstract class NhanVien {
    private String hoten;
    private double luong;

    public NhanVien(String hoten, double luong) {
        this.hoten = hoten;
        this.luong = luong;
    }

    public NhanVien() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public abstract double getThuNhap();
    
    public abstract void hienThiThongTin();
}
