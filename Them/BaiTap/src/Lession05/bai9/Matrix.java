/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession05.bai9;

/**
 *
 * @author phuon
 */
public class Matrix {
    private int hang;
    private int cot;
    private int[][] a = new int[hang][cot];
    public Matrix() {
    }

    public Matrix(int hang, int cot) {
        this.hang = hang;
        this.cot = cot;
    }

    

    public int getCot() {
        return cot;
    }

    public void setCot(int cot) {
        this.cot = cot;
    }

    public int getHang() {
        return hang;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
    
}
