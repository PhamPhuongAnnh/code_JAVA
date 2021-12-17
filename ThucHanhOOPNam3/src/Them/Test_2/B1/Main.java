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

    public static void check(HangThucPham h1) {
        if (h1.getMaHang().equals("")) {
            System.out.println("");
        } else {
            h1.xuat();
        }
    }

    public static void main(String[] args) {
        HangThucPham h1 = new HangThucPham();
        HangThucPham h2 = new HangThucPham();
        HangThucPham h3 = new HangThucPham();
        h1.nhap();
        h2.nhap();
        h3.nhap();
        if (!h1.getMaHang().equals("") || !h2.getMaHang().equals("") || !h3.getMaHang().equals("")) {
            System.out.printf("%4s%20s%30s%30s%30s%30s\n", "Ma", "Tên hàng", "Đơn Giá", "Ngày sản xuất", "Ngày hết hạn", "Ghi chú");
        }
        check(h1);
        check(h2);
        check(h3);

    }
}
