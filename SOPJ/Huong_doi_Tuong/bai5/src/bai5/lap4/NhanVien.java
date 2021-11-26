/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.lap4;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class NhanVien {
    public String hoTen;
    public int namSinh;
    public String diaChi;
    public double tienLuong;
    public int tongGioLam;
    public double thuong;
    
    public NhanVien() {
    }

    public NhanVien(String hoTen, int namSinh, String diaChi, double tienLuong, int tongGioLam) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin nhan vien: ");
        System.out.print("Ho va ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nam sinh: ");
        this.namSinh = sc.nextInt();
        System.out.print("Dia chi: ");
        sc.nextLine();
        this.diaChi = sc.nextLine();
        System.out.print("Tien luong: ");
        this.tienLuong = sc.nextDouble();
        System.out.print("Tong gio lam: ");
        this.tongGioLam = sc.nextInt();
    }
    
    public void printInfo(){
        System.out.println("____________________");
        System.out.println("Nhap thong tin nhan vien: ");
        System.out.print("Ho va ten: ");
        System.out.println(this.hoTen);
        System.out.print("Nam sinh: ");
        System.out.println(this.namSinh);
        System.out.print("Dia chi: ");
        System.out.println(this.diaChi);
        System.out.print("Tien luong: ");
        System.out.println(this.tienLuong);
        System.out.print("Tong gio lam: ");
        System.out.println(this.tongGioLam);
        System.out.print("Thuong: ");
        System.out.println(thuong());
    }
    
    public double thuong(){
        if(this.tongGioLam >=200){
            this.thuong = this.tienLuong * 0.2;
        }
        else if(this.tongGioLam <200 && this.tongGioLam>=100){
            this.thuong = this.tienLuong * 0.1;
        }
        else {
            this.thuong = 0;
        }
        return this.thuong;
    }
    
}
