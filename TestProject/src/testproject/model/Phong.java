/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproject.model;

/**
 *
 * @author phamannh
 */
public class Phong {
    private String maPhong;
    private int soTang;
    private int loaiPhong;  
    public String trangThai;
    private double giaPhong;

    public Phong() {
    }

    public Phong(String maPhong, int soTang, int loaiPhong, String trangThai, double giaPhong) {
        this.maPhong = maPhong;
        this.soTang = soTang;
        this.loaiPhong = loaiPhong;
        this.trangThai = trangThai;
        this.giaPhong = giaPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(int loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

}
