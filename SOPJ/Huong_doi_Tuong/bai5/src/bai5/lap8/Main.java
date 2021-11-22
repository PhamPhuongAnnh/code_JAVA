/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.lap8;

/**
 *
 * @author Phương Lan
 */
public class Main {
    public static void main(String[] args) {
        PhanSo ps = new PhanSo(20,10);
        PhanSo ps1 = new PhanSo();
        ps1.input();
        ps.rutgon();
        ps.hienThi();
        ps.nghichDao();
        ps1.rutgon();
        ps1.hienThi();
        ps1.nghichDao();
        
    }
}
