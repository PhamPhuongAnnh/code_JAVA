/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.lap2;

import java.util.Scanner;


/**
 *
 * @author Phương Lan
 */
public class SanPham {

    public String tenSanPham;
    public double donGia;
    public double giamGia;
    public double thue;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap thong tin san pham: ");
      
        System.out.print("Ten San Pham: ");  
        this.tenSanPham = sc.nextLine();
        System.out.print("Đon gia: ");
        this.donGia = sc.nextDouble();
        System.out.print("Giam Gia: ");
        this.giamGia = sc.nextDouble();
    }
    public void hienThi(){
        System.out.println("_____________________________");
        System.out.print("Ten San Pham: ");  
        System.out.println(this.tenSanPham);
        System.out.print("Đon gia: ");
        System.out.println(this.donGia);
        System.out.print("Giam Gia: ");
        System.out.println(this.giamGia);
        System.out.print("Thue nhap khau la: ");
        System.out.println(thue());
    }
    public double thue(){
        this.thue = this.donGia*0.1;
        return this.thue;
    }

}
