/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH10.PhuongTien;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class PTGT {
     private int soMay;
    private String hangSX;
    private int namSX;
    private double giaban;

    public PTGT() {
    }

    public PTGT(int soMay, String hangSX, int namSX, double giaban) {
        this.soMay = soMay;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.giaban = giaban;
    }

    

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getSoMay() {
        return soMay;
    }

    public void setSoMay(int soMay) {
        this.soMay = soMay;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    @Override
    public String toString() {
        return "{soMay=" + soMay + ", hangSX=" + hangSX + ", namSX=" + namSX + ", giaban=" + giaban;
    }

    public void nhap() {
        System.out.println("So may: ");
        Scanner sc = new Scanner(System.in);
        soMay = sc.nextInt();
        System.out.println("Hang san xuat: ");
        sc.nextLine();
        hangSX = sc.nextLine();
        System.out.println("Nam san xuat: ");
        namSX = sc.nextInt();
        System.out.println("Gia ban: ");
        giaban = sc.nextDouble();

    }
}
