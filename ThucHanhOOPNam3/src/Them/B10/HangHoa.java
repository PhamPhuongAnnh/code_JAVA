package Them.B10;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public   class HangHoa  implements Serializable{

    private String maHang;
    private String tenHang;
    private int soLuongTon;
    private int donGia;

    public HangHoa() {
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    private Scanner sc = new Scanner(System.in);

    public boolean checkMa() {
        if (maHang.equals("")) {
            return false;
        }
        return true;
    }

    public boolean checkTen() {
        if (this.tenHang.equals("")) {
            return false;
        }
        return true;
    }

    public boolean checkSL() {
        if (this.donGia < 0) {
            return false;
        }
        return true;
    }

//    public void nhap() {
//        System.out.println("Mã: ");
//        maHang = sc.nextLine();
//        while (checkMa() == false) {
//            System.out.println("Mã hàng không được để trống");
//            maHang = sc.nextLine();
//        }
//        System.out.println("Tên hàng: ");
//        tenHang = sc.nextLine();
//        if (checkTen() == false) {
//            this.setTenHang("xxx");
//        }
//        System.out.println("Số lượng tồn: ");
//        soLuongTon = sc.nextInt();
//        while (checkSL() == false) {
//            System.out.println("Số lượng phải lớn hơn 0");
//            soLuongTon = sc.nextInt();
//        }
//
//    }

    @Override
    public String toString() {
        return "{maHang=" + maHang + ", tenHang=" + tenHang + ", soLuongTon=" + soLuongTon + ", donGia=" + donGia ;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    /**
     *
     * @return
     */
}