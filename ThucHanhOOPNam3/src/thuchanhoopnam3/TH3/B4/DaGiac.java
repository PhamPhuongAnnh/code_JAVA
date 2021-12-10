/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH3.B4;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class DaGiac {
    private int soCanh;
    private float[] a;

    public DaGiac() {
    }

    public DaGiac(int soCanh, float[] a) {
        this.soCanh = soCanh;
        this.a = a;
    }

    public float[] getA() {
        return a;
    }

    public void setA(float[] a) {
        this.a = a;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }
    
    public void nhap(){
        System.out.println("Nhập số lượng cạnh: ");
        Scanner sc = new Scanner(System.in);
        soCanh = sc.nextInt();
        a = new float[soCanh];
        System.out.println("Nhập thông số cạnh: ");
        for(int i=0; i<soCanh; i++){
            a[i] = sc.nextFloat();
        }
    }
    
    public float chuVi(){
        float s = 0; 
        for(int i=0; i<soCanh; i++){
            s+= a[i];
        }
        return s;
    }

    public void hienThi(){
        for(int i=0; i<soCanh; i++){
            System.out.print("\t"+a[i]);
        }
    }
    
}
