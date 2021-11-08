/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession05.Bai1;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SanPham {
    private String sanPham;
    private double  donGia;
    private double giamGia;

    public SanPham() {
    }

    public SanPham(String sanPham, double donGia, double giamGia) {
        this.sanPham = sanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
//    tính thuuees nhập khẩu 
    public double thueNhapKhau(){
        return this.donGia*0.1;
    }
    // xuất thông tin ra màn hình 
    public void xuatThongTin(){
        System.out.println("_______________________________");
        System.out.println("Tên Sản Phẩm: "+this.sanPham);
        System.out.println("giá sản phẩm: "+this.donGia);
        System.out.println("giảm giá: "+this.giamGia);
        System.out.println("Thuế nhập khẩu: "+thueNhapKhau());
    }
    // nhập thông tin 
    public void nhapThongTin(){
        System.out.println("Nhập Tên Sản Phẩm: ");
        Scanner sc = new Scanner(System.in);
        this.sanPham = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        this.donGia = sc.nextDouble();
        System.out.println("Nhập giảm giá: ");
        this.giamGia = sc.nextDouble();
    }
    
    
}
