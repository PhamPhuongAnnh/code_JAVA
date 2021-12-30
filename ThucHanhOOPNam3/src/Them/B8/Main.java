/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class Main {

    public static void menu() {
        System.out.println("1.nhap sinh vien UTT");
        System.out.println("2.nhap sinh vien HTTT");
        System.out.println("0. khong nhap nua");

    }

    public static void main(String[] args) {
        List<SinhVien> listUtt = new ArrayList<>();
        List<SinhVien> listHttt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            int check = sc.nextInt();
            if (check == 0) {
                break;
            }
            switch (check) {
                case 1:
                    SinhVienUTT a = new SinhVienUTT();
                    a.nhap();
                    listUtt.add(a);

                     {
                        try {
                            ghifileUTT("C:\\Users\\vinh\\Documents\\NetBeansProjects\\JavaTL\\src\\Bai2\\svutt.dat", listUtt);
                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    break;

                case 2:
                    SinhVienHTTT a1 = new SinhVienHTTT();
                    a1.nhap();
                    listHttt.add(a1);
                     {
                        try {
                            ghifileHTTT("C:\\Users\\vinh\\Documents\\NetBeansProjects\\JavaTL\\src\\Bai2\\svhttt.dat", listHttt);
                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
                default:
                    System.out.println("moi nhap lai");

            }
        }

    }

    public static void ghifileUTT(String path, List<SinhVien> listSV) throws IOException {
        File f = new File(path);

        FileWriter fw = new FileWriter(f);
        // duyet tu dau to cuoi danh sanh

        for (SinhVien item : listSV) {
            SinhVienUTT sv = new SinhVienUTT();
            sv = (SinhVienUTT) item;
            fw.append(sv.getMaSV() + "$" + sv.getHoTen() + "$" + sv.getNgaySinh() + "$" + sv.getGioiTinh() + "$" + sv.getDiemTB() + "$" + sv.getDonVi() + "$" + sv.getLuong());
            fw.append("\n");
        }

        fw.close();
    }

    public static void ghifileHTTT(String path, List<SinhVien> listSV) throws IOException {
        File f = new File(path);

        FileWriter fw = new FileWriter(f);
        // duyet tu dau to cuoi danh sanh

        for (SinhVien item : listSV) {
            SinhVienHTTT sv = new SinhVienHTTT();
            sv = (SinhVienHTTT) item;
            fw.append(sv.getMaSV() + "$" + sv.getHoTen() + "$" + sv.getNgaySinh() + "$" + sv.getGioiTinh() + "$" + sv.getDiemTB() + "$" + sv.getHocPhi());
            fw.append("\n");
        }
        fw.close();
    }
}
