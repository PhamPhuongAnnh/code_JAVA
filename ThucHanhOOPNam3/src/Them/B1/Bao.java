/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B1;

import java.text.DateFormat;
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
public class Bao extends TaiLieu {

    private Date ngayPH;
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public Bao() {
    }

    public Bao(Date ngayPH) {
        this.ngayPH = ngayPH;
    }

    public Bao(Date ngayPH, String maTL, String tenNSX, int soPhatHanh) {
        super(maTL, tenNSX, soPhatHanh);
        this.ngayPH = ngayPH;
    }

    public Date getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(Date ngayPH) {
        this.ngayPH = ngayPH;
    }

    @Override
    public void nhap() {

        super.nhap();
        System.out.println("Ngày xuất bản: ");
        Scanner sc = new Scanner(System.in);
        String ngay = sc.nextLine(); // nhập ngày theo dạng dd/mm/yyyy
        ngayPH = new Date();
        try {
            ngayPH = df.parse(ngay);
        } catch (ParseException ex) {
            Logger.getLogger(Bao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        return "Bao"+s + ", ngayPH=" + ngayPH + '}';
    }
    
}
