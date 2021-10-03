/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class PhanSo {

    private int tu;
    private int mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu: ");
        tu = sc.nextInt();
        System.out.println("nhap mau: ");
        mau = sc.nextInt();
    }

//    lập hàm ước cung lớn nhất 
    public int uocChung() {
        while (this.tu != this.mau) {
            if (this.tu > this.mau) {
                this.tu = this.tu - this.mau;
            } else {
                this.mau = this.mau - this.tu;
            }
        }
        return this.mau;
    }

//    public class UocChungLonNhat {
//
//        public static void main(String[] args) {
//           3 12
    //  12 = 12-3 3 9
    // 9 -6 3 6
//            while (num1 != num2) {
//                if (num1 > num2) {
//                    num1 = num1 - num2;
//                } else {
//                    num2 = num2 - num1;
//                }
//            }
//            System.out.printf("Ước chung lớn nhất là: %d", num2);
//        }
//    }
    
    // hàm rút gọn 
    
}
