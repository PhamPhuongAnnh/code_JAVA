/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_chia_Se.De3;

/**
 *
 * @author phuon
 */
public class SinhVienATTT extends SinhVien{
    
    private int hocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienATTT(int hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public int getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString() + ", hocPhi=" + hocPhi + '}';
    }

    
}
