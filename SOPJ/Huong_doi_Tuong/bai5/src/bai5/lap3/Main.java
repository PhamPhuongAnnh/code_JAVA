/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.lap3;

/**
 *
 * @author Phương Lan
 */
public class Main {
    public static void main(String[] args) {
       SanPham sp1 = new SanPham("a", 10000);
        SanPham sp2 = new SanPham("b", 15000, 0.3);
        sp1.hienThi();
        
        sp2.hienThi();
        
    }
}
