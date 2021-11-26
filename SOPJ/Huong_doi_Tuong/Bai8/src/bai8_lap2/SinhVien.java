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
public abstract class SinhVien {

    private String hoten;
    private String nganhHoc;

    public SinhVien() {
    }

    public SinhVien(String hoten, String nganhHoc) {
        this.hoten = hoten;
        this.nganhHoc = nganhHoc;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        if (getDiem() < 4) {
            return "Yeu";
        }
        if (getDiem() < 6 && getDiem() >= 4) {
            return "Trung binh";
        }
        if (getDiem() < 7 && getDiem() >= 6) {
            return "Trung binh kha";
        }
        if (getDiem() < 8 && getDiem() >= 7) {
            return "Kha";
        }
        if (getDiem() < 9 && getDiem() >= 8) {
            return "Gioi";
        } else {
            return "Xuat xac";
        }
    }

    /**
     *
     */
    public void hienTHiThongTin() {
        System.out.printf("SV: %-20s - %s - %.2f - %s\n", getHoten(), getNganhHoc(), getDiem(), getHocLuc());
    }
}
