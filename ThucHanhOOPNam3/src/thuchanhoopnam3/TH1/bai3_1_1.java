package thuchanhoopnam3.TH1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Viết chương trình nhập số cạnh của đa giác, chiều dài các cạnh sau đó hiển
 * thị lên màn hình tất cả các thông tin đã nhập, tính chu vi đa giác.
 */
public class bai3_1_1 {

    public static void main(String[] args) {
        System.out.println("Nhập số lượng cạnh của đa giác: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int chuVi = 0;
        System.out.println("Đa giác có "+n+" cạnh");
        System.out.println("Thông số độ dài các cạnh: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+"\t");
            chuVi+=a[i];
        }
        System.out.println("\nChu vi đa giác là: "+chuVi);
        
    }
}
