/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B1;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author phuon
 */
public class TaiLieu {
    private String maTL;
    private String tenNSX;
    private int soPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTL, String tenNSX, int soPhatHanh) {
        this.maTL = maTL;
        this.tenNSX = tenNSX;
        this.soPhatHanh = soPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }
    
    public void nhap (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã: ");
        maTL = sc.nextLine();
        System.out.println("Tên nhà sản xuất: ");
        tenNSX = sc.nextLine();
        System.out.println("Số bản phát hành: ");
        soPhatHanh = sc.nextInt();
    }

    @Override
    public String toString() {
        return "{" + "maTL=" + maTL + ", tenNSX=" + tenNSX + ", soPhatHanh=" + soPhatHanh;
    }
    
}
