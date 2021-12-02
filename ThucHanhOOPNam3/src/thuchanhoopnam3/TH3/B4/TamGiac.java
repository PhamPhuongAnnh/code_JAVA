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
public class TamGiac extends DaGiac {

    float[] a = new float[3];

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextFloat();
        }
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < 3; i++) {
            System.out.print("\t" + a[i]);
        }
    }

    @Override
    public float chuVi() {
        float s = 0;
        for (int i = 0; i < 3; i++) {
            s += a[i];
        }
        return s;
    }
    
    
}
