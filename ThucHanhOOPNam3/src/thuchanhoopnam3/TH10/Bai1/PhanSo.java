/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH10.Bai1;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class PhanSo {

    private int tu;
    private int mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo() {
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "PhanSo{" + "tu=" + tu + ", mau=" + mau + '}';
    }

    public void nhap() {
        System.out.println("Tu so: ");
        Scanner sc = new Scanner(System.in);
        tu = sc.nextInt();
        System.out.println("Mau so: ");
        mau = sc.nextInt();
    }

    PhanSo congHaiPhanSo(PhanSo p1, PhanSo p2) {
        PhanSo p3 = new PhanSo();
        p3.tu = p1.tu * p2.mau + p1.mau * p2.tu;
        p3.mau = p1.mau * p2.mau;
        return p3;
    }

    PhanSo hieuHaiPhanSo(PhanSo p1, PhanSo p2) {
        PhanSo p3 = new PhanSo();
        p3.tu = p1.tu * p2.mau - p1.mau * p2.tu;
        p3.mau = p1.mau * p2.mau;
        return p3;
    }

    PhanSo tichHaiPhanSo(PhanSo p1, PhanSo p2) {
        PhanSo p3 = new PhanSo();
        p3.tu = p1.tu * p2.tu;
        p3.mau = p1.mau * p2.mau;
        return p3;
    }

    PhanSo thuongHaiPhanSo(PhanSo p1, PhanSo p2) {
        PhanSo p3 = new PhanSo();
        p3.tu = p1.tu * p2.mau;
        p3.mau = p1.mau * p2.tu;
        return p3;
    }

    int uocChung(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    PhanSo rutgon(PhanSo p1){
        p1.tu = p1.tu/uocChung(p1.tu, p1.mau); 
        p1.mau = p1.tu/uocChung(p1.tu, p1.mau); 
        if(p1.tu<0 && p1.mau<0 || p1.mau<0 && p1.tu>0){
            p1.tu  = -p1.tu;
            p1.mau  = -p1.mau;
        }
        return p1; 
    }
    int kiemTraToiGian(PhanSo p1){
        if(uocChung(p1.tu, p1.mau) == 1){
            return 1; 
        }
        else{
            return 0; 
        }
    }
    
}
