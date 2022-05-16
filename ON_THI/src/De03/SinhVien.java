/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De03;

/**
 *
 * @author phuon
 */
public class SinhVien {
    private String hoTen; 
    private String maSV; 
    private double diemHocPhan; 
    private double diemQuaTrinh; 

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, double diemHocPhan, double diemQuaTrinh) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemHocPhan = diemHocPhan;
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public double getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(double diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
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

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", maSV=" + maSV + ", diemHocPhan=" + diemHocPhan + ", diemQuaTrinh=" + diemQuaTrinh + '}';
    }
    double diemTB(){
        double diemtb = 0; 
        diemtb = this.diemHocPhan*0.7+diemQuaTrinh*0.3; 
        return diemtb; 
    }
}
