/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi.De02_MienNam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuon
 */
public class HoaDon {
    private List<SanPham> listSP  = new ArrayList<>(); 
    private KhachHang kh ;
    private double tongtien;
    public HoaDon() {
    }

    public HoaDon(List<SanPham> listSP, KhachHang kh, double tongtien) {
        this.listSP = listSP;
        this.kh = kh;
        this.tongtien = tongtien;
    }

    public List<SanPham> getListSP() {
        return listSP;
    }

    public void setListSP(List<SanPham> listSP) {
        this.listSP = listSP;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "listSP=" + listSP + ", kh=" + kh + ", tongtien=" + tongtien + '}';
    }

    
 
}
