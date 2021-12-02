/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH7.B2;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class MaTran {

    private int n;
    private int m;
    private double[][] a;

    public MaTran() {
    }

    public MaTran(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double[][] getA() {
        return a;
    }

    public void setA(double[][] a) {
        this.a = a;
    }

    public void nhapMT() {
        System.out.println("Nhập n,n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
    }

    public void nhapMT1(int n, int m) {
        Scanner sc = new Scanner(System.in);
        a = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
    }

    public void inMT() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean doixung(MaTran mt) {

        for (int i = 0; i < mt.n; i++) {
            for (int j = 0; j < mt.m; j++) {
                if (mt.a[i][j] != mt.a[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public MaTran congMaTran(MaTran M1) {
        MaTran mt1 = new MaTran();
        mt1.n = this.n;
        mt1.m = this.m;
        mt1.a = new double[mt1.n][mt1.m];
        for (int i = 0; i < mt1.n; i++) {
            for (int j = 0; j < mt1.m; j++) {
                mt1.a[i][j] = this.a[i][j] + M1.a[i][j];
            }
        }
        return mt1;
    }

    public MaTran nhanMaTran(MaTran M1) {
        MaTran mt1 = new MaTran();
        mt1.n = this.n;
        mt1.m = M1.m;
        mt1.a = new double[mt1.n][mt1.m];
        for (int i = 0; i < mt1.n; i++) {
            for (int j = 0; j < mt1.m; j++) {
                mt1.a[i][j] = 0;
                for (int k = 0; k < M1.m; k++) {
                    mt1.a[i][j] += this.a[i][k] * M1.a[k][j];
                }
            }
        }
        return mt1;
    }

}
