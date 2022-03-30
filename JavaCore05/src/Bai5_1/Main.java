/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_1;

/**
 *
 * @author phuon
 */
public class Main {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham(); 
        SanPham sp2= new SanPham(); 
        
        System.out.println("Nhap sp1");
        sp1.nhap();
        System.out.println("Nhap sp2");
        sp2.nhap();
        
        
        System.out.println(sp1.toString());
        System.out.println(sp2.toString());
        
        
    }
}
