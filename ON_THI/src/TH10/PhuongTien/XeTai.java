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
public class XeTai extends PTGT{
    private int trongTai; 

    public XeTai() {
    }

    public XeTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(int trongTai, int soMay, String hangSX, int namSX, double giaban) {
        super(soMay, hangSX, namSX, giaban);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString()+  ", trongTai=" + trongTai + '}';
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Trong tai: ");
        Scanner sc = new Scanner(System.in); 
        trongTai = sc.nextInt();
    }
}
