/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_8_lap_1;

/**
 *
 * @author Phương Lan
 */
public class Main {

    public static void main(String[] args) {
        NhanVien tp1 = new TruongPhong(1000, "Pham Phuong Anh", 10000);
        NhanVien tp2 = new TruongPhong(500, "Pham Phuong Lan Anh ", 1000);

        NhanVien lc1 = new LaoCong(5, "Nguyen Anh Pham", 50);
        NhanVien lc2 = new LaoCong(5, "Nguyen Lan Anh", 40);
        NhanVien lc3 = new LaoCong(7, "Nguyen Anh hai", 60);

        tp1.hienThiThongTin();
        System.out.println("");
        tp2.hienThiThongTin();
        System.out.println("");

        lc1.hienThiThongTin();
        System.out.println("");

        lc2.hienThiThongTin();
        System.out.println("");
        lc3.hienThiThongTin();

    }
}
