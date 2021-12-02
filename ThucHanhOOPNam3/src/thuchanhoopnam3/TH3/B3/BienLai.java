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
public class BienLai {
    private KhachHang kh;
    private int chiSoCu;
    private int chiSoMoi;

    public BienLai() {
    }

    public BienLai(KhachHang kh, int chiSoCu, int chiSoMoi) {
        this.kh = kh;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    @Override
    public String toString() {
        return "BienLai{" + "kh=" + kh + ", chiSoCu=" + chiSoCu + ", chiSoMoi=" + chiSoMoi + " SoTien: "+tinhTien()+ '}' ;
    }
    
    public void nhap(){
        System.out.println("Nhập thông tin khách hàng: ");
        kh = new KhachHang();
        kh.nhap();
        System.out.println("Nhập chỉ số cũ: ");
        Scanner sc = new Scanner(System.in);
        chiSoCu = sc.nextInt();
        System.out.println("Nhập chỉ số mới: ");
        chiSoMoi = sc.nextInt();
    }
    
    public int tinhTien(){
        return (chiSoMoi - chiSoCu)*85000;
    }
}
