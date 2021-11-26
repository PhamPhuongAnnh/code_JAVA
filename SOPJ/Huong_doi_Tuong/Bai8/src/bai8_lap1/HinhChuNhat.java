/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_lap1;

/**
 *
 * @author Phương Lan
 */
public abstract class HinhChuNhat{

    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double getDienTich() {
        return chieuDai  * chieuRong;
    }

    public void hienThiThongTin() {
        System.out.printf("HCN(%f, %f): chu vi = %.3f, dien tich = %.3f\n",getChieuDai(),getChieuRong(), getChuVi(), getDienTich());
    }

}
