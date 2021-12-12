/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.test_L08;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import thuchanhoopnam3.test_L08.Controller.QuanLyNhanVien;
import thuchanhoopnam3.test_L08.Model.NhanVien;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import thuchanhoopnam3.test_L08.JDBC_Connection.ConnectionUtils;

/**
 *
 * @author phuon
 */
public class Main {

    public static void menu() {
        System.out.println("============================MENU=================================");
        System.out.println("1. Nhập danh  sách nhân viên từ bàn phím");
        System.out.println("2. Xuất danh sách nhân viên ra màn  hình");
        System.out.println("3. Tìm và hiển thị nhân viên theo mã nhân viên từ bàn phím");
        System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím");
        System.out.println("5. Cập nhập thông tin theo mã nhâp từ bàn phím");
        System.out.println("6. Tìm nhân viên theo khoảng lương nhập từ bàn phím");
        System.out.println("7. Sắp xếp nhân viên theo họ và tên");
        System.out.println("8. Sắp xếp nhân viên theo thu nhập");
        System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
        System.out.println("=================================================================");
        System.out.print("Lựa chọn: ");
    }

    public static void main(String[] args) {
//
//        List<NhanVien> listNV = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        QuanLyNhanVien ql = new QuanLyNhanVien();
//        while (true) {
//            menu();
//            int check = sc.nextInt();
//            switch (check) {
//                case 1:
//                    listNV = ql.nhapDanhSachNhanVien();
//                    break;
//                case 2:
//                    ql.xuatThongTin();
//                    break;
//                case 3:
//                    System.out.println("Mời nhập mã nhân viên cần tìm kiếm: ");
//                    sc.nextLine();
//                    String ma = sc.nextLine();
//                    ql.timKiemMa(ma);
//                    break;
//                case 4:
//                    System.out.println("Mời nhập mã nhân viên cần xóa: ");
//                    sc.nextLine();
//                    String ma1 = sc.nextLine();
//                    ql.xoaNhanVienMa(ma1);
//                    break;
//                case 5:
//                    System.out.println("Mời nhập mã nhân viên cần cập nhập: ");
//                    sc.nextLine();
//                    String ma2 = sc.nextLine();
//                    ql.suaThongTin(ma2);
//                    break;
//                case 6:
//                    System.out.println("Mời nhập mức lương cần tìm kiếm nhân viên: ");
//                    double luong = sc.nextDouble();
//                    ql.timKiemLuong(luong);
//                    break;
//                case 7:
//                    ql.sapXepHoTen();
//                    break;
//                case 8:
//                    ql.sapXepLuong();
//                    break;
//                case 9:
//                    ql.Y9();
//                    break;
//                default:
//
//                    break;
//
//            }
//        }
        ConnectionUtils conn = new ConnectionUtils();
     
        try {
            System.out.println(conn.getMySQLConnection());
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
