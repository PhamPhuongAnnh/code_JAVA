/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B3;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SinhVien {

    private int soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String uuTien;

    public SinhVien() {
    }

    public SinhVien(int soBaoDanh, String hoTen, String diaChi, String uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", uuTien=" + uuTien +"," + khoi()+'}' ;
    }

    public void nhap() {
        System.out.println("Số báo danh: ");
        Scanner sc = new Scanner(System.in);
        soBaoDanh = sc.nextInt();
        System.out.println("Họ tên: ");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.println("Địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.println("Ưu tiên: ");
        uuTien = sc.nextLine();
    }
    
    public String khoi(){
        System.out.println("");
        String s = "";
        return s;
    }
}
