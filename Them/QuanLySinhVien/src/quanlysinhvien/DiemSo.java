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
public class DiemSo {

    private float thangMuoi;
    private float thangBon;

    public DiemSo() {
    }

    public DiemSo(float thangMuoi, float thangBon) {
        this.thangMuoi = thangMuoi;
        this.thangBon = thangBon;
    }

    public float getThangMuoi() {
        return thangMuoi;
    }

    public void setThangMuoi(float thangMuoi) {
        this.thangMuoi = thangMuoi;
    }

    public float getThangBon() {
        return thangBon;
    }

    public void setThangBon(float thangBon) {
        this.thangBon = thangBon;
    }

    public String thangBonDangChu() {
        String phanLoai = "";
        if (this.getThangBon() > 3.5) {
            phanLoai = "A";
        } else if (this.getThangBon() > 3.2 && this.getThangBon() <= 3.5) {
            phanLoai = "B+";
        } else if (this.getThangBon() > 2.5 && this.getThangBon() <= 3.2) {
            phanLoai = "B";
        } else if (this.getThangBon() > 2 && this.getThangBon() <= 2.5) {
            phanLoai = "C+";
        } else if (this.getThangBon() > 1.5 && this.getThangBon() <= 2) {
            phanLoai = "C";
        } else if (this.getThangBon() > 1 && this.getThangBon() <= 1.5) {
            phanLoai = "D+";
        } else if (this.getThangBon() > 0 && this.getThangBon() <= 1) {
            phanLoai = "D";
        } else {
            phanLoai = "F";
        }
        return phanLoai;
    }

    public String xepLoai() {
        String xepLoai = "";

        if (this.getThangMuoi() >= 8.5 || this.getThangBon() >= 3.5) {
            xepLoai = "Xuất sắc";
        } else if ((this.getThangMuoi() >= 8 && this.getThangMuoi() < 8.5) || (this.getThangBon() >= 3.2 && this.getThangBon() < 3.5)) {
            xepLoai = "Giỏi";
        } else if ((this.getThangMuoi() >= 7 && this.getThangMuoi() < 8) || (this.getThangBon() >= 2.5 && this.getThangBon() < 3.2)) {
            xepLoai = "Khá";
        } else if ((this.getThangMuoi() >= 5 && this.getThangMuoi() < 7) || (this.getThangBon() >= 2 && this.getThangBon() < 2.5)) {
            xepLoai = "Trung bình";
        } else if ((this.getThangMuoi() >= 4 && this.getThangMuoi() < 5) || (this.getThangBon() >= 1 && this.getThangBon() < 2)) {
            xepLoai = "Yếu";
        } else {
            xepLoai = "Kém";
        }

        return xepLoai;
    }
}

