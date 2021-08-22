/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuon
 */
public class SinhVien {

    private String maSinhVien;
    private String tenSinhVien;
    private String ngaySinh;
    private String diaChiLienHe;
    private List<MonHoc> danhSachMonHoc = new ArrayList<MonHoc>();
    private int hocKy;
    private DiemSo diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String tenSinhVien, String ngaySinh, String diaChiLienHe, int hocKy, DiemSo diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.ngaySinh = ngaySinh;
        this.diaChiLienHe = diaChiLienHe;
        this.hocKy = hocKy;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChiLienHe() {
        return diaChiLienHe;
    }

    public void setDiaChiLienHe(String diaChiLienHe) {
        this.diaChiLienHe = diaChiLienHe;
    }

    public List<MonHoc> getDanhSachMonHoc() {
        return danhSachMonHoc;
    }

    public void setDanhSachMonHoc(List<MonHoc> danhSachMonHoc) {
        this.danhSachMonHoc = danhSachMonHoc;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public DiemSo getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(DiemSo diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
   
    public boolean dangKyMonHoc(MonHoc monHoc){
        return this.getDanhSachMonHoc().add(monHoc);
    }

   
    public boolean xoaMonHoc(MonHoc monHoc) {
        return this.getDanhSachMonHoc().remove(monHoc);
    }
}
