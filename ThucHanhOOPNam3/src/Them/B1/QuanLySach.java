/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import thuchanhoopnam3.TH8.B1.DanhSachSinhVien;

/**
 *
 * @author phuon
 */
public class QuanLySach {

    private static List<TaiLieu> listTL = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("=====================MENU==================");
        System.out.println("1. Nhập thông tin về các tài liệu");
        System.out.println("2. Hiển thị thông tin về các loại tài liệu");
        System.out.println("3. tìm kiến thông tin sách theo loại");
        System.out.println("4. thoát chương trinhg");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Lựa chọn: ");
    }

    public static void menuNhapTT() {
        System.out.println("\t1. Sách");
        System.out.println("\t2. Tạp chí");
        System.out.println("\t3. Báo");
        System.out.println("\t0. Thoát");
    }

    public static List<TaiLieu> nhapTT() {
        while (true) {
            System.out.println("Bạn muốn nhập loại tài liệu nào: ");
            menuNhapTT();
            int check = sc.nextInt();
            if (check == 0) {
                break;
            }
            switch (check) {
                case 1:
                    Sach s = new Sach();
                    s.nhap();
                    listTL.add(s);
                    break;
                case 2:
                    TapChi s1 = new TapChi();
                    s1.nhap();
                    listTL.add(s1);
                    break;
                case 3:
                    Bao s2 = new Bao();
                    s2.nhap();
                    listTL.add(s2);
                    break;
                default:
                    System.out.println("Mời nhập lại");
                    break;
            }
        }
        return listTL;
    }

    public static void xuatDS() {
        for (TaiLieu item : listTL) {
            if (item instanceof Sach) {
                Sach s = (Sach) item;
                System.out.println(s.toString());
            }
            if (item instanceof Bao) {
                Bao s1 = (Bao) item;
                System.out.println(s1.toString());
            }
            if (item instanceof TapChi) {
                TapChi s2 = (TapChi) item;
                System.out.println(s2.toString());
            }
        }
    }

    public static void timKiem() {
        while (true) {
            System.out.println("Bạn muốn tìm kiếm loại sách nào: ");
            menuNhapTT();
            int check = sc.nextInt();
            if (check == 0) {
                break;
            }
            switch (check) {
                case 1:
                    for (TaiLieu item : listTL) {
                        if (item instanceof Sach) {
                            Sach s = (Sach) item;
                            System.out.println(s.toString());
                        }
                    }
                    break;
                case 3:
                    for (TaiLieu item : listTL) {
                        if (item instanceof Bao) {
                            Bao s1 = (Bao) item;
                            System.out.println(s1.toString());
                        }
                    }

                    break;
                case 2:
                    for (TaiLieu item : listTL) {
                        if (item instanceof TapChi) {
                            TapChi s2 = (TapChi) item;
                            System.out.println(s2.toString());
                        }
                    }
                    break;
                default:
                    System.out.println("Mời nhập lại");
                    break;
            }
        }
    }

    public static void main(String[] args) {

        while (true) {
            menu();
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    listTL = nhapTT();
                    break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    timKiem();
                    break;
                case 4:
                    return;
            }
        }
    }
}
