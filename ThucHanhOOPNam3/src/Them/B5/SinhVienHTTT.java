/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B5;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SinhVienHTTT extends SinhVien{
    private double hocPhi;

    public SinhVienHTTT() {
    }

    public SinhVienHTTT(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienHTTT(double hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Học phí: ");
        Scanner sc = new Scanner(System.in);
        hocPhi = sc.nextDouble();
    }

    @Override
    public String toString() {
        return ", hocPhi=" + hocPhi + '}';
    }
    
}
