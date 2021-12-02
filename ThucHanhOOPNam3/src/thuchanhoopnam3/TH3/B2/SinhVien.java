/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH3.B2;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SinhVien {
    private String hoTen;
    private int namSinh;
    private int tuoi;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String hoTen, int namSinh, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", tuoi=" + tuoi + ", lop=" + lop + '}';
    }
    
    public void nhap(){
        System.out.println("Nhập họ tên:");
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh = sc.nextInt();
        System.out.println("Nhập tuổi: ");
        tuoi = sc.nextInt();
        System.out.println("Nhập lớp: ");
        sc.nextLine();
        lop = sc.nextLine();
    }
}
