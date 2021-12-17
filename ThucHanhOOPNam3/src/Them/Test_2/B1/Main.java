/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.Test_2.B1;

/**
 *
 * @author phuon
 */
public class Main {
    public static void main(String[] args) {
        HangThucPham h1= new HangThucPham();
        HangThucPham h2 = new HangThucPham();
        HangThucPham h3 = new HangThucPham();
        h1.nhap();
        h2.nhap();
//        h3.nhap();
        System.out.printf("%3s%20s%30s%30s%30s%30s\n","Ma", "Tên hàng", "Đơn Giá", "Ngày sản xuất", "Ngày hết hạn", "Ghi chú");
        h1.xuat();
        h2.xuat();
//        h3.xuat();
    }
}
