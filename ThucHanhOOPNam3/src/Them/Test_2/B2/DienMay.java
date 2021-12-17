/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.Test_2.B2;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class DienMay extends HangHoa {

    private int thoiGianBH;
    private int congSuat;

    public DienMay() {
    }

    public DienMay(int thoiGianBH, int congSuat) {
        this.thoiGianBH = thoiGianBH;
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Thời gian bảo hành: ");
        thoiGianBH = sc.nextInt();
        while (checkBaoHanh() == false) {
            System.out.println("Thời gian bảo hàng phải lớn hơn 0");
            thoiGianBH = sc.nextInt();
        }

        System.out.println("Công suất: ");
        congSuat = sc.nextInt();
        while (checkCongSuat() == false) {
            System.out.println("Công suất phải lớn hơn 0");
            thoiGianBH = sc.nextInt();
        }

    }

    public boolean checkBaoHanh() {
        if (this.thoiGianBH < 0) {
            return false;
        }
        return true;
    }

    public boolean checkCongSuat() {
        if (this.thoiGianBH < 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", thoiGianBH=" + thoiGianBH + ", congSuat=" + congSuat + ", sc=" + sc + danhGia()+ '}';
    }

    @Override
    public String danhGia() {
        if(this.getSoLuongTon()<3){
            return "Bán được";
        }
        return "";
    }

}
