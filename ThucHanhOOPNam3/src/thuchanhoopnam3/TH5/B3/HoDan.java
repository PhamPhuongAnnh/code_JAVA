/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH5.B3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class HoDan {
    private int soThanhVien;
    private int soNha;
    private List<CaNhan> listCN = new ArrayList<>();

    public HoDan() {
    }

    public HoDan(int soThanhVien, int soNha, List<CaNhan> listCN) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.listCN = listCN;
    }

   
    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }
     public List<CaNhan> getListCN() {
        return listCN;
    }

    public void setListCN(List<CaNhan> listCN) {
        this.listCN = listCN;
    }
    public void nhap(){
        System.out.println("Nhập số thành viên trong hộ dân: ");
        Scanner sc = new Scanner(System.in);
        soThanhVien = sc.nextInt();
        System.out.println("Nhập số nhà: ");
        soNha = sc.nextInt();
        for(int i=0; i<soThanhVien; i++){
            CaNhan cn = new CaNhan();
            System.out.println("Nhập thành viên thứ "+(i+1));
            cn.nhap();
            listCN.add(cn);
        }
    }
    
    public void xuat(){
        System.out.println("Số thành viên trong hộ dân: "+soThanhVien);
        System.out.println("Số nhà: "+soNha);
        for(CaNhan item:listCN){
           item.xuat();
        }
    }
}
