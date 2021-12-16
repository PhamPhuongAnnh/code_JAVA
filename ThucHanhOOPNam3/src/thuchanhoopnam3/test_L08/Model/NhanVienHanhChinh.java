/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.test_L08.Model;

/**
 *
 * @author phuon
 */
public class NhanVienHanhChinh extends NhanVien{

    public NhanVienHanhChinh() {
    }

    
    public NhanVienHanhChinh(String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
    }
    @Override
    public void nhapTT(){
        super.nhapTT();
        System.out.println("Thu nhập: "+thuNhap());
    }
    @Override
    public void xuatTT(){
        super.xuatTT();
    }
    @Override
    public double thuNhap(){
        return super.thuNhap();
    }
    
}
