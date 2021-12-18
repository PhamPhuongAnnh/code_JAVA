/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.Test_3_b1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Account {

    private long soTK;
    private String tenTk;
    private double soTien;
    private final double lai = 0.035;

    public Account() {
    }

    public Account(long soTK, String tenTk) {
        this.soTK = soTK;
        this.tenTk = tenTk;
        this.soTien = 50;
    }

    public Account(long soTK, String tenTk, double soTien) {
        this.soTK = soTK;
        this.tenTk = tenTk;
        this.soTien = soTien;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTk() {
        return tenTk;
    }

    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return "Account{" + "soTK=" + soTK + ", tenTk=" + tenTk + ", soTien=" + currencyFormatter.format(soTien) + '}';
    }

    public void nhap() {
        System.out.println("Số tài khoản: ");
        Scanner sc = new Scanner(System.in);
        soTK = sc.nextLong();
        System.out.println("Tên tài khoản: ");
        sc.nextLine();
        tenTk = sc.nextLine();
        System.out.println("Số tiền: ");
        soTien = sc.nextDouble();
    }

    public void napTien(double sotien) {
        this.soTien = this.soTien + sotien;
    }

    public void rutTien(double sotien) {
        double phi = 3000;
        if (sotien > this.soTien) {
            System.out.println("Không đủ số dư để rút");
        } else {
            this.soTien = this.soTien - (sotien + phi);
        }

    }

    public double daoHan() {
        this.soTien = this.soTien + (this.soTien * lai);
        return this.soTien;
    }

    public void chuyenKhoan(Account acc, double sotien) {
        this.soTien = this.soTien - sotien;
        acc.soTien += sotien;
    }
}
