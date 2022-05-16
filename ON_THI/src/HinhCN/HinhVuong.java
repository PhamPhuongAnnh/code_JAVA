/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhCN;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class HinhVuong extends HCN{
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
    public void nhap(){
     
        Scanner sc = new Scanner(System.in); 
        canh = sc.nextDouble(); 
        
    }
    
    @Override
    public double chuVi(){
        return canh *4;
    }
    
    @Override
    public double dienTich(){
        return canh*canh; 
    }
    
    @Override
    public void hienthi(){
        System.out.println("HV(Canh = "+canh+ "; chu vi = "+ chuVi()+", dien tich = "+dienTich()+")");
        
    }
}
