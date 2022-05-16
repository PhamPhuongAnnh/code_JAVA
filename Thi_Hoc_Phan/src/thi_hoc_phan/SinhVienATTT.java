
package thi_hoc_phan;

public class SinhVienATTT extends SinhVien{
    
    private double hocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienATTT(double hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    
    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString() + ", hocPhi=" + hocPhi + '}';
    }

    
}
