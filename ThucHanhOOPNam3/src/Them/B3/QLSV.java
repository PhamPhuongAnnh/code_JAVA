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

    public static void menu() {
        System.out.println("1. Nhập danh sách thí sinh");
        System.out.println("2. hiện thị danh sách thí sinh");
        System.out.println("3. tìm kiếm theo số báo danh");
        System.out.println("4. thoát chương tring");
        System.out.println("Chọn: ");
    }

    public static void main(String[] args) {
        List<SinhVien> listSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            int check = sc.nextInt();

            switch (check) {

                case 1:
                    while (true) {
                        System.out.println("1. Sinh viên khối A");
                        System.out.println("2. Sinh viên khối B");
                        System.out.println("3. Sinh viên khối C");
                        System.out.println("0. không nhập nữa");
                        int check1 = sc.nextInt();
                        if (check1 == 0) {
                            break;
                        }
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
                    break;
                case 2:
                    for (SinhVien item : listSV) {
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
                    break;
                case 3:

                    System.out.println("Nhập số báo danh sinh viên cần hiển thị: ");
                    int check1 = sc.nextInt();
                    for (SinhVien item : listSV) {
                        if (check1 == item.getSoBaoDanh()) {
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
                    break;

                case 4:
                    return;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        }

    }

}

