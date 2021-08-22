/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

/**
 *
 * @author phuon
 */
public class MonHoc {
      private String ma;
    private String ten;
    private int tinChi;
    private double giaTien;
    private DiemSo kiemTraGiuaKy;
    private DiemSo thiLanMot;
    private DiemSo thiLanHai;
    private DiemSo thiLai;

    public MonHoc() {
    }

    public MonHoc(String ma, String ten, int tinChi, double giaTien, DiemSo kiemTraGiuaKy, DiemSo thiLanMot, DiemSo thiLanHai, DiemSo thiLai) {
        this.ma = ma;
        this.ten = ten;
        this.tinChi = tinChi;
        this.giaTien = giaTien;
        this.kiemTraGiuaKy = kiemTraGiuaKy;
        this.thiLanMot = thiLanMot;
        this.thiLanHai = thiLanHai;
        this.thiLai = thiLai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTinChi() {
        return tinChi;
    }

    public void setTinChi(int tinChi) {
        this.tinChi = tinChi;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public DiemSo getKiemTraGiuaKy() {
        return kiemTraGiuaKy;
    }

    public void setKiemTraGiuaKy(DiemSo kiemTraGiuaKy) {
        this.kiemTraGiuaKy = kiemTraGiuaKy;
    }

    public DiemSo getThiLanMot() {
        return thiLanMot;
    }

    public void setThiLanMot(DiemSo thiLanMot) {
        this.thiLanMot = thiLanMot;
    }

    public DiemSo getThiLanHai() {
        return thiLanHai;
    }

    public void setThiLanHai(DiemSo thiLanHai) {
        this.thiLanHai = thiLanHai;
    }

    public DiemSo getThiLai() {
        return thiLai;
    }

    public void setThiLai(DiemSo thiLai) {
        this.thiLai = thiLai;
    }
    
}
