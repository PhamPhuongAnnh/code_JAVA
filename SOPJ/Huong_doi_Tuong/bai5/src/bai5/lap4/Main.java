/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.lap4;

/**
 *
 * @author Phương Lan
 */
public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("pham anh", 2001, "Thai Binh", 15000000, 100);
        NhanVien nv = new NhanVien();
        nv.inputInfo();
        nv1.printInfo();
        nv.printInfo();
    }
}
