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
public class ThucPham extends HangHoa {

    private String nhaSX;
    private Date ngaySX;
    private Date ngayHH;

    public ThucPham(String nhaSX, Date ngaySX, Date ngayHH) {
        this.nhaSX = nhaSX;
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
    }

    public ThucPham() {
    }

   

    public Date getNgayHH() {
        return ngayHH;
    }

    public void setNgayHH(Date ngayHH) {
        this.ngayHH = ngayHH;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }
    Date date = java.util.Calendar.getInstance().getTime();

    public boolean checkNgaySX() {
        if (this.ngaySX.before(date)) {
            return true;
        }
        return false;
    }

    public boolean checkNgayHH() {
        if (this.ngayHH.after(this.ngaySX)) {
            return true;    
        }
        return false;
    }
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return super.toString()+ ", nhaSX=" + nhaSX + ", ngaySX=" + df.format(ngaySX) + ", ngayHH=" + df.format(ngayHH)  +" "+ danhGia() + '}';
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhà sản xuất: ");
        nhaSX = sc.nextLine();
        
        System.out.println("Ngày sản xuất: ");
        String ngay1 = sc.nextLine();
        if (ngay1.equals("")) {
            ngaySX = date;
        } else {
            try {
                ngaySX = df.parse(ngay1);
            } catch (ParseException ex) {
                Logger.getLogger(ThucPham.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (checkNgaySX() == false && !ngay1.equals("")) {
            System.out.println("Ngày sản xuất phải trước ngày: " + df.format(date));
            String ngay2 = sc.nextLine();
            if (ngay2.equals("")) {
                ngaySX = date;
                break;
            } else {
                try {
                    ngaySX = df.parse(ngay2);

                } catch (ParseException ex) {
                    Logger.getLogger(ThucPham.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Ngày hết hạn: ");
        String ngay3 = sc.nextLine();
        if (ngay3.equals("")) {
            ngayHH = ngaySX;
        } else {
            try {
                ngayHH = df.parse(ngay3);
            } catch (ParseException ex) {
                Logger.getLogger(ThucPham.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (checkNgayHH() == false && !ngay3.equals("")) {
            System.out.println("Ngày hết hạn phải sau ngày: " + df.format(ngaySX));
            String ngay4 = sc.nextLine();
            if (ngay4.equals("")) {
                ngayHH = date;
                break;
            } else {
                try {
                    ngayHH = df.parse(ngay4);
                } catch (ParseException ex) {
                    Logger.getLogger(ThucPham.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public boolean kiemTraHetHan() {
        if (ngayHH.before(date) == true) {
            return false;
        }
        return true;
    }

    @Override
    public String danhGia() {
        if (this.getSoLuongTon() > 0 && kiemTraHetHan() == false) {
            return "Khó bán";
        }
        return "";
    }
}
