/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH10.PhuongTien;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class OTo extends PTGT{
    private int choNgoi; 
    private String kieuDongCo; 

    public OTo() {
    }

    public OTo(int choNgoi, String kieuDongCo) {
        this.choNgoi = choNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public OTo(int choNgoi, String kieuDongCo, int soMay, String hangSX, int namSX, double giaban) {
        super(soMay, hangSX, namSX, giaban);
        this.choNgoi = choNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    @Override
    public String toString() {
        return super.toString()+ ", choNgoi=" + choNgoi + ", kieuDongCo=" + kieuDongCo + '}';
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("So cho ngoi: ");
        Scanner sc = new Scanner(System.in); 
        choNgoi = sc.nextInt(); 
        
        System.out.println("Kieu dong co: ");
        sc.nextLine();
        kieuDongCo = sc.nextLine();
    }
   
}
