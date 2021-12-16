/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class QLSV {

    public static void main(String[] args) {
        List<SinhVien> listSV = new ArrayList<>();

        System.out.println("Nhập số lượng sinh viên: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("1. Sinh viên khối A");
            System.out.println("2. Sinh viên khối B");
            System.out.println("3. Sinh viên khối C");
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    SinhVien sv = new SinhVienA();
                    sv.nhap();
                    listSV.add(sv);
                    break;
                case 2:
                    SinhVien sv1 = new SinhVienB();
                    sv1.nhap();
                    listSV.add(sv1);
                    break;
                case 3:
                    SinhVien sv2 = new SinhVienC();
                    sv2.nhap();
                    listSV.add(sv2);
                    break;
            }
        }
         System.out.println("Nhập số báo danh sinh viên cần hiển thị: ");
         int check1 = sc.nextInt();
        for (SinhVien item : listSV) {
            if(check1 == item.getSoBaoDanh()){
                if (item instanceof SinhVienA) {
                    SinhVienA sv = (SinhVienA) item;
                    System.out.println(sv.toString());
                }
                if (item instanceof SinhVienB) {
                    SinhVienB sv1 = (SinhVienB) item;
                    System.out.println(sv1.toString());
                }
                if (item instanceof SinhVienC) {
                    SinhVienC sv2 = (SinhVienC) item;
                    System.out.println(sv2.toString());
                }
            }
           

        }

    }
}
