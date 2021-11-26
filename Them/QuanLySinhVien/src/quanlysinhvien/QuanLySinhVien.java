package quanlysinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien {

    List<SinhVien> danhSachSinhVien = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    //menu
    public static void menu() {
        System.out.println("====================Menu======================");
        System.out.println("1. Them sinh vien");
        System.out.println("2. Sua sinh vien theo ma");
        System.out.println("3. Xoa sinh vien theo ma ");
        System.out.println("4. Sap xep thong tin theo diem");
        System.out.println("5. Sap xep thong tin theo ten");
        System.out.println("6. Hien thi thong tin sinh vien");
        System.out.println("0. thoát");
        System.out.println("-----------------------------------------------");
    }

    public static void ThemSinhVien() {
//        private String maSinhVien;
//    private String tenSinhVien;
//    private String ngaySinh;
//    private String diaChiLienHe;
//    private List<MonHoc> danhSachMonHoc = new ArrayList<MonHoc>();
//    private int hocKy;
//    private DiemSo diemTrungBinh;
        SinhVien sv = new SinhVien();
        System.out.println("Nhap ma Sinh vien:");
        sv.setMaSinhVien(sc.nextLine());
        System.out.println("Nhap ngay sinh:");
        sv.setNgaySinh(sc.nextLine());
        System.out.println("Nhap dia chi:");
        sv.setDiaChiLienHe(sc.nextLine());
        System.out.println("Nhap danh sach mon hoc");
        System.out.println("Nhap so luong mon hoc: ");
        
    }

    public static void main(String[] args) {

    }

}
