/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession05.Bai4;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class NhanVien {

    private String hoTen;
    private int namSinh;
    private String diaChi;
    private double tienLuong;
    private int tongGioLamViec;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int namSinh, String diaChi, double tienLuong, int tongGioLamViec) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLamViec = tongGioLamViec;
    }

    public int getTongGioLamViec() {
        return tongGioLamViec;
    }

    public void setTongGioLamViec(int tongGioLamViec) {
        this.tongGioLamViec = tongGioLamViec;
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
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    //nhập thông tin cho nhân viên từ bàn phím 
    public void inputInfo() {
        System.out.println("Nhap HoTen: ");
        Scanner sc = new Scanner(System.in);
        this.hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        this.namSinh = sc.nextInt();
        System.out.println("Nhap dia chi: ");
        sc.nextLine();
        this.diaChi = sc.nextLine();
        System.out.println("Nhap tien luong: ");
        this.tienLuong = sc.nextDouble();
        System.out.println("Nhap tong gio lam Viec: ");
        this.tongGioLamViec = sc.nextInt();
    }

    // in ra tất cỏa các thông tin của nhân viên
    public void printfInfor() {
        System.out.println("______________________________");
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Nam Sinh: " + this.namSinh);
        System.out.println("Dia Chi: " + this.diaChi);
        System.out.println("Tien Luong: " + this.tienLuong);
        System.out.println("Tong So Gio Lam: " + this.tongGioLamViec);
    }
//     tính thưởng: Tổng h làm của nhân viên >=200 thì thưởng = luong * 20%
//    Tổng h làm của nhân viên >=100 và <200  thì thưởng = luong * 10%
//    Tổng h làm của nhân viên <100 thì thưởng = 0

    /**
     *
     * @return
     */
    public double tinhThuong() {
        double tienThuong;
        if (this.tongGioLamViec >= 200) {
            tienThuong = this.tienLuong / 5;
        } else if (this.tongGioLamViec >= 100 && this.tongGioLamViec < 200) {
            tienThuong = this.tienLuong / 10;
        } else {
            tienThuong = 0;
        }
        return tienThuong;
    }

}
