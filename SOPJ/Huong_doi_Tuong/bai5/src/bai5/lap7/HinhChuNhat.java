/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.lap7;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class HinhChuNhat {

    public int cd;
    public int cr;

    public HinhChuNhat() {
    }

    public HinhChuNhat(int cd, int cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public void input() {
        System.out.println("Nhap chieu dai chieu rong cua hinh chu nhat: ");
        Scanner sc = new Scanner(System.in);
        this.cd = sc.nextInt();
        this.cr = sc.nextInt();
    }
    
    public double chuvi(){
        double P = (this.cd * this.cr) * 2;
        return P;
    }
    
    public double dienTich(){
        double S = this.cd * this.cr;
        return S;
    }
    
    public void output(){
        System.out.println("Chu vi hinh chu nhat la: "+chuvi());
        System.out.println("Dien tich hinh chu nhat la: " +dienTich());
    }
}
