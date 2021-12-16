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
public class TapChi extends TaiLieu{
    private int soPhatHanh2;
    private int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(int soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh2 = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(int soPhatHanh2, int thangPhatHanh, String maTL, String tenNSX, int soPhatHanh) {
        super(maTL, tenNSX, soPhatHanh);
        this.soPhatHanh2 = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh2() {
        return soPhatHanh2;
    }

    public void setSoPhatHanh2(int soPhatHanh2) {
        this.soPhatHanh2 = soPhatHanh2;
    }

    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Số phát hành: ");
        Scanner sc = new Scanner(System.in);
        soPhatHanh2 = sc.nextInt();
        System.out.println("Tháng phát hành: ");
        thangPhatHanh = sc.nextInt();
    }

    @Override
    public String toString() {
        String s = super.toString();
        return "TapChi"+ s + ", soPhatHanh2=" + soPhatHanh2 + ", thangPhatHanh=" + thangPhatHanh + '}';
    }

    
    
}
