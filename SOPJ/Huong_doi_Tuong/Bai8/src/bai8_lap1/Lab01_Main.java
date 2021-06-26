/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_lap1;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Lab01_Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            
            HinhChuNhat[] hcn = new HinhChuNhat[m];
            for(int j=0; j<m; j++){
                hcn[j] = new HinhChuNhat() {};
                hcn[j].setChieuDai(sc.nextDouble());
                hcn[j].setChieuRong(sc.nextDouble());
            }
            
            HinhVuong[] hv = new HinhVuong[n];
            for(int j = 0; j<n; j++){
                hv[j] = new HinhVuong();
                hv[j].setCanh(sc.nextDouble());
            }
            
            int[] hthcn = new int[p];
            for(int j=0; j<p; j++){
                hthcn[j] = sc.nextInt();
            }
            
            int[] hthv = new int[q];
            for(int j=0; j<q; j++){
                hthv[j] = sc.nextInt();
            }
            
            System.out.printf("Case #%d:\n",i+1);
            for(int j=0; j<p; j++){
                hcn[hthcn[j]].hienThiThongTin();
            }
            for(int j=0; j<q; j++){
                hv[hthv[j]].hienThiThongTin();
            }
            
        }
    }
}
