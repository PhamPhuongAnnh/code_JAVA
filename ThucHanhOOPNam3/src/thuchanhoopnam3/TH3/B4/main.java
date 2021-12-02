/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH3.B4;

/**
 *
 * @author phuon
 */

public class main {
    
    public static void main(String[] args) {
        DaGiac tamGiac = new TamGiac();
        tamGiac.nhap();
        tamGiac.hienThi();
        System.out.println("\nChu Vi: "+tamGiac.chuVi());
    }
}
