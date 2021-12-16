/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.test_L08.Model;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class TruongPhong extends NhanVien {

    private double luongTN;

    public TruongPhong() {
    }

    public TruongPhong(double luongTN) {
        this.luongTN = luongTN;
    }

    public TruongPhong(double luongTN, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.luongTN = luongTN;
    }

    public double getLuongTN() {
        return luongTN;
    }

    public void setLuongTN(double luongTN) {
        this.luongTN = luongTN;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();
        Scanner sc = new Scanner(System.in);

        System.out.println("Lương trách nghiệm: ");
        luongTN = sc.nextDouble();
    }

    @Override
    public void xuatTT() {
        super.xuatTT();
        System.out.println("Lương trách nghiệm: " + luongTN);
        System.out.println("Thu nhập: " + thuNhap());

    }

    @Override
    public double thuNhap() {
        double thu = this.getLuong() + this.getLuongTN();
        if (thu <= 15 && thu > 9) {
            thu = thu - thu * 0.1;
        }
        if (thu > 15) {
            thu = thu - thu * 0.12;
        }
        this.setThuNhap(thu);
        return thu;
    }
}
