/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_9;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Matran {

    int row;
    int col;
    double[][] a;

    public Matran() {
    }

    public Matran(int row, int col, double[][] a) {
        this.row = row;
        this.col = col;
        this.a = a;
    }
    
    void read_matrix() {
        Scanner sc = new Scanner(System.in);

        this.row = sc.nextInt();
        this.col = sc.nextInt();
        this.a = new double[this.row][this.col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.a[i][j] = sc.nextDouble();
            }
        }
    }

    void show_matrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%6.1f", a[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("");
    }

    double[][] rotate_right_90() {
        double[][] b = new double[this.col][this.row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[this.col - 1 - j][i] = this.a[i][j];
            }
        }
        return b;
    }

    double[][] rotate_180() {
        double[][] b = new double[this.col][this.row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[this.row - 1 - i][this.col - 1 - j] = this.a[i][j];
            }
        }
        return b;
    }

    double[][] rotate_left_90() {
        double[][] b = new double[this.col][this.row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[j][this.row - 1 - i] = this.a[i][j];
            }
        }
        return b;
    }
}
