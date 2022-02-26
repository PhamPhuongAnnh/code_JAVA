/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_chia_Se.De7;

/**
 *
 * @author phuon
 */
public class GiangVien {
    private String hoTen; 
    private String ma; 
    private String diachi; 
    private String gioiTinh; 
    private String khoa; 

    public GiangVien() {
    }

    public GiangVien(String hoTen, String ma, String diachi, String gioiTinh, String khoa) {
        this.hoTen = hoTen;
        this.ma = ma;
        this.diachi = diachi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "hoTen=" + hoTen + ", ma=" + ma + ", diachi=" + diachi + ", gioiTinh=" + gioiTinh + ", khoa=" + khoa + '}';
    }
   
}
