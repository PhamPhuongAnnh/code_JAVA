/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession05;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SinhVien {
    private String hoTen;
    private String lop;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String lop, double diemTB) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemTB = diemTB;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    // nhập thông tin 
    public void input(){
        System.out.println("Nhap Ten: ");
        Scanner sc = new Scanner(System.in);
        this.hoTen = sc.nextLine();
        System.out.println("Nhap Lop: ");
        this.lop = sc.nextLine();
        System.out.println("Nhap diem: ");
        this.diemTB = sc.nextDouble();
    }
    // xuất thông tin
    public void output(){
        System.out.println("Ten: "+this.hoTen);
        System.out.println("Lop: "+this.lop);
        System.out.println("DiemTB: "+this.diemTB);
        
    }
    public void XepLoai(){
        if(this.diemTB<5){
            System.out.println("TB");
        }
        if(this.diemTB>5 && this.diemTB<8){
            System.out.println("Kha");
        }
        else{
            System.out.println("Gioi");
        }
    }
} 
