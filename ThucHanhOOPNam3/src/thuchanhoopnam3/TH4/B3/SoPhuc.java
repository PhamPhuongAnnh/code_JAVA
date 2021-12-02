/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH4.B3;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }
    public void nhapSoPhuc(){
        System.out.println("Nhập phần ảo và phần thực của số phức: ");
        Scanner sc = new Scanner(System.in);
        phanThuc = sc.nextDouble();
        phanAo = sc.nextDouble();
    }
    
    public void inSoPhuc(){
        System.out.print(phanThuc+"+"+phanAo+"i");
    }
    public SoPhuc cong(SoPhuc sp){
       sp.phanThuc = this.phanThuc+sp.phanThuc;
       sp.phanAo = this.phanAo+sp.phanAo;
       return sp;
    }
    public SoPhuc nhan(SoPhuc sp){
      
        sp.phanThuc = (this.phanThuc*sp.phanThuc - this.phanAo*sp.phanAo);
        sp.phanAo= this.phanAo*sp.phanThuc + this.phanThuc * sp.phanAo;
        return sp;
    }
}
