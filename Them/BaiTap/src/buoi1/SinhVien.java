/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SinhVien {
    Scanner sc = new Scanner(System.in);
    String ten;
    String Lop;
    double diem;
    
    public void nhapThongTin(){
        ten = sc.nextLine();
        Lop = sc.nextLine();
        diem = sc.nextDouble();
    }
    
    public void xuatTHongTIn(){
        System.out.println("Ten: "+ ten);
        System.out.println("Lop: "+ Lop);
        System.out.println("Diem: "+diem);
    }
    public void xepLoai(){
        if(this.diem<5){
            System.out.println("trung binh");
        }
        else if(this.diem>5 && this.diem<8){
            System.out.println("Kha");
        }
        else{
            System.out.println("Gioi");
        }
    }
    
    public String XepLoai(){
        if(this.diem<5){
           return "trung binh";
        }
        else if(this.diem>5 && this.diem<8){
            return "Kha";
        }
        else{
            return "Gioi";
        }
    }
}
