/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH7.B4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author phuon
 */
public class main {
    public static void main(String[] args) {
        List<TheMuon> list = new ArrayList<>();
        System.out.println("Nhập số thẻ mượn: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            TheMuon a = new TheMuon();
            a.nhap();
            list.add(a);
        }
        int dem = 0;
        for(TheMuon item: list){
            if(item.getSv().getLop().equals("K3A")){
               dem++;
            }
        }
        System.out.println("Số thẻ mượn của lớp K3A"+dem);
    }
}
