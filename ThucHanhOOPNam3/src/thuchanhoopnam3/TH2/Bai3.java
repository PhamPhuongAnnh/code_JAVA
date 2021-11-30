/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH2;

import java.util.Scanner;

/**
 * Nhập vào ngày, thàng, năng và cho biết đó là ngày thứ bao nhiêu trong năm
 * (biết rằng một năm có 365 ngày hoặc 336 ngày với năm nhuận).
 *
 */
public class Bai3 {
// mặc định ngày tháng hợp lệ

    public static void main(String[] args) {
        System.out.println("Nhập ngày tháng năm: ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        int s = d;
        for (int i = 1; i < m; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    s += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    s+=30;
                    break;
                case 2: 
                    if(y%100!=0 && y%4==0|| y %400 ==0){
                        s +=29;
                        break;
                    }
                    else{
                        s+=28;
                        break;
                    }
            }
        }
        System.out.println(d+"/"+m+"/"+y+" là ngày thứ "+s+" trong năm");
    }
}
