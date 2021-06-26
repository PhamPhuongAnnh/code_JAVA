/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.lap8;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class PhanSo {

    public int tu;
    public int mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void input() {
        System.out.println("Nhap tu so va mau so: ");
        Scanner sc = new Scanner(System.in);
        this.tu = sc.nextInt();
        this.mau = sc.nextInt();

    }

    public int uocChungLN(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (b != a) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    
    public void rutgon(){
        int uc = uocChungLN(this.tu, this.mau);
        int tuM = this.tu/uc;
        int mauM = this.mau/uc;
        this.tu = tuM;
        this.mau = mauM;
    }
    
    public void hienThi(){
        System.out.println("Phan so vua nhap la: "+this.tu+"/"+this.mau);
    }
    
    public void nghichDao(){
               System.out.println("Phan so vua nhap la: "+this.mau+"/"+this.tu);

    }
}
