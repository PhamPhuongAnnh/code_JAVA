/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Bai9_lap1;

/**
 *
 * @author Phương Lan
 */
public class hinhChuNhat implements IHinhHoc {

    private double chieuDai;
    private double chieuRong;

    public hinhChuNhat() {
    }

    public hinhChuNhat(double chieuDai, double chieuRong) {
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

    @Override
    public double tinhChuVi() {
        return 2 * (getChieuDai() + getChieuRong());
    }

    @Override
    public double tinhDienTich() {
        return getChieuDai() * getChieuRong();
    }

    @Override
    public void xuatThongTin() {
        String str = String.format("HCN(%f, %f): chu vi = %.3f, dien tich = %.3f\n", getChieuDai(), getChieuRong(), tinhChuVi(), tinhDienTich());
        System.out.println(str);
    }

}
