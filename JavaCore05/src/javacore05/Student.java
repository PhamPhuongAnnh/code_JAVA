/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore05;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Student {
     String ho_ten, lop;
    double diem_tb;
 
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> Ho va ten sinh vien: ");
        this.ho_ten = sc.nextLine();
        System.out.print(">> Lop sinh vien: ");
        this.lop = sc.nextLine();
        System.out.println(">> Diem trung binh cua sinh vien: ");
        this.diem_tb = sc.nextInt();
    }
 
    public void output() {
        System.out.println("===============================");
        System.out.println("Thong tin sinh vien: ");
        System.out.println(this.ho_ten);
        System.out.println(this.lop);
        System.out.println(this.diem_tb);
        System.out.println("===============================");
    }
 
    public void xepLoai() {
        if (this.diem_tb < 4) {
            System.out.println("Sinh vien co hoc luc kem");
        } else if (this.diem_tb < 7) {
            System.out.println("Sinh vien co hoc luc trung binh");
        } else if (this.diem_tb < 9) {
            System.out.println("Sinh vien co hoc luc kha");
        } else {
            System.out.println("Sinh vien co hoc luc gioi");
        }
    }    
}
