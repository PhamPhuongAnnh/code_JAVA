/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KMA_SanSung;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class DaoVang {

    public static boolean columnIsEmpty(int[][] A, int j) {
        for (int[] A1 : A) {
            if (A1[j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean rowIsEmpty(int[][] A, int i) {
        for (int j = 0; j < A[0].length; j++) {
            if (A[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static int numOfEmptyColumn(int[][] A) {
        int count = 0;
        for (int j = 0; j < A[0].length; j++) {
            if (columnIsEmpty(A, j)) {
                count++;
            }
        }
        return count;
    }

    public static int numOfEmptyRow(int[][] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (rowIsEmpty(A, i)) {
                count++;
            }
        }
        return count;
    }

    public static int calculate(int[][] A) {
        return numOfEmptyColumn(A) * A.length
                + numOfEmptyRow(A) * A[0].length
                - numOfEmptyColumn(A) * numOfEmptyRow(A);
    }

    public static void main(String[] args) {
        //System.setIn(new FileInputStream("D:\\Input\\input.txt"));
         Scanner sc = new Scanner(System.in);
        int a, b;
        int d1, d2;
        a = sc.nextInt();
        b = sc.nextInt();
        d1 = sc.nextInt();
        d2 = sc.nextInt();
 
        System.out.printf(String.format("%d" + " : " + "%d"
                + " = " + "%" + d1 + "." + d2 + "f", a, b, (float) a / b));
    }
}
