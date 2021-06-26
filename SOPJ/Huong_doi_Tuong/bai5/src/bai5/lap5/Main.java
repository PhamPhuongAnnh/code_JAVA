/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.lap5;

/**
 *
 * @author Phương Lan
 */
public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("pham thi phuong anh",9, 2001, "A");
        
        Student sv = new Student();
        sv.inputInfo();
        sv1.printInfo();
        sv.printInfo();
    }
}
