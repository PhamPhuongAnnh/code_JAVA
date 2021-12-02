/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH3.B3;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class KhachHang {
    private String hoTen;
    private int soNha;
    private String maSoCongTo;

    public KhachHang() {
    }

    public KhachHang(String hoTen, int soNha, String maSoCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }
    
    public void nhap(){
        System.out.println("Nhập họ tên chủ hộ: ");
        Scanner sc = new Scanner(System.in);
        hoTen =  sc.nextLine();
        System.out.println("Nhập so nha: ");
        soNha = sc.nextInt();
        System.out.println("Nhập mã số công tơ: ");
        sc.nextLine();
        maSoCongTo = sc.nextLine();
    }

    @Override
    public String toString() {
        return "hoTen=" + hoTen + ", soNha=" + soNha + ", maSoCongTo=" + maSoCongTo + '}';
    }
    
}
