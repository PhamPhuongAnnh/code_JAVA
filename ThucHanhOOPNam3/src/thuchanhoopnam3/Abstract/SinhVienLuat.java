/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.Abstract;

/**
 *
 * @author phuon
 */
public class SinhVienLuat extends SinhVien implements  QuanLySinhVien{

    @Override
    public void Nhap() {
        System.out.println("Mời bạn nhập thông tin");
    }

   
    @Override
    public void MonHoc() {
        System.out.println("Bạn Phải học môn Luật đại cương");
    }
    
}
