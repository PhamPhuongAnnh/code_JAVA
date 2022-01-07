/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.BKTRA2;

import java.io.Serializable;

/**
 *
 * @author phuon
 */
public class HoaDon implements Serializable{
    private String soHoaDon;
    private String ngayHoaDon; 
    private int soLuong; 

    public HoaDon() {
    }

    public HoaDon(String soHoaDon, String ngayHoaDon, int soLuong) {
        this.soHoaDon = soHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(String soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "soHoaDon=" + soHoaDon + ", ngayHoaDon=" + ngayHoaDon + ", soLuong=" + soLuong + '}';
    }
    
}
