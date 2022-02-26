/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhCN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
//            dong 1
            int m = sc.nextInt();
            int n = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
//            dong 2
            List<HCN> listHCN =  new ArrayList<>(); 
            
            for(int j=0; j <m; j++){
                HCN hcn = new HCN(); 
                hcn.nhap();
                listHCN.add(hcn); 
            }
            
//            dong 3
            List<HinhVuong> listhc = new ArrayList<>(); 
            for(int j = 0; j<n; j++){
                HinhVuong hv = new HinhVuong(); 
                hv.nhap();
                listhc.add(hv); 
            }
            
            int[] mangp = new int[p]; 
            for(int j=0; j<p; j++){
                mangp[j]  = sc.nextInt(); 
            }
            int[] mangq = new int[p]; 
            for(int j=0; j<q; j++){
                mangq[j]  = sc.nextInt(); 
            }
            
            
//            hiển thi 

            for(int j=0; j<p; j++){
               listHCN.get(mangp[j]).hienthi();
            }
            
            
            for(int j=0; j<q; j++){
               listhc.get(mangq[j]).hienthi();
            }
        }
    }
}
