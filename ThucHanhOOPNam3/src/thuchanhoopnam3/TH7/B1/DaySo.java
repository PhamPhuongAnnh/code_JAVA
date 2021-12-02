/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH7.B1;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class DaySo {

    private int n;
    private int m[];

    public DaySo() {
    }

    public DaySo(int n, int[] m) {
        this.n = n;
        this.m = m;
    }

    public int[] getM() {
        return m;
    }

    public void setM(int[] m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhapDaySo() {
        System.out.println("Nhập số phần tử của dãy: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Nhập giá trị: ");
        m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
    }

    public static boolean kiemTraSoNguyenTo(int n) {
        if (n < 2 || (n > 2 && n % 2 == 0)) {
            return false;
        }
        int i;
        for (i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void inDaySo() {
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + m[i]);
        }
    }

    public void inSoNguyenTo() {
        System.out.print("\n Số nguyên tố: ");
        for (int i = 0; i < n; i++) {
            if (kiemTraSoNguyenTo(m[i])) {
                System.out.print("\t" + m[i]);
            }
        }
    }

    public static boolean kiemTraSoHoanHao(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) //tổng các ước số của a
            {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public void inSoHoanHao() {
        System.out.print("\nSố hoàn hảo: ");
        for (int i = 0; i < n; i++) {
            if (kiemTraSoHoanHao(m[i])) {
                System.out.print("\t" + m[i]);
            }
        }
        System.out.println("");
    }
    public void sapXepTang(){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(m[i] >m[j]){
                    int tg = m[i];
                    m[i] = m[j];
                    m[j] = tg;
                }
            }
        }
        System.out.println("dãy số tăng: ");
        inDaySo();
    }
    
    public void sapXepGiam(){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(m[i] < m[j]){
                    int tg = m[i];
                    m[i] = m[j];
                    m[j] = tg;
                }
            }
        }
        System.out.println("dãy số giảm: ");
        inDaySo();
    }
    public DaySo congDay(DaySo ds){
        DaySo ds1 = new DaySo();
        ds1.n = this.n+ds.n;
        ds1.m = new int[ds1.n];
        for(int i=0; i<ds1.n; i++){
            if(i<this.n){
                ds1.m[i] = this.m[i];
                System.out.println("a");
            } 
            else{
                System.out.println("b");
                ds1.m[i] = ds.m[i-n];
            }
        }
        return ds1;
    }
}
