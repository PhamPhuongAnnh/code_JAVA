/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_chia_Se.De1;

/**
 *
 * @author phuon
 */
public class Student extends Person{
    private String maSV;
    private String email; 
    private double diemTK; 

    public Student() {
    }

    public Student(String maSV, String email, double diemTK) {
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }

    public Student(String maSV, String email, double diemTK, String hoten, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoten, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(double diemTK) {
        this.diemTK = diemTK;
    }

    @Override
    public String toString() {
        return super.toString()+  ", maSV=" + maSV + ", email=" + email + ", diemTK=" + diemTK + '}';
    }
    
}
