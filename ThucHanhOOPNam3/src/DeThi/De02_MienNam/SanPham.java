/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi.De02_MienNam;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SanPham {

    private String maSP;
    private String tenSP;
    private double donGia;
    private String ngaySX;
    private int soLuong; 
    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double donGia, String ngaySX, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.soLuong = soLuong;
    }

   
    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhap() {
        System.out.println("Ma SP: ");
        Scanner sc = new Scanner(System.in);
        maSP = sc.nextLine();
        
        System.out.println("Ten SP: ");
        tenSP = sc.nextLine();

        System.out.println("Don Gia: ");
        donGia = sc.nextDouble();

        System.out.println("Ngay san xuat: ");
         sc.nextLine();
         ngaySX = sc.nextLine();
        
        System.out.println("So luong: ");
        soLuong = sc.nextInt();
    }

    @Override
    public String toString() {
        return  "{maSP=" + maSP + ", tenSP=" + tenSP + ", donGia=" + donGia + ", ngaySX=" + ngaySX + ", soLuong=" + soLuong + '}';
    }

   
    
    
}
