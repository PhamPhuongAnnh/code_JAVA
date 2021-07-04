/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13_lap9;

/**
 *
 * @author phuon
 */
public class Student {
    private int MaSV;
    private String hoTen;
    private double diemTB;

    public Student() {
    }

    public Student(int MaSV, String hoTen, double diemTB) {
        this.MaSV = MaSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Student{" + "MaSV=" + MaSV + ", hoTen=" + hoTen + ", diemTB=" + diemTB + '}';
    }
        
    
}
