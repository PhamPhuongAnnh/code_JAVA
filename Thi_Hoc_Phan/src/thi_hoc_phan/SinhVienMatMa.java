
package thi_hoc_phan;


public class SinhVienMatMa extends SinhVien{
    private String donVi;
    private int luong;

    public SinhVienMatMa() {
    }

    public SinhVienMatMa(String donVi, int luong) {
        this.donVi = donVi;
        this.luong = luong;
    }

    public SinhVienMatMa(String donVi, int luong, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + "donVi=" + donVi + ", luong=" + luong + '}';
    }
    
}
