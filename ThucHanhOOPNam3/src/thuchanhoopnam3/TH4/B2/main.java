/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH4.B2;

/**
 *
 * @author phuon
 */
public class main {
    public static void main(String[] args) {
        Diem d1 = new Diem(3, 7);
        Diem d2 = new Diem(9, 3);
        d1.inTTDiem();
        d2.inTTDiem();
        System.out.println("Khoang cách: "+ d1.KhoangCach(d2));
    }
}
