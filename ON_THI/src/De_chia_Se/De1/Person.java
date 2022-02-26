/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_chia_Se.De1;

/**
 *
 * @author phuon
 */
public class Person {
    private String hoten; 
    private String ngaySinh; 
    private String diaChi; 
    private String gioiTinh; 

    public Person() {
    }

    public Person(String hoten, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "{hoten=" + hoten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh;
    }
    
    
    
}
