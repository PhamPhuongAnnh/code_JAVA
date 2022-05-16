/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhCN;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class HCN {
    private double chieuDai; 
    private double chieuRong; 

    public HCN(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HCN() {
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "HCN{" + "chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + '}';
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in); 
        chieuDai = sc.nextDouble(); 
   
        chieuRong = sc.nextDouble(); 
    }
    
    double chuVi(){
        return (chieuDai + chieuRong)*2;
    }
    double dienTich(){
        return chieuDai*chieuRong; 
    }
    
    public void hienthi(){
        System.out.println("HCN("+chieuDai+","+ chieuRong+"); chu vi = "+ chuVi()+", dien tich = " + dienTich());
        
    }
}
