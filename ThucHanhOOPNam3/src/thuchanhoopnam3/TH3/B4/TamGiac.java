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

    @Override
    public void nhap() {
        super.setSoCanh(3);
        Scanner sc = new Scanner(System.in);
        float[] b = new float[super.getSoCanh()];
        do {
            System.out.println("Mời nhập số cạnh");
            for (int i = 0; i < super.getSoCanh(); i++) {
                b[i] = sc.nextFloat();
            }
            super.setA(b);
        } while (kiemTra(b) == 0);

        
    }

    @Override
    public void hienThi() {
        float b[] = super.getA();
        for (int i = 0; i < 3; i++) {
            System.out.print("\t" + b[i]);
        }
    }

    public int kiemTra(float[] b) {
        b = super.getA();
        if (b[0] + b[1] <= b[2] || b[0] + b[2] <= b[1] || b[1] + b[2] <= b[0]) {
            return 0;
        }
        return 1;
    }

}
