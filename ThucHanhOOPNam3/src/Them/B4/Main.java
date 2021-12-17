/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B4;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class Main {

    public static List<Person> listNV = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void wirteObject(String path, Object ob) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(ob);
            oos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Object readObject(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object ob = ois.readObject();
            ois.close();
            return ob;
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void nhapFile() {

        Person nv = new NhanVien();
        nv.nhap();
        listNV.add(nv);
        while (true) {
            System.out.println("1. Nhập tiếp\n0. Không nhập nữa");
            int check = sc.nextInt();
            if (check == 1) {
                Person nv1 = new NhanVien();
                nv1.nhap();
                listNV.add(nv1);
            } else {
                break;
            }
        }
        Main.wirteObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B4\\\\nhanvien.dat", listNV);
    }

    public static List<Person> DocFile() {
        List<Person> list2 = (List<Person>) Main.readObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B4\\\\nhanvien.dat");
        return list2;
    }

    public static void menu() {
        System.out.println("1. Nhập dữ liệu từ bàn phím");
        System.out.println("2. Đọc file");
        System.out.println("3. Ghi file nhanvien.obj");
        System.out.println("4. Copy nội dung sang file có đường dẫn nhập từ bàn phím");
        System.out.println("0. thoát");
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    nhapFile();
                    break;
                case 2:
                    listNV = DocFile();
                    break;
                case 3:
                    for (Person item : listNV) {
                        NhanVien nv2 = (NhanVien) item;
                        System.out.println(nv2.toString());
                    }
                    Main.wirteObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B4\\\\nhanvien.obj", listNV);

                    break;
                case 4:
                    System.out.println("tên file muốn ghi: ");
                    sc.nextLine();
                    String Check3 = sc.nextLine();
                    Main.wirteObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B4\\\\" + Check3, listNV);
                    return;
            }
        }
    }
}
