/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B10;

import static Them.B10.dien_may.dsDM;
import java.util.ArrayList;

/**
 *
 * @author phuon
 */
public class Test {
    
    public static ArrayList<DienMay> dsDM = new ArrayList<>();
    public static void main(String[] args) {
        DienMay dm = new DienMay();
        dm.setMaHang("1");
        dm.setTenHang("1");
        dm.setSoLuongTon(1);
        dm.setDonGia(1);
        dm.setThoiGianBH(1);
        dm.setCongSuat(1);
        SerializeFileFactory f = new SerializeFileFactory();
        f.wirteObject( "d:\\\\code\\\\Java_work\\\\code_JAVA\\\\ThucHanhOOPNam3\\\\src\\\\Them\\\\B10\\HangHoaDienMay1.text", dsDM);
        
    }
}
