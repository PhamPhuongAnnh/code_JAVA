/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.bai7_lap1;

/**
 *
 * @author Phương Lan
 */
public class MainClass {

    public static void main(String[] args) {
        hinhTron ht = new hinhTron();
        ht.setBanKinh(30);
        System.out.println("Chu vi: "+ht.chuVi());
        System.out.println("Dien tich: "+ht.dienTich());
    }

}
