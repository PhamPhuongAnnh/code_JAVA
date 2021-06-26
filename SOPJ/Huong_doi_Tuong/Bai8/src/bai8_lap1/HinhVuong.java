/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_lap1;

/**
 *
 * @author Phương Lan
 */
public class HinhVuong extends HinhChuNhat{
    private double canh;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double getChuVi() {
        return canh*4;
    }

    @Override
    public double getDienTich() {
        return canh*canh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.printf("HV(canh = %f): chu vi = %.3f, dien tich = %.3f\n",getCanh(),getChuVi(),getDienTich());
    }
    
    
}
