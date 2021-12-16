/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.Abstract;

/**
 *
 * @author phuon
 */
public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVienKiThuat();
        SinhVien sv1 = new SinhVienKinhTe();
        sv.MonHoc();
        sv1.MonHoc();
        SinhVien sv2 = new SinhVienLuat();
        sv2.nhap();
        sv2.MonHoc();
    }
}