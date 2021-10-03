/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class NhanVien {

    private String hoTen;
    private int namSinh;
    private String diaChi;
    private double TienLuong;
    private int gioLamViec;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int namSinh, String diaChi, double TienLuong, int gioLamViec) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.TienLuong = TienLuong;
        this.gioLamViec = gioLamViec;
    }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap mam sinh: ");
        namSinh = sc.nextInt();
        System.out.println("Nhap dia chi: ");
//        sc.nextLine();
        diaChi = sc.nextLine();
        System.out.println("nhap tien: ");
        TienLuong = sc.nextDouble();
        System.out.println("Nhap gio lam viiec: ");
        gioLamViec = sc.nextInt();
    }

    public void xuatThongTin() {
        System.out.println("Ten: " + hoTen);

        System.out.println("mam sinh: " + namSinh);

        System.out.println("dia chi: " + diaChi);

        System.out.println("tien: " + TienLuong);

        System.out.println("gio lam viiec: " + gioLamViec);

    }
    
    public double tinhTHuong(){
        if(this.gioLamViec>=200){
            return this.TienLuong*0.2;
        }
        else if(this.gioLamViec>=100 && this.gioLamViec<200){
            return this.TienLuong*0.1;
        }
        else 
        {
            return 0;
        }
    }
}
