/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.bai5_lap3;

/**
 *
 * @author Phương Lan
 */
public class Student {

    public String hoVaTen;
    public String lop;
    public double diemTB;
    
    public Student(String hoVaTen, String lop, double diemTB){
        this.hoVaTen = hoVaTen;
        this.lop = lop;
        this.diemTB = diemTB;
    }
    public void hienThi() {
        System.out.println("---------------------");
        System.out.println(this.hoVaTen);
        System.out.println(this.lop);
        System.out.println(this.diemTB);

    }

    public void xepLoai() {
        if (this.diemTB < 4.0) {
            System.out.println("hoc lai");
        } else if (this.diemTB >= 4.0 && this.diemTB <= 5.4) {
            System.out.println("trung binh");
        } else if (this.diemTB >= 5.5 && this.diemTB <= 6.9) {
            System.out.println("trung binh kha");
        } else if (this.diemTB >= 7.0 && this.diemTB <= 7.9) {
            System.out.println("kha");
        } else {
            System.out.println("gioi");
        }
    }
}
