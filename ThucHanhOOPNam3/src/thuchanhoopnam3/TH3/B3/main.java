/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH3.B3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class main {
    public static void main(String[] args) {
        List<BienLai> listBienLai = new ArrayList<>();
        
        System.out.println("Nhập số lượng hộ sử dụng điện: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ;i<n; i++){
            BienLai bl = new BienLai();
            bl.nhap();
            listBienLai.add(bl);
        }
        
        for(BienLai item: listBienLai){
            System.out.println(item.toString());
        }
    }
}
