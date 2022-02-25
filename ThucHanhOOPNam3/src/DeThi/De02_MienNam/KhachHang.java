/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi.De02_MienNam;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class KhachHang {

    private String maKH;
    private String tenKH;
    private int namSinh;
    private String diachi;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, int namSinh, String diachi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.namSinh = namSinh;
        this.diachi = diachi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "{maKH=" + maKH + ", tenKH=" + tenKH + ", namSinh=" + namSinh + ", diachi=" + diachi + '}';
    }

    public void nhap() {
        System.out.println("Ma KH: ");
        Scanner sc = new Scanner(System.in);
        maKH = sc.nextLine();

        System.out.println("Ten KH: ");
        tenKH = sc.nextLine();

        System.out.println("Nam Sinh: ");
        namSinh = sc.nextInt();

        System.out.println("Dia chi: ");
        sc.nextLine();
        diachi = sc.nextLine();
    }

}
