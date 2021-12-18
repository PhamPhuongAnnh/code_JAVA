/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.Test_2.B2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class SanhSu extends HangHoa {

    private String nhaSX;
    private Date ngayNhapKho;

    public SanhSu() {
    }

    public SanhSu(String nhaSX, Date ngayNhapKho) {
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date date = java.util.Calendar.getInstance().getTime();

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhà sản xuất: ");
        nhaSX = sc.nextLine();
        System.out.println("Ngày nhập kho: ");
        String ngay1 = sc.nextLine();
        if (ngay1.equals("")) {
            ngayNhapKho = date;
        } else {
            try {
                ngayNhapKho = df.parse(ngay1);
            } catch (ParseException ex) {
                Logger.getLogger(SanhSu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString()+ ", nhaSX=" + nhaSX + ", ngayNhapKho=" + df.format(ngayNhapKho)  +" "+ danhGia()+ '}';
    }

    @Override
    public String danhGia() {
        long diff = date.getTime() - ngayNhapKho.getTime();

        long diffDays = diff / (24 * 60 * 60 * 1000);
        if (this.getSoLuongTon() > 50 && diffDays >10)  {
            return "Bán chậm";
        }
        return "";
    }

}
