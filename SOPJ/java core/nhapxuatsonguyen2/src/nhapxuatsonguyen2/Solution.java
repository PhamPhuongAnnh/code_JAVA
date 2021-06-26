/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapxuatsonguyen2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a;
        int da;
        BigInteger b;
        int db;
        a = sc.nextLong();
        da = sc.nextInt();
        b = sc.nextBigInteger();
        db = sc.nextInt();
        System.out.printf("a = " + String.format("%" + da + "d\n", a));
        System.out.printf("b = " + String.format("%" + db + "d", b));
    }

}
