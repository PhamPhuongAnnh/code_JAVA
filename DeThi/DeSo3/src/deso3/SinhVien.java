/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deso3;

/**
 *
 * @author phuon
 */
public class SinhVien {
    //thuoc tinh
    private String hoTen;
    private String maSV;
    private double diemHocPhan;
    private double diemQuaTrinh;
// ham khoi tao co tham so
    public SinhVien(String hoTen, String maSV, double diemHocPhan, double diemQuaTrinh) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemHocPhan = diemHocPhan;
        this.diemQuaTrinh = diemQuaTrinh;
    }
//ham khoi tao khong tham so
    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemHocPhan() {
        return diemHocPhan;
    }

    public void setDiemHocPhan(double diemHocPhan) {
        this.diemHocPhan = diemHocPhan;
    }

    public double getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(double diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }
    
    // tinh diem trung binh
    
    public double diemTrungBinh(){
        return  getDiemQuaTrinh()*0.3 + getDiemHocPhan()*0.7;
    }
    // hien thi thong tin
    
    public void hienThiThongTin(){
       // System.out.printf("%5s%20s%10s%10s%10s%10s\n", "STT", "Ho ten", "Ma SV", "Diem hoc phan", "Diem qua trinh", "Diem trung binh");
         System.out.printf("%20s%10s%10f%10f%10f\n",getHoTen(), getMaSV(), getDiemHocPhan(), getDiemQuaTrinh(), diemTrungBinh());
    }
}
