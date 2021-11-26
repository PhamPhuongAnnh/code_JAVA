/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproject.model;

/**
 *
 * @author phamannh
 */
public class KhachHang {
    private String maKhachHang;
    private String hoTen;   
    private String CMND;
    private String SDT;
    private int Tuoi;
    private String phuongThucThanhToan;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTen, String CMND, String SDT, int Tuoi, String phuongThucThanhToan) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.CMND = CMND;
        this.SDT = SDT;
        this.Tuoi = Tuoi;
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }
    
    
}
