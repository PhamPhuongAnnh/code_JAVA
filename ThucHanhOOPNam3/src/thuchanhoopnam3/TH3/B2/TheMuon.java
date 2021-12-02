/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH3.B2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class TheMuon {

    private int soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach;
    private SinhVien sv;

    public TheMuon() {
    }

    public TheMuon(int soPhieuMuon, String ngayMuon, String hanTra, String soHieuSach, SinhVien sv) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
        this.sv = sv;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public void nhap() {
        System.out.println("Nhập số phiếu mượn: ");
        Scanner sc = new Scanner(System.in);
        soPhieuMuon = sc.nextInt();
        System.out.println("Nhập ngay mượn");
        sc.nextLine();
        ngayMuon = sc.nextLine();
        System.out.println("Nhập ngay hẹn trả: ");
        hanTra = sc.nextLine();
        System.out.println("Nhập số hiệu sách: ");
        soHieuSach = sc.nextLine();
        System.out.println("Nhập sinh viên");
        sv = new SinhVien();
        sv.nhap();    
    }

    @Override
    public String toString() {
        return "TheMuon{" + "soPhieuMuon=" + soPhieuMuon + ", ngayMuon=" + ngayMuon + ", hanTra=" + hanTra + ", soHieuSach=" + soHieuSach + ", sv=" + sv+'}';
    }
    
}
