/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SinhVien {
    int tuoi; 
    String ten; 
    String queQuan; 
    double dienTB; 

    public SinhVien() {
    }

   
    
    public SinhVien(int tuoi, String ten, String queQuan, double dienTB) {
        this.tuoi = tuoi;
        this.ten = ten;
        this.queQuan = queQuan;
        this.dienTB = dienTB;
    }

    public SinhVien(int tuoi, String ten) {
        this.tuoi = tuoi;
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQueQuan() {
        return queQuan;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "tuoi=" + tuoi + ", ten=" + ten + ", queQuan=" + queQuan + ", dienTB=" + dienTB + '}';
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getDienTB() {
        return dienTB;
    }

    public void setDienTB(double dienTB) {
        this.dienTB = dienTB;
    }
    
    
    
    
    public void hocluc(){
        if(dienTB>=8){
            System.out.println("Gioi");
        }
    }
    public void nhap(){
        System.out.println("Tuổi: ");
        Scanner sc = new Scanner(System.in); 
        tuoi = sc.nextInt(); 
        System.out.println("Ten: ");
        sc.nextLine();
        ten = sc.nextLine(); 
    }
      public void xuat(){
        System.out.println("Tuổi: "+ tuoi);
      
        System.out.println("Ten: "+ten);
  
    }
    
    
}
