/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class PhongHoc {
       private String maPhongHoc;
    private String tenPhongHoc;
    private String maMonHoc;
    private String ngayHoc;

    public PhongHoc() {
    }

    public PhongHoc(String maPhongHoc, String tenPhongHoc, String maMonHoc, String ngayHoc) {
        this.maPhongHoc = maPhongHoc;
        this.tenPhongHoc = tenPhongHoc;
        this.maMonHoc = maMonHoc;
        this.ngayHoc = ngayHoc;
    }

    public String getMaPhongHoc() {
        return maPhongHoc;
    }

    public void setMaPhongHoc(String maPhongHoc) {
        this.maPhongHoc = maPhongHoc;
    }

    public String getTenPhongHoc() {
        return tenPhongHoc;
    }

    public void setTenPhongHoc(String tenPhongHoc) {
        this.tenPhongHoc = tenPhongHoc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getNgayHoc() {
        return ngayHoc;
    }

    public void setNgayHoc(String ngayHoc) {
        this.ngayHoc = ngayHoc;
    }
    
}
