/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
    static List<Person> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void ghifile(String path, List<Person> listNV) throws IOException {
        File f = new File(path);
        FileWriter fw  = new FileWriter(f);
        for (Person item : listNV) {
            NhanVien nv = (NhanVien) item;
            fw.append(nv.getHoTen() + "$" + nv.getNgaySinh() + "$" + nv.getDiaChi() + "$" + nv.getGioiTinh() + "$" + nv.getPhongBan() + "$" + nv.getHeSoLuong()
                    + "$" + nv.getThamNien() + "$" + nv.getLuongCB());
            fw.append("\n");
        }
        fw.close();
    }
    
    public static List<Person> docFile(String path){
        
        File f = new File(path);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader reader = new BufferedReader(fr);
            String line  = reader.readLine();
            while (line!=null) {                
                String[] item = line.split("\\$");
//                System.out.println(item[0]);
//                System.out.println(line);
                NhanVien nv = new NhanVien(item[4], Float.parseFloat(item[5]), Integer.parseInt(item[6]),Float.parseFloat(item[7]) ,item[0], item[1], item[2], item[3]);
                list.add(nv);
                line = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
       
    }
    public static void main(String[] args) {
        list = docFile("d:\\code\\Java_work\\code_JAVA\\ThucHanhOOPNam3\\src\\Them\\B7\\NhanVien.dat");
        for(Person item: list){
            NhanVien nv = (NhanVien) item;
            System.out.println(nv.toString());
        }
        try {
            ghifile("d:\\code\\Java_work\\code_JAVA\\ThucHanhOOPNam3\\src\\Them\\B7\\NhanVien.txt", list);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Nhap ten file can copy: ");
        String fileCopy = sc.nextLine();
        try {
            ghifile("d:\\code\\Java_work\\code_JAVA\\ThucHanhOOPNam3\\src\\Them\\B7\\"+ fileCopy, list);
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Copy thanh cong");
    }
}
