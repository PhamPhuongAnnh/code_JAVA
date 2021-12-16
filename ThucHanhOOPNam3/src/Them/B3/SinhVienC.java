/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B3;

/**
 *
 * @author phuon
 */
public class SinhVienC extends SinhVien {

    @Override
    public String khoi() {
        System.out.println("");
        String s = "Toán, Văn, Anh";
        return s;
    }

    @Override
    public void nhap() {
        super.nhap();
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "SinhVienC{" + khoi() + '}';
    }
}
