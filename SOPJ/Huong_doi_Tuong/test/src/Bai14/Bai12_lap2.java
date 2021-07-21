/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai14;

import java.io.File;

/**
 *
 * @author phuon
 */
public class Bai12_lap2 {

    static void duyetThuMuc(File file) {
        if (file.isDirectory()) {
            File[] con = file.listFiles();
            for (File item : con) {
                duyetThuMuc(item);
            }
        } else {
            System.out.println(file);
        }
    }

    public static void main(String[] args) {
//        File dir = new File("D:\\Mon_Hoc_KMA\\quanTriMang\\Bài tập");
//        String[] list = dir.list();
//        for(String item:list){
//            System.out.println(item);
//        }
        File dir = new File("D:\\Code\\java");
        duyetThuMuc(dir);
    }
}
