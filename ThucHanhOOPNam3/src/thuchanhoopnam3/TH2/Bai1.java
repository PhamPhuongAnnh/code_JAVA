/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH2;

import java.util.Scanner;

/**
 * Viết chương trình in ra giá trị tăng giảm của biến i cho trước.
 */
public class Bai1 {

    public static void main(String[] args) {
        System.out.println("Nhập số n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Nhập số đơn vị tăng: ");
        int tang = sc.nextInt();
        System.out.println("Nhập số đơn vị giảm: ");
        int giam = sc.nextInt();
        System.out.println("Số n: " + n);
        System.out.println("Số " + n + " sau khi tang " + tang + " đơn vị " + (n + tang));
        System.out.println("Số " + n + " sau khi giam " + giam + " đơn vị " + (n + giam));

    }
}
