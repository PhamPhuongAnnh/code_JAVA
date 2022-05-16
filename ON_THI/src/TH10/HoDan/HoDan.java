/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH10.HoDan;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class HoDan {

    private int soTV;
    private int sonha;
    private List<NhanSU> listTV = new ArrayList<>();

    public HoDan() {
    }

    public HoDan(int soTV, int sonha) {
        this.soTV = soTV;
        this.sonha = sonha;
    }

    public int getSonha() {
        return sonha;
    }

    public void setSonha(int sonha) {
        this.sonha = sonha;
    }

    public int getSoTV() {
        return soTV;
    }

    public void setSoTV(int soTV) {
        this.soTV = soTV;
    }

    public List<NhanSU> getListTV() {
        return listTV;
    }

    public void setListTV(List<NhanSU> listTV) {
        this.listTV = listTV;
    }

    public void nhap() {
        System.out.println("So thanh vien: ");
        Scanner sc = new Scanner(System.in);
        soTV = sc.nextInt();
        System.out.println("So nha: ");
        sonha = sc.nextInt();

        System.out.println("Thong tin: ");
        for (int i = 0; i < this.soTV; i++) {

            NhanSU ns = new NhanSU();
            ns.nhap();
            listTV.add(ns);
        }
    }

    public void xuat() {
        System.out.println("So thanh vien: "+soTV);
      
        System.out.println("So nha: "+sonha);
        

        System.out.println("Thong tin: ");
        for (NhanSU item : listTV) {
            System.out.println(item.toString());
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return "HoDan{" + "soTV=" + soTV + ", sonha=" + sonha + ", listTV=" + listTV + '}';
    }
    
    
    
}
