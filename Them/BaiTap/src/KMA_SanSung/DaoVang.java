/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KMA_SanSung;

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
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        int[] values = new int[testCase];

        for (int test = 0; test < testCase; test++) {
            int hight = input.nextInt();
            int width = input.nextInt();
            int[][] A = new int[hight][width];

            for (int i = 0; i < hight; i++) {
                for (int j = 0; j < width; j++) {
                    A[i][j] = input.nextInt();
                }
            }

            values[test] = calculate(A);
        }

        System.out.println("");
        for (int test = 0; test < testCase; test++) {
            System.out.println("#" + (test + 1) + " " + values[test]);
        }
    }
}
