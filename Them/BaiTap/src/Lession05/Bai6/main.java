/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession05.Bai6;

/**
 *
 * @author phuon
 */
public class main {
    public static void main(String[] args) {
        Triangle tg = new Triangle();
        tg.nhap();
        tg.Loai();
        System.out.println(tg.Loai());
        if(tg.Loai()!= "Khong phai tam giac"){
             System.out.println("chu vi: "+tg.chuVi());
        System.out.println("Dien Tich: "+tg.dienTic());
        }
       
    }
    
    
}
