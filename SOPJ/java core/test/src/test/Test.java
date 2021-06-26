/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i]= a[j];
        a[j] = temp;
    }
    
    static void sapXepChon(int[] a) {
        int i,j, index_min;
        for(i = 0; i<a.length-1; i++){
            index_min= i;
            for(j = i+1 ;j< a.length; j++){
                if(a[j]<a[index_min]){
                    index_min =j;
                }
            }
            if(index_min !=i){
                swap(a, i, index_min);
            }
        }
        
    }
    static void inMang(int[] a){
        for(int x:a){
            System.out.printf("%6d",x);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
//        double s, t;
//        Scanner sc = new Scanner(System.in);
//        s = sc.nextDouble();
//        if (s <= 0.8) {
//            t = 10000;
//        } else if (s <= 30) {
//            t = 10000 + (s - 0.8) * 11000;
//        } else {
//            t = 10000 + 30 * 11000 + (s - 30.8) * 10000;
//        }
//        int a = (int) (Math.round(t / 1000) * 1000);
//        System.out.println(a);

        // NGAY KE TIEP
//        Scanner sc = new Scanner(System.in);
//        int d = sc.nextInt();
//        int m = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println("Ngay hien tai: " + d + "/" + m + "/" + y);
//        if (m == 1 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
//            if (d == 1) {
//                if (m == 1) {
//                    d = 31;
//                    m = 12;
//                    y--;
//                } else if (m == 8) {
//                    d = 31;
//                    m--;
//                } else {
//                    d = 30;
//                    m--;
//                }
//
//            } else if (d > 1 && d <= 31) {
//                d--;
//            } else {
//                return;
//            }
//        } else if (m == 2 || m == 4 || m == 6 || m == 9 || m == 11) {
//            if (d == 1) {
//                d = 31;
//                m--;
//            } else if (d > 1 && d <= 30) {
//                d--;
//            } else {
//                return;
//            }
//        } else if (m == 3) {
//            if ((y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))) {
//                if (d == 1) {
//                    d = 29;
//                    m--;
//                } else if (d > 1 && d <= 29) {
//                    d--;
//                } else {
//                    return;
//                }
//            } else {
//                if (d == 1) {
//                    d = 28;
//                    m--;
//                } else if (d > 1 && d <= 28) {
//                    d--;
//                } else {
//                    return;
//                }
//            }
//        }
//
//        System.out.println("Ngay truoc do: " + d + "/" + m + "/" + y);
//        Scanner sc = new Scanner(System.in);
//        int d = sc.nextInt();
//        int m = sc.nextInt();
//        int y = sc.nextInt();
//        
//        int l = d;
//        for (int i = 1; i < m; i++) {
//            switch (i) {
//                case 4:
//                case 6:
//                case 9:
//                case 11:
//                    l += 30;
//                    break;
//                case 2:
//                    if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
//                        l += 29;
//                    } else {
//                        l += 28;
//                    }
//                    break;
//                default:
//                    l += 31;
//            }
//        }
//        System.out.println("Ngay " + d + "/" + m + " la ngay thu " + l + " cua nam " + y);
        //giá trị của hàm 
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        double s;
//        if (x == 5 && x > 5) {
//            s = 2 * x * x + 5 * x + 9;
//            System.out.printf("f(%.3f) = %.3f", x, s);
//        } else {
//            s = -2 * x * x + 4 * x - 9;
//            System.out.printf("f(%.3f) = %.3f", x, s);
//        }
        // quý trong năm
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        switch (m) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Thang " + m + " thuoc Quy I");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Thang " + m + " thuoc Quy II");
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("Thang " + m + " thuoc Quy III");
//                break;
//            case 11:
//            case 12:
//            case 10:
//                System.out.println("Thang " + m + " thuoc Quy IV");
//                break;
//            default:
//                System.out.println("Trong nam khong co thang " + m);
//        }
//        Scanner sc = new Scanner(System.in);
//        long y = sc.nextLong();
//        if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
//            System.out.println("Nam " + y + " la nam nhuan");
//
//        } else
//            System.out.println("Nam " + y + " khong phai la nam nhuan");
//        
//        int[] a = new int[5];
//        a[0] = 10;
//        a[1] = 14;
//        a[2] = 67;
//        a[3] = 77;
//        a[4] = 7;
//        System.out.println("size= "+a.length);
//        int[] a = new int [5];
//        System.out.println("size= "+a.length);
//        for(int i=0; i<a.length; i++){
//            a[i] = 100*i+3;
//        }
//        System.out.println("a[3] = "+ a[3]);
//        Scanner sc = new Scanner(System.in);
//        int[] a = new int[5];
//        System.out.println("size= "+a.length);
//        for(int i=0; i<a.length; i++){
//             a[i] = sc.nextInt();
//        }
//        System.out.println("a[3]= "+a[3]);
//        int[] arr = {45,55,767,434};
//        for(int x : arr){
//            System.out.println("a [i] = "+x);
//           
//        }
//        int[] chieuCao = {176, 167, 160, 177};
//        System.out.println("Chieu cao ban dau: ");
//        inMang(chieuCao);
//        sapXepChon(chieuCao);
//        System.out.println("chieu cao sau khi sap xếp");
//        inMang(chieuCao);
        
        
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int a = sc.nextInt();
//            if (soChinhPhuong(a) == 1) {
//                System.out.printf("%5d : YES\n", a);
//
//            } else {
//                System.out.printf("%5d : NO\n", a);
//            }
//        }
        
        
        int[][] a = new int[5][7];
        int i,j;
        for(i=0; i<5; i++){
            for(j=0; j<7; j++){
                a[i][j] = 10*i*j;
            }
        }
         for(i=0; i<5; i++){
            for(j=0; j<7; j++){
                System.out.printf("%02d ",a[i][j]);
            }
             System.out.println("");
        }
    }

}
