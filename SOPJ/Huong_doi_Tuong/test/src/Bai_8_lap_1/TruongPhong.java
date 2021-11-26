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
public class  TruongPhong extends NhanVien{

    private double luongTrachNghiem;

    public TruongPhong(double luongTrachNghiem, String hoten, double luong) {
        super(hoten, luong);
        this.luongTrachNghiem = luongTrachNghiem;
    }

    public TruongPhong(double luongTrachNghiem) {
        this.luongTrachNghiem = luongTrachNghiem;
    }

    public double getLuongTrachNghiem() {
        return luongTrachNghiem;
    }

    public void setLuongTrachNghiem(double luongTrachNghiem) {
        this.luongTrachNghiem = luongTrachNghiem;
    }
    
    @Override
    public double getThuNhap() {
        return getLuong()+ luongTrachNghiem;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("ho ten truong phong: "+ getHoten());
        System.out.println("luong truong phong: "+getLuong());
        System.out.println("luong thu nhap cua truong phong: "+getThuNhap());
        
    }
    
}
