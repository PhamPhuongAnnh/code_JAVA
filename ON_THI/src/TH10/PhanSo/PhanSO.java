/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH10.PhanSo;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class PhanSO {

    private int tu;
    private int mau;

    public PhanSO() {
    }

    public PhanSO(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void nhap() {
        System.out.println("Nhap tu: ");
        Scanner sc = new Scanner(System.in);
        tu = sc.nextInt();
        System.out.println("Nhap mau: ");
        mau = sc.nextInt();

    }

    @Override
    public String toString() {
        return "PhanSO{" + tu + "/" + mau + '}';
    }

    PhanSO cong(PhanSO p1) {
        PhanSO p2 = new PhanSO();
        p2.tu = this.tu * p1.mau + p1.tu * this.mau;
        p2.mau = this.mau * p1.mau;
        return p2;
    }

    PhanSO hieu(PhanSO p1) {
        PhanSO p2 = new PhanSO();
        p2.tu = this.tu * p1.mau - p1.tu * this.mau;
        p2.mau = this.mau * p1.mau;
        return p2;
    }

    PhanSO nhan(PhanSO p1) {
        PhanSO p2 = new PhanSO();
        p2.tu = this.tu * p1.tu;
        p2.mau = this.mau * p1.mau;
        return p2;
    }

    PhanSO chia(PhanSO p1) {
        PhanSO p2 = new PhanSO();
        p2.tu = this.tu * p1.mau;
        p2.mau = this.mau * p1.tu;
        return p2;
    }

    int uocChung(int a, int b) {
        if(a < 0 ){
            a = -a;
        }
        if(b<0){
            b = -b;
        }
        int uoc = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                uoc = i;
            }
        }
//        System.out.println(uoc);
        return uoc;

    }

    boolean kiemTraToiGian(PhanSO p1) {
        if (uocChung(p1.tu, p1.mau) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void toiGian() {
        int a = uocChung(this.tu, this.mau);
        this.tu = this.tu / a;
        this.mau = this.mau / a;
        
        if (this.tu < 0 && this.mau < 0 || this.tu > 0 && this.mau < 0) {
            this.tu = this.tu * (-1);
            this.mau = this.mau * (-1);
        }
    }
  
}
