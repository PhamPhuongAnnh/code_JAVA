/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.test_L08;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class NhanVienTiepThi extends NhanVien {

    private int doanhSo;
    private double tiLeHH;

    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(int doanhSo, double tiLeHH) {
        this.doanhSo = doanhSo;
        this.tiLeHH = tiLeHH;
    }

    public NhanVienTiepThi(int doanhSo, double tiLeHH, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.tiLeHH = tiLeHH;
    }

    public double getTiLeHH() {
        return tiLeHH;
    }

    public void setTiLeHH(double tiLeHH) {
        this.tiLeHH = tiLeHH;
    }

    public int getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(int doanhSo) {
        this.doanhSo = doanhSo;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.println("Doanh số bán hàng: ");
        doanhSo = sc.nextInt();
        System.out.println("Tỉ lệ hoa hồng: ");
        tiLeHH = sc.nextDouble();
    }

    @Override
    public void xuatTT() {
        super.xuatTT();
        System.out.println("Doanh số bán hàng: " + doanhSo);
        System.out.println("Tỉ lệ hoa hồng: " + tiLeHH);
        System.out.println("Thu nhập: "+thuNhap());

    }

    @Override
    public double thuNhap() {
        double thu = this.getLuong() + this.getDoanhSo() * this.getTiLeHH();
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
