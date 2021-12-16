/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B4;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Person {

    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Ngày sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Địa chỉ: ");
        this.diaChi = sc.nextLine();
        System.out.println("Giới tính: ");
        this.gioiTinh = sc.nextLine();
    }

    @Override
    public String toString() {
        return  "{hoTen=" + this.hoTen + ", ngaySinh=" + this.ngaySinh + ", diaChi=" + this.diaChi + ", gioiTinh=" + this.gioiTinh ;
    }
    
    
}
