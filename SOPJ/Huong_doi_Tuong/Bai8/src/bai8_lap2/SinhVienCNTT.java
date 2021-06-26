/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_lap2;

/**
 *
 * @author Phương Lan
 */
public class SinhVienCNTT extends SinhVien {

    private double diemWeb, diemAndroid, diemNhung;

    public SinhVienCNTT() {
    }

    public SinhVienCNTT(double diemWeb, double diemAndroid, double diemNhung, String hoten, String nganhHoc) {
        super(hoten, nganhHoc);
        this.diemWeb = diemWeb;
        this.diemAndroid = diemAndroid;
        this.diemNhung = diemNhung;
    }

    public double getDiemWeb() {
        return diemWeb;
    }

    public void setDiemWeb(double diemWeb) {
        this.diemWeb = diemWeb;
    }

    public double getDiemAndroid() {
        return diemAndroid;
    }

    public void setDiemAndroid(double diemAndroid) {
        this.diemAndroid = diemAndroid;
    }

    public double getDiemNhung() {
        return diemNhung;
    }

    public void setDiemNhung(double diemNhung) {
        this.diemNhung = diemNhung;
    }

    @Override
    public void hienTHiThongTin() {
        super.setNganhHoc("CNTT");

        super.hienTHiThongTin(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDiem() {
        return (getDiemWeb() + getDiemAndroid() * 2 + getDiemNhung() * 2) / 5;
    }

}
