/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH7.B2;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Main {

    public static void main(String[] args) {
        MaTran m1 = new MaTran();
        m1.nhapMT();
        m1.inMT();
//        System.out.println("Nhập ma trân cộng");
//        MaTran m2 = new MaTran();
//        m2.nhapMT1(m1.getN(), m1.getM());
//        MaTran s = m1.congMaTran(m2);
//        System.out.println("Ma trận cộng: ");
//        s.inMT();
//        System.out.println("");
        System.out.println("Nhập ma trân nhân: ");
        MaTran m3 = new MaTran();
        System.out.println("Nhập số cột của ma trân cần nhân: ");
        Scanner sc = new Scanner(System.in);
        int m31 = sc.nextInt();
        m3.setN(m1.getM());
        m3.setM(m31);
        m3.nhapMT1(m1.getM(), m31);
        m3.inMT();
        System.out.println("Ma trân nhân: ");
        MaTran s3= m1.nhanMaTran(m3);
        s3.inMT();
    }
}
