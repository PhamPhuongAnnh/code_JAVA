/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH1;

import java.util.Scanner;

/**
 Viết chương trình:
1. Khai báo (import) lớp Scanner trong gói java.util
2. Sử dụng phương thức nextLine () của lớp để nhập vào một xâu và in xâu vừa nhập
ra màn hình
 */
public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập vào một chuỗi kí tự: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Chuỗi vừa mới nhập là: "+ s);
    }
}
