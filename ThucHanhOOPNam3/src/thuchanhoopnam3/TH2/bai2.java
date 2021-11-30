/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH2;

import java.util.Scanner;

/**
 Viết các chương trình nhập vào một số nguyên n và in ra số nhị phân tương ứng
với n.

 */
public class bai2 {
    public static void main(String[] args) {
        System.out.println("nhập số n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int[] a = new int[32];
        while(n!=0){
            a[i++] = n%2;
            n/=2;
        }
        for(int j=i-1; j>=0;j--){
            System.out.print(a[j]);
        }
        System.out.println("");
    }
}
