/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.Test_2.B2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class QuanLyHH {

    List<HangHoa> listHangHoa = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("\t1. Hàng hóa thực phẩm");
        System.out.println("\t2. Hàng hóa sành sứ");
        System.out.println("\t3. Hàng hóa điện máy");

    }

    public List<HangHoa> nhap() {
        while (true) {
            menu();
            System.out.println("\t0. Không nhập nữa");
            int check = sc.nextInt();
            if (check == 0) {
                break;
            }
            switch (check) {
                case 1:
                    ThucPham tp = new ThucPham();
                    tp.nhap();
                    listHangHoa.add(tp);
                    break;
                case 2:
                    SanhSu ss = new SanhSu();
                    ss.nhap();
                    listHangHoa.add(ss);
                    break;
                case 3:
                    DienMay dm = new DienMay();
                    dm.nhap();
                    listHangHoa.add(dm);
                    break;

            }
        }
        return listHangHoa;
    }

    public void hienThi() {
        for (HangHoa item : listHangHoa) {
            if (item instanceof ThucPham) {
                ThucPham a = (ThucPham) item;
                System.out.println(a.toString());
            }
            if (item instanceof SanhSu) {
                SanhSu a = (SanhSu) item;
                System.out.println(a.toString());
            }
            if (item instanceof DienMay) {
                DienMay a = (DienMay) item;
                System.out.println(a.toString());
            }
        }
    }

    public void in() {
        menu();
        int check = sc.nextInt();
        switch (check) {
            case 1:
                for (HangHoa item : listHangHoa) {
                    if (item instanceof ThucPham) {
                        ThucPham a = (ThucPham) item;
                        System.out.println(a.toString());
                    }
                }
                break;
            case 2:
                for (HangHoa item : listHangHoa) {
                    if (item instanceof SanhSu) {
                        SanhSu a = (SanhSu) item;
                        System.out.println(a.toString());
                    }

                }
                break;
            case 3:
                for (HangHoa item : listHangHoa) {
                    if (item instanceof DienMay) {
                        DienMay a = (DienMay) item;
                        System.out.println(a.toString());
                    }
                }
                break;

        }
    }

    public void timKiem(String ma) {
        for (HangHoa item : listHangHoa) {
            if (ma.equals(item.getMaHang())) {
                if (item instanceof ThucPham) {
                    ThucPham a = (ThucPham) item;
                    System.out.println(a.toString());
                }
                if (item instanceof SanhSu) {
                    SanhSu a = (SanhSu) item;
                    System.out.println(a.toString());
                }
                if (item instanceof DienMay) {
                    DienMay a = (DienMay) item;
                    System.out.println(a.toString());
                }
            }
        }
    }

    public void sapXepTen() {
        Collections.sort(listHangHoa, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                return o1.getTenHang().compareTo(o2.getTenHang());
            }
        });
    }

    public void sapXepSL() {
        Collections.sort(listHangHoa, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                return o2.getSoLuongTon() - o1.getSoLuongTon();
            }
        });
    }

    public void xuatKhoBan() {
        for (HangHoa item : listHangHoa) {
            if (item instanceof ThucPham) {
                ThucPham a = (ThucPham) item;
                if (a.danhGia().equals("Khó bán")) {
                    System.out.println(a.toString());
                }
            }
        }
    }
}
