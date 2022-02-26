/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_chia_Se.De2;

/**
 *
 * @author phuon
 */
public class Person {
    private String hoten; 
    private String ngaySinh; 
    private String gioiTinh; 
    private String diachi; 

    public Person() {
    }

    public Person(String hoten, String ngaySinh, String gioiTinh, String diachi) {
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diachi = diachi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Person{" + "hoten=" + hoten + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diachi=" + diachi + '}';
    }
   
    
}
