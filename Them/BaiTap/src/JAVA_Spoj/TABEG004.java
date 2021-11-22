/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJAVACore;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class TABEG004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        khai báo a,b,da,db
        long a = sc.nextLong();
        int da = sc.nextInt();

        long b = sc.nextLong();
        int db = sc.nextInt();

//        hiển thị
        System.out.println("a = " + String.format("%" + da + "d", a));
        System.out.println("b = " + String.format("%" + db + "d", b));

    }
}
