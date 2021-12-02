/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH3.B1;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Nguoi {
    private String hoTen;
    private String diaChi;
    private int namSinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
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
    
    public void nhapTT(){
        System.out.println("Nhập họ tên: ");
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh = sc.nextInt();
    }
    
    public void inTT(){
        System.out.println("Họ Tên: "+hoTen);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Năm Sinh: "+ namSinh);
    }
}
