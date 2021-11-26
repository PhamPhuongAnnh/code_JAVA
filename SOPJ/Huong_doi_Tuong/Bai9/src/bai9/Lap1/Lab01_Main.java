/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9.Lap1;

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

            Rectangle[] hcn = new Rectangle[m];
            for (int j = 0; j < m; j++) {
                hcn[j] = new Rectangle();
                hcn[j].setLength(sc.nextDouble());
                hcn[j].setWidth(sc.nextDouble());
            }

            Circle[] ht = new Circle[n];
            for (int j = 0; j < n; j++) {
                ht[j] = new Circle();
                ht[j].setRadius(sc.nextDouble());
            }

            int[] htHCN = new int[p];
            for (int j = 0; j < p; j++) {
                htHCN[j] = sc.nextInt();
            }

            int[] htHT = new int[q];
            for (int j = 0; j < q; j++) {
                htHT[j] = sc.nextInt();
            }

            System.out.printf("Case #%d\n", i + 1);
            for(int j=0; j<p; j++){
                hcn[htHCN[j]].show();
            }
            for(int j=0; j<q; j++){
                ht[htHT[j]].show();
            }

        }
    }
}
