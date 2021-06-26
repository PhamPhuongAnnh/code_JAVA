/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_8_lap_1;

/**
 *
 * @author Phương Lan
 */
public class LaoCong extends NhanVien{
    private double soGioLamViec;

    public LaoCong(double soGioLamViec, String hoten, double luong) {
        super(hoten, luong);
        this.soGioLamViec = soGioLamViec;
    }

    public LaoCong(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }
    
    
    @Override
    public double getThuNhap() {
        super.setLuong(50*soGioLamViec);
        return 50*soGioLamViec;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("ho ten Lao Cong: "+getHoten());
        System.out.println("luong cua lao cong: "+getLuong());
        System.out.println("so gio lam viec: "+soGioLamViec);
        System.out.println("Luong thu nhap: "+getThuNhap());
    }
    
    
}
