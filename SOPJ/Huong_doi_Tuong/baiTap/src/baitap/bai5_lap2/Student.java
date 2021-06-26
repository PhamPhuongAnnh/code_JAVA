/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.bai5_lap2;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Student {
    public String hoVaTen;
    public String lop;
    public double diemTB;
    
    public void input(){
        Scanner sc  = new Scanner(System.in);
        System.out.printf("nhap ho va ten: ");
        this.hoVaTen = sc.nextLine();
        System.out.printf("nhap lop; ");
        this.lop = sc.nextLine();
        System.out.printf("nhap diem TB: ");
        this.diemTB = sc.nextDouble();
        
    }
    
    public void hienThi(){
        System.out.println("---------------------");
        System.out.println(this.hoVaTen);
        System.out.println(this.lop);
        System.out.println(this.diemTB);
        
    }
    
    public void xepLoai(){
        if(this.diemTB <4.0){
            System.out.println("hoc lai");
        }
        else if(this.diemTB >=4.0 && this.diemTB<=5.4){
            System.out.println("trung binh");
        }
        else if(this.diemTB >=5.5 && this.diemTB<=6.9){
            System.out.println("trung binh kha");
        }
        else if(this.diemTB >=7.0 && this.diemTB<=7.9){
            System.out.println("kha");
        }
        else{
            System.out.println("gioi");
        }
        
    }
}
