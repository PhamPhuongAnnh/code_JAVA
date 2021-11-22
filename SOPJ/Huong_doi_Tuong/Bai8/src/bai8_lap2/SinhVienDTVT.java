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
public class SinhVienDTVT extends SinhVien {

    private double diemTDS, diemTKModule, diemVDK;

    public SinhVienDTVT() {
    }

    public SinhVienDTVT(double diemTDS, double diemTKModule, double diemVDK, String hoten, String nganhHoc) {
        super(hoten, nganhHoc);
        this.diemTDS = diemTDS;
        this.diemTKModule = diemTKModule;
        this.diemVDK = diemVDK;
    }

    public double getDiemTDS() {
        return diemTDS;
    }

    public void setDiemTDS(double diemTDS) {
        this.diemTDS = diemTDS;
    }

    public double getDiemTKModule() {
        return diemTKModule;
    }

    public void setDiemTKModule(double diemTKModule) {
        this.diemTKModule = diemTKModule;
    }

    public double getDiemVDK() {
        return diemVDK;
    }

    public void setDiemVDK(double diemVDK) {
        this.diemVDK = diemVDK;
    }

    @Override
    public void hienTHiThongTin() {
        super.setNganhHoc("DTVT");

        super.hienTHiThongTin();
    }

    @Override
    public double getDiem() {
        return (getDiemVDK() * 2 + getDiemTDS() + getDiemTKModule()) / 4;
    }
}
