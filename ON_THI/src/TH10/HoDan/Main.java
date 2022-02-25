/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH10.HoDan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Main {

    public static void main(String[] args) {
        List<HoDan> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        HoDan hd1 = new HoDan();
        hd1.nhap();
        list.add(hd1);
        while (true) {
            System.out.println("1. nhập tiếp");
            System.out.println("0. không nhập nữa");
            int check = sc.nextInt();
            if (check == 1) {
                HoDan hd = new HoDan();
                hd.nhap();
                list.add(hd);
            } else {
                break;
            }
        }
        for (HoDan item : list) {
            item.xuat();
            System.out.println("_______________________");
        }

    }
}
