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
public class SinhVienATTT extends SinhVien {

    private double diemMaDoc;
    private double diemLapTrinAnToanMang;
    private double diemDieuTraSo;

    public SinhVienATTT() {
    }

    public SinhVienATTT(double diemMaDoc, double diemLapTrinAnToanMang, double diemDieuTraSo, String hoten, String nganhHoc) {
        super(hoten, nganhHoc);
        this.diemMaDoc = diemMaDoc;
        this.diemLapTrinAnToanMang = diemLapTrinAnToanMang;
        this.diemDieuTraSo = diemDieuTraSo;
    }

    public double getDiemMaDoc() {
        return diemMaDoc;
    }

    public void setDiemMaDoc(double diemMaDoc) {
        this.diemMaDoc = diemMaDoc;
    }

    public double getDiemLapTrinAnToanMang() {
        return diemLapTrinAnToanMang;
    }

    public void setDiemLapTrinAnToanMang(double diemLapTrinAnToanMang) {
        this.diemLapTrinAnToanMang = diemLapTrinAnToanMang;
    }

    public double getDiemDieuTraSo() {
        return diemDieuTraSo;
    }

    public void setDiemDieuTraSo(double diemDieuTraSo) {
        this.diemDieuTraSo = diemDieuTraSo;
    }

    @Override
    public void hienTHiThongTin() {
        super.setNganhHoc("ATTT");
        
        super.hienTHiThongTin(); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public double getDiem() {
        return (getDiemMaDoc() * 2 + getDiemLapTrinAnToanMang() * 2 + getDiemDieuTraSo()) / 5;
    }

}
