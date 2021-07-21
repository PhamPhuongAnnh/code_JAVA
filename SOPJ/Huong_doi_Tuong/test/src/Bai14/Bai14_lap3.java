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
public class Bai14_lap3 {
    public static void main(String[] args) {
        File dir = new File("D:\\Mon_Hoc_KMA\\DienTuSo");
        File[] manng =dir.listFiles(new TxtFilter());
        for(File item: manng){
            System.out.println(item.getAbsoluteFile());
        }
    }
}
