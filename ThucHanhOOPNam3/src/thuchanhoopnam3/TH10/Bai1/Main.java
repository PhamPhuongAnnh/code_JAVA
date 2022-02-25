/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH10.Bai1;

/**
 *
 * @author phuon
 */
public class Main {

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        p1.nhap();
        PhanSo p2 = p1.rutgon(p1);
        System.out.println(p1.getTu());
        System.out.println(p1.getMau());
    }
}
