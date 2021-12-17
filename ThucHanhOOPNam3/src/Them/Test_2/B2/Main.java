/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.Test_2.B2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import thuchanhoopnam3.TH3.B3.KhachHang;

/**
 *
 * @author phuon
 */
public class Main {

    public static void menu() {
        System.out.println("=====================MENU=====================");
        System.out.println("1. nhập danh sách");
        System.out.println("2. xuất danh sách");
        System.out.println("3. In loại hàng");
        System.out.println("4. tìm kiếm theo mã hàng");
        System.out.println("5. sắp xếp theo tên hàng tăng dần");
        System.out.println("6. sắp xếp theo số lượng tồn giảm dần");
        System.out.println("7. Các hàng thực phẩm khó bán");
        System.out.println("0. thoát chương trình");
        System.out.println("==========================================");
        System.out.println("Lựa chọn: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<HangHoa> listHH = new ArrayList<>();
        QuanLyHH ql = new QuanLyHH();
        while (true) {
            menu();
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    listHH = ql.nhap();
                    break;
                case 2:
                    ql.hienThi();
                    break;
                case 3:
                    ql.in();
                    break;
                case 4:
                    System.out.println("Nhập mã cần tìm kiếm: ");
                    sc.nextLine();
                    String check1 = sc.nextLine();
                    ql.timKiem(check1);
                    break;
                case 5:
                    ql.sapXepTen();
                    break;
                case 6:
                    ql.sapXepSL();
                    break;
                case 7:
                    ql.xuatKhoBan();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Mời nhập lại");
                    break;
            }
        }
    }
}
