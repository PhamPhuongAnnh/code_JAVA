/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_1;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SanPham {
    String ten; 
    double donGia; 
    double giamGia; 
    
    public void nhap(){
        System.out.println("Tên: ");
        Scanner sc = new Scanner(System.in); 
        ten = sc.nextLine(); 
        System.out.println("Đơn giá: ");
        donGia = sc.nextDouble(); 
        System.out.println("Giam giá: ");
        giamGia = sc.nextDouble(); 
    }

    @Override
    public String toString() {
        return "SanPham{" + "ten=" + ten + ", donGia=" + donGia +
                ", giamGia=" + giamGia 
                +", thueNhapKhau= "+getThueNhapKhau()+ '}';
    }
    
    public double getThueNhapKhau(){
        return  donGia*0.1; 
    }
    
    
}
