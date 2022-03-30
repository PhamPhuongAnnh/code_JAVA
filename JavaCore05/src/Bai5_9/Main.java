/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_9;

/**
 *
 * @author phuon
 */
public class Main {
    public static void main(String[] args) {
     Matran a = new Matran(); 
     a.read_matrix();
     a.show_matrix();
     Matran b = new Matran(a.col, a.row, a.rotate_right_90());
     b.show_matrix();
    }
}
