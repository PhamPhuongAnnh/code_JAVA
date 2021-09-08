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
public class TABEG009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong(16);
        
        System.out.printf("0x%08x = %d", a,a);
    }
}
