/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH10.PhuongTien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class QLPTGT {

    private static List<PTGT> listPT = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("1. Nhap thong tin dang ky cho mot danh sach phuong tien");
        System.out.println("2. nhap so may phuong tin va cho biet phuong tien thuoc loai gi va hien thi thong tin");
        System.out.println("0. thoat");
        System.out.println("Lua chon: ");

    }

    public static void nhapTT() {
        System.out.println("Nhap so luong phuong tien: ");
        int soluong = sc.nextInt();

        for (int i = 0; i < soluong; i++) {
            System.out.println("1. Xe may");
            System.out.println("2. Xe o to");
            System.out.println("3. xe tai");
            System.out.println("Lua chon: ");
            int check = sc.nextInt();
            if (check == 1) {
                XeMay xm = new XeMay();
                xm.nhap();
                listPT.add(xm);

            } else if (check == 2) {
                OTo ot = new OTo();
                ot.nhap();
                listPT.add(ot);
            } else if (check == 3) {
                XeTai xt = new XeTai();
                xt.nhap();
                listPT.add(xt);
            } else {
                System.out.println("Moi chon lai");
            }
        }
    }
// 2

    public static void kiemTra(int somay) {
        for (PTGT item : listPT) {
            if (somay == item.getSoMay()) {
                if (item instanceof XeMay) {
                    System.out.println("La Xe May");
                    XeMay cm = (XeMay) item;
                    System.out.println(item.toString());
                }
                if (item instanceof OTo) {
                    System.out.println("La O To");
                    OTo cm = (OTo) item;
                    System.out.println(item.toString());
                }
                if (item instanceof XeTai) {
                    System.out.println("La Xe Tai");
                    XeTai cm = (XeTai) item;
                    System.out.println(item.toString());
                }
            }

        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int check1 = sc.nextInt();
            switch (check1) {
                case 1:
                    nhapTT(); 
                    break;
                case 2:
                    System.out.println("Nhap so may can kiem tra: ");
                    int somay= sc.nextInt(); 
                    kiemTra(somay);
                    break;
                case 3:
                    break;
            }
        }
    }
}
