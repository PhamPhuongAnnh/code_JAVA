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
public class hinhTron implements IHinhHoc {

    private double banKinh;

    public hinhTron() {
    }

    public hinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return Math.PI * 2 * getBanKinh();
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * getBanKinh() * getBanKinh();
    }

    @Override
    public void xuatThongTin() {
        String str = String.format("Hinh tron(r = %.3f): chu vi = %.3f, dien tich = %.3f\n", getBanKinh(), tinhChuVi(), tinhDienTich());
        System.out.println(str);
    }

}
