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
public class TABEG007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        
        System.out.println(a+ " : "+ b+ "= "+ String.format("%"+ d1+ "." + d2 +"f", ((double)a/b)));

    }
}
