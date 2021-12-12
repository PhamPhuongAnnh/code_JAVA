/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B1;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Sach extends TaiLieu{
    private String tenTG;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTG, int soTrang) {
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public Sach(String tenTG, int soTrang, String maTL, String tenNSX, int soPhatHanh) {
        super(maTL, tenNSX, soPhatHanh);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    @Override
    public void nhap(){
        super.nhap();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên tác giả: ");
        tenTG = sc.nextLine();
        System.out.println("Số trang: ");
        soTrang = sc.nextInt();
    }
    @Override
    public String toString() {
        String s = super.toString();
        return "Sach"+ s + ", tenTG=" + tenTG + ", soTrang=" + soTrang + '}';
    }
    
}
