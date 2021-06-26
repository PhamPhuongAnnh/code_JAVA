/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_lap2;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Lab02_Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int p = sc.nextInt();

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            SinhVienATTT[] sv1 = new SinhVienATTT[m];
            for (int j = 0; j < m; j++) {
                sc.nextLine();
                sv1[j] = new SinhVienATTT();
                sv1[j].setHoten(sc.nextLine());
                sv1[j].setDiemMaDoc(sc.nextDouble());
                sv1[j].setDiemLapTrinAnToanMang(sc.nextDouble());
                sv1[j].setDiemDieuTraSo(sc.nextDouble());
            }

            SinhVienCNTT[] sv2 = new SinhVienCNTT[n];
            for (int j = 0; j < n; j++) {
                sv2[j] = new SinhVienCNTT();
                sc.nextLine();
                sv2[j].setHoten(sc.nextLine());

                sv2[j].setDiemWeb(sc.nextDouble());
                sv2[j].setDiemAndroid(sc.nextDouble());
                sv2[j].setDiemNhung(sc.nextDouble());
            }

            SinhVienDTVT[] sv3 = new SinhVienDTVT[p];
            for (int j = 0; j < p; j++) {
                sv3[j] = new SinhVienDTVT();
                sc.nextLine();
                sv3[j].setHoten(sc.nextLine());
                sv3[j].setDiemTDS(sc.nextDouble());
                sv3[j].setDiemTKModule(sc.nextDouble());
                sv3[j].setDiemVDK(sc.nextDouble());
            }
            System.out.printf("Case #%d:\n", i + 1);
            sv1[x].hienTHiThongTin();
            sv2[y].hienTHiThongTin();
            sv3[z].hienTHiThongTin();
        }
    }
}
