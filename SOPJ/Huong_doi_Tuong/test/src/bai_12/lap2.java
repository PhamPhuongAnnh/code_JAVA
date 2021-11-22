/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_12;

import java.util.Date;

/**
 *
 * @author Phương Lan
 */
public class lap2 {
    public static void main(String[] args) {
        Date date1 = new Date(1617878789);
        Date date2 = new Date();
        System.out.println(date1.compareTo(date2));
        System.out.println(date1.before(date2));
        System.out.println(date1.after(date2));
        System.out.println(date2.getTime());
    }
}
