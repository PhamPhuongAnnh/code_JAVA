/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12_lap1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class lap1 {

    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        int i;
        for (i = 0; i < t; i++) {
            Calendar c = Calendar.getInstance();
            c.clear();
                  
            c.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            c.set(Calendar.MONTH, sc.nextInt()-1);
            c.set(Calendar.YEAR, sc.nextInt());
            Date d = c.getTime();
            System.out.printf("Case #%d:\n",i+1);
            System.out.println(d);
        }
    }

}
