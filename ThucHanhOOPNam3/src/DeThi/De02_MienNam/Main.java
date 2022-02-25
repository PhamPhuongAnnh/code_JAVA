/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi.De02_MienNam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    private static List<SanPham> listSP = new ArrayList<>();
    private static List<KhachHang> listKH = new ArrayList<>();
    private static List<HoaDon> listHD = new ArrayList<>();

    public static void menu() {
        System.out.println("_________MENU__________");
        System.out.println("1. Nhap thong tin san pham");
        System.out.println("2. Them khach hang");
        System.out.println("3. Sua thong tin san pham");
        System.out.println("4. Hien thi danh sach san pham");
        System.out.println("5. Mua hang");
        System.out.println("6. hien thi khach hang co so tien mua lon nhat");
        System.out.println("0. Thoat");
        System.out.println("Lua chon: ");

    }
//1

    public static void nhapSP() {
//        nhap thong tin san pham dau tien
        System.out.println("Nhap thong tin san pham: ");
        SanPham sp1 = new SanPham();
        sp1.nhap();
        int flag = 0;
        for (SanPham item : listSP) {
            if (item.getMaSP().equals(sp1.getMaSP())) {
                int soLuong = item.getSoLuong() + sp1.getSoLuong();
                item.setSoLuong(soLuong);
                flag = 1;
            }
        }
        if (flag == 0) {
            listSP.add(sp1);
        }
        int flag1 = 0;

        while (true) {
            System.out.println("1. Nhap tiep");
            System.out.println("Nhan so bat ki de ket thuc");
            int check1 = sc.nextInt();
            if (check1 == 1) {
                SanPham sp = new SanPham();
                sp.nhap();
                for (SanPham item : listSP) {
                    if (item.getMaSP().equals(sp.getMaSP())) {
                        int soLuong = item.getSoLuong() + sp.getSoLuong();
                        item.setSoLuong(soLuong);
                        flag1 = 1;
                    }
                }
                if (flag1 == 0) {
                    listSP.add(sp);
                }
            } else {
                break;
            }
        }
    }
//    2

    public static void nhapKH() {
        KhachHang kh = new KhachHang();
        kh.nhap();
        listKH.add(kh);

    }
//    3

    public static void suaTTSP(String ma) {
        int flag = 0;
        for (SanPham item : listSP) {
            if (item.getMaSP().equals(ma)) {
                System.out.println("Ban dang sua thong tin cua san pham: " + item.getTenSP());
                System.out.println("Sua Ten san pham: ");
                String ten = sc.nextLine();
                item.setTenSP(ten);
                System.out.println("Sua don gia: ");
                double dongia = sc.nextDouble();
                item.setDonGia(dongia);
                System.out.println("Sua so luong: ");
                int soluong = sc.nextInt();
                item.setSoLuong(soluong);
                System.out.println("Sua ngay san xuat: ");
                sc.nextLine();
                String ngay = sc.nextLine();
                item.setNgaySX(ngay);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("San pham khong ton tai");
        }
    }
//4

    public static void hienthiSP() {
        for (SanPham item : listSP) {
            System.out.println(item.toString());
        }
    }

//    5
    public static void muaHang(KhachHang kh) {
        HoaDon hd = new HoaDon();
        List<SanPham> sanPhamMua = new ArrayList<>();
        System.out.println("nhap ma san pham muon  mua");
        String masp1 = sc.nextLine();
        double tongtien = 0;
        int flag = 0;
        for (SanPham item : listSP) {
            if (item.getMaSP().equals(masp1)) {
                System.out.println("Nhap so luong muon mua: ");
                int soluong1 = sc.nextInt();
                if (soluong1 > item.getSoLuong()) {
                    System.out.println("San pham khong du cung cap");
                } else {
                    int soLuong = item.getSoLuong() - soluong1;
                    item.setSoLuong(soLuong);
                    SanPham sp1 = new SanPham();
                    sp1.setSoLuong(soluong1);
                    sp1.setMaSP(masp1);
                    sp1.setDonGia(item.getDonGia());
                    sp1.setNgaySX(item.getNgaySX());
                    sp1.setTenSP(item.getTenSP());
                    tongtien += soluong1 * item.getDonGia();
                    sanPhamMua.add(sp1);
                }
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Khong co san pham nay");
        }

        while (true) {
            System.out.println("\t1. mua tiep");
            System.out.println("\tAn so bat ky de ket thuc");
            int check = sc.nextInt();
            if (check == 1) {
                System.out.println("nhap ma san pham muon  mua");
                sc.nextLine();
                String masp = sc.nextLine();
                int flag1 = 0;
                for (SanPham item : listSP) {
                    if (item.getMaSP().equals(masp)) {
                        System.out.println("Nhap so luong muon mua: ");
                        int soluong = sc.nextInt();
                        if (soluong > item.getSoLuong()) {
                            System.out.println("San pham khong du cung cap");
                        } else {
                            int soLuong = item.getSoLuong() - soluong;
                            item.setSoLuong(soLuong);
                            SanPham sp = new SanPham();
                            sp.setSoLuong(soluong);
                            sp.setMaSP(masp);
                            sp.setDonGia(item.getDonGia());
                            sp.setNgaySX(item.getNgaySX());
                            sp.setTenSP(item.getTenSP());

                            tongtien += soluong * item.getDonGia();
                            sanPhamMua.add(sp);
                        }
                        flag1 = 1;
                    }
                }
                if (flag1 == 0) {
                    System.out.println("Khong co san pham nay");
                }
            } else {
                break;
            }

        }
        hd.setKh(kh);
        hd.setListSP(sanPhamMua);
        hd.setTongtien(tongtien);       
        listHD.add(hd); 
    }
    
//    6
    public static  void khachHangMax(){
        double max =0;
        for(HoaDon item: listHD){
            if(item.getTongtien()>max){
                max = item.getTongtien(); 
            }
        }
        
        for(HoaDon item: listHD){
            if(item.getTongtien() == max){
                System.out.println(item.getKh().toString());
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    nhapSP();
                    break;
                case 2:
                    nhapKH();
                    break;
                case 3:
                    System.out.println("Nhap ma san pham muon sua: ");
                    sc.nextLine();
                    String ma = sc.nextLine();
                    suaTTSP(ma);
                    break;
                case 4:
                    hienthiSP();
                    break;
                case 5:
                    System.out.println("Nhap ma khach hàng mua hang: ");
                    sc.nextLine();
                    String ma1 = sc.nextLine();
                    int flag = 0;
                    for (KhachHang item : listKH) {
                        if (item.getMaKH().equals(ma1)) {

                            muaHang(item);

                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Khong tim thay khach hang! Hay chọn 2 de nhap thong tin khach hang");
                    }
                    break;
                case 6:
                    khachHangMax();
                    break;
                
                case 0:
                    break;

            }
        }
    }
}
