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
public class ThongTinHangHoa implements Serializable{
    private String tenHang;
    private String donVi; 
    private int donGia;
    private int soluong; 

    public ThongTinHangHoa() {
    }

    public ThongTinHangHoa(String tenHang, String donVi, int donGia, int soluong) {
        this.tenHang = tenHang;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "ThongTinHangHoa{" + "tenHang=" + tenHang + ", donVi=" + donVi + ", donGia=" + donGia + ", soluong=" + soluong + ", thanh tien: "+thanhTien()+'}';
    }
    public int  thanhTien(){
        return  this.soluong*this.donGia;
    }
    
}
