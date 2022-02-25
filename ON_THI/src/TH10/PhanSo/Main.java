/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH10.PhanSo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author phuon
 */
public class Main {

    static List<PhanSO> list = new ArrayList<>();

    public static void sapXep() {
        Collections.sort(list, new Comparator<PhanSO>() {
            @Override
            public int compare(PhanSO o1, PhanSO o2) {
                if (o1.getTu() < o2.getTu()) {
                    return -1;
                } else if (o1.getTu() == o2.getTu()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
    }

    public static void main(String[] args) {
        PhanSO p1 = new PhanSO();
        p1.nhap();
        PhanSO p2 = new PhanSO();
        p2.nhap();
        PhanSO p3 = new PhanSO();
        p3.nhap();
        PhanSO p4 = new PhanSO();
        p4.nhap();
        PhanSO p5 = new PhanSO();
        p5.nhap();
        PhanSO p6 = new PhanSO();
        p6.nhap();
        p1.toiGian();
        p2.toiGian();
        p3.toiGian();
        p4.toiGian();
        p5.toiGian();
        p6.toiGian();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        for (PhanSO item : list) {
            System.out.println(item.toString());
        }
        sapXep();
        System.out.println("________");
        for (PhanSO item : list) {
            System.out.println(item.toString());
        }
    }
}
