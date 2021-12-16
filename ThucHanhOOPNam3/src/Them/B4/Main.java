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

    private static List<NhanVien> listNV = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void nhapFile() {
        try {
            // tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileOutputStream fos = new FileOutputStream("d:\\code\\Java_work\\code_JAVA\\ThucHanhOOPNam3\\src\\Them\\B4\\nhanvien.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // nhập list nhân viên
            while (true) {
                NhanVien sv = new NhanVien();
                sv.nhap();
                listNV.add(sv);
                System.out.println("\tNhập 0 để không nhập nữa");
                int check1 = sc.nextInt();
                if (check1 == 0) {
                    break;
                }
            }
            // ghi mảng đối tượng vào file
            oos.writeObject(listNV);
            // đóng luồng
            fos.close();
            oos.close();
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void docfile() {
        FileInputStream fis;
        try {
            // tạo luồng
            fis = new FileInputStream("d:\\code\\Java_work\\code_JAVA\\ThucHanhOOPNam3\\src\\Them\\B4\\nhanvien.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // đọc dữ liệu 
            listNV =  (List<NhanVien>) ois.readObject();
            for(NhanVien item: listNV){
                
                    System.out.println(item.toString());
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
           
           nhapFile();
           docfile();

//            Person s = new NhanVien();
//            s.nhap();
//            System.out.println(s.toString());
    }
}
