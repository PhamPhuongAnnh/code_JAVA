/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH8.B1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class DanhSachSinhVien {
    private int n;
    private List<SinhVien> list = new ArrayList<>();

    public DanhSachSinhVien() {
    }

    public DanhSachSinhVien(int n, List<SinhVien> list) {
        this.n = n;
        this.list = list;
    }

    public List<SinhVien> getList() {
        return list;
    }

    public void setList(List<SinhVien> list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void nhapDS(){
        System.out.println("Nhập số lượng sinh viên: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Nhập sinh viên thứ: "+(i+1));
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
        }
    }
    
    public void inDS(){
        for(SinhVien item: list){
            item.xuat();
        }
    }
    
     public void inDS(String dc){
         System.out.println("Thông tin sinh viên có địa chỉ: "+dc);
        for(SinhVien item: list){
            if(item.getDiaChi().equals(dc)){
                item.xuat();
            }
        }
    }
}
