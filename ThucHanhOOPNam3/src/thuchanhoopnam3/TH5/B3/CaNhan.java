/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH5.B3;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class CaNhan {

    private String hoten;
    private int tuoi;
    private int namSinh;
    private String ngheNghiep;

    public CaNhan() {
    }

    public CaNhan(String hoten, int tuoi, int namSinh, String ngheNghiep) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void nhap() {
        System.out.println("Nhập họ tên: ");
        Scanner sc = new Scanner(System.in);
        hoten = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        tuoi = sc.nextInt();
        System.out.println("Nhập năm sinh: ");
        namSinh = sc.nextInt();
        System.out.println("Nhập nghề nghiệp: ");
        sc.nextLine();
        ngheNghiep = sc.nextLine();

    }

    public void xuat() {
        System.out.println("Họ tên: " + hoten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Nghề nghiệp: "+ngheNghiep);
    }
}
