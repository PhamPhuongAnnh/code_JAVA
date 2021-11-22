/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13_2;

/**
 *
 * @author phuon
 */
public class book_demo {
    public static void main(String[] args) {
        book thu_vien = new book("foolbal", "bong da");
        String English = thu_vien.getKey();
        String vietNam = thu_vien.getValue();
        System.out.println(English + ":" +vietNam);
        
    }
}
