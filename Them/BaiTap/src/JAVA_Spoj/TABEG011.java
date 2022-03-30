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
public class TABEG011 {

    public static void main(String[] args) {
          // System.setIn(new FileInputStream("F:\\input.txt"));
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        System.out.printf("a = " + String.format("%" + d1 + "." + d2 + "f", a));
    }
}
