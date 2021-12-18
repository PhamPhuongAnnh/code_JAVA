/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B6;

import java.io.File;
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

    public static void wirteObject(String path, Object ob) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(ob);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Them.B6.Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Them.B6.Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Object readObject(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object ob = ois.readObject();
            ois.close();
            return ob;
        } catch (IOException ex) {
            Logger.getLogger(Them.B6.Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Them.B6.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    static Scanner sc = new Scanner(System.in);

    public static void nhap(List<Book> listBook) {
        Book nv = new Book();
        nv.nhap();
        listBook.add(nv);
        while (true) {
            System.out.println("1. Nhập tiếp\n0. Không nhập nữa");
            int check = sc.nextInt();
            if (check == 1) {
                Book nv1 = new Book();
                nv1.nhap();
                listBook.add(nv1);
            } else {
                break;
            }
        }
        Main.wirteObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B6\\\\book.dat", listBook);
    }

    public static List<Book> DocFileS() {
        List<Book> list2 = (List<Book>) Main.readObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B6\\\\book.dat");
        return list2;
    }

    public static void main(String[] args) {
        List<Book> listBook = new ArrayList<>();
        nhap(listBook);
        listBook = DocFileS();
        for (Book item : listBook) {
            System.out.println(item.toString());
        }

        System.out.println("Bạn có muốn xóa file book.dat không");
        System.out.println("1. Có");
        System.out.println("2. không");
        int check = sc.nextInt();
        switch (check) {
            case 1:
                File file = new File("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B6\\\\book.dat");
                file.delete();
                
                System.out.println("Nhập tên fle cần lưu: ");
                String check2 = sc.nextLine();
                Main.wirteObject("d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\"+check2, listBook);
                break;
            case 0:
                return;
        }
    }
}
