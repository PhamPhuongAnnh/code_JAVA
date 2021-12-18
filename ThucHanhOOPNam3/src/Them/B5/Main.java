/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    static List<SinhVien> listSVHTTT = new ArrayList<>();
    static List<SinhVien> listSVUTT = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void wirteObject(String path, Object ob) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(ob);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Them.B5.Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Them.B5.Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Object readObject(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object ob = ois.readObject();
            ois.close();
            return ob;
        } catch (IOException ex) {
            Logger.getLogger(Them.B5.Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Them.B5.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void nhapFile() {

        while (true) {
            System.out.println("1. Sinh vien HTTT\n2. Sinh viên UTT\n0. Không nhập nữa");
            int check = sc.nextInt();
            if (check == 0) {
                break;
            }
            switch (check) {
                case 1:
                    SinhVienHTTT sv = new SinhVienHTTT();
                    sv.nhap();
                    listSVHTTT.add(sv);
                    break;
                case 2:
                    SinhVienUTT sv1 = new SinhVienUTT();
                    sv1.nhap();
                    listSVUTT.add(sv1);
            }
        }
        Main.wirteObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B5\\\\svhttt.obbj", listSVHTTT);
        Main.wirteObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B5\\\\svutt.obj", listSVUTT);
    }

    public static List<SinhVien> DocFileSVHTTT() {
        List<SinhVien> list2 = (List<SinhVien>) Main.readObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B5\\\\svhttt.obbj");
        return list2;
    }

    public static List<SinhVien> DocFileSVUTT() {
        List<SinhVien> list2 = (List<SinhVien>) Main.readObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B5\\\\svutt.obj");
        return list2;
    }

    public static void main(String[] args) {
        Main.nhapFile();
        
        listSVHTTT = DocFileSVHTTT();
        listSVUTT = DocFileSVUTT();
        System.out.println("Sinh viên HTTT");
        for (SinhVien item : listSVHTTT) {
            SinhVienHTTT sv = (SinhVienHTTT) item;
            System.out.println(sv.toString());
        }
        
        System.out.println("----------------------------------");
        System.out.println("Sinh viên UTT");
        for (SinhVien item : listSVUTT) {
            SinhVienUTT sv = (SinhVienUTT) item;
            System.out.println(sv.toString());
        }
    }
}
