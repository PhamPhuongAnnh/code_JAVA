/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH10.HoDan;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class NhanSU {

    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String ngheNghiep;

    public NhanSU() {
    }

    public NhanSU(String hoTen, int tuoi, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
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

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    @Override
    public String toString() {
        return "{hoTen=" + hoTen + ", tuoi=" + tuoi + ", namSinh=" + namSinh + ", ngheNghiep=" + ngheNghiep + '}';
    }

    public void nhap() {
        System.out.println("Ho ten: ");
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();

        System.out.println("Tuoi: ");
        tuoi = sc.nextInt();

        System.out.println("Nam sinh: ");
        namSinh = sc.nextInt();

        System.out.println("Nghe nghiep: ");
        sc.nextLine();
        ngheNghiep = sc.nextLine();
    }
}
