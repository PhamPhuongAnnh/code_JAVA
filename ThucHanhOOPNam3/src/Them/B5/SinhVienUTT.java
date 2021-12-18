/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B5;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SinhVienUTT extends SinhVien implements Serializable{
    private String donVi;
    private double Luong; 

    public SinhVienUTT() {
    }

    public SinhVienUTT(String donVi, double Luong) {
        this.donVi = donVi;
        this.Luong = Luong;
    }

    public SinhVienUTT(String donVi, double Luong, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.Luong = Luong;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }
    @Override
    public void nhap(){
        super.nhap();
        
        Scanner  sc  = new Scanner(System.in);
        System.out.println("Đơn vị: ");
        donVi = sc.nextLine();
        
        System.out.println("Lương: ");
        Luong = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString()+", donVi=" + donVi + ", Luong=" + Luong + '}';
    }
    
    
}
