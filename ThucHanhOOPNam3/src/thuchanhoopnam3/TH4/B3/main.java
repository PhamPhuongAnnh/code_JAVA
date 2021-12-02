/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH4.B3;

/**
 *
 * @author phuon
 */
public class main {

    public static void main(String[] args) {
        SoPhuc a = new SoPhuc();
        SoPhuc b = new SoPhuc();
        a.nhapSoPhuc();
        b.nhapSoPhuc();
        System.out.print("Tổng: (");
        a.inSoPhuc();
        System.out.print(")+(");
        b.inSoPhuc();
        System.out.print(")=");
        SoPhuc c = a.cong(b);
        c.inSoPhuc();
        System.out.println("");
        System.out.print("Tích: (");
        a.inSoPhuc();
        System.out.print(")+(");
        b.inSoPhuc();
        System.out.print(")=");
        SoPhuc C = a.nhan(b);
        C.inSoPhuc();
    }
}
