/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12_lap1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class lap3 {

    static void in(Date c) {
        DateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");
        String date = df.format(c);
        System.out.println(date);
    }
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            Calendar c = Calendar.getInstance();
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();

            c.set(Calendar.DAY_OF_MONTH, d);
            c.set(Calendar.MONTH, m - 1);
            c.set(Calendar.YEAR, y);
            Date date1 = c.getTime();
            System.out.printf("Case #%d:\n", i + 1);
            in(date1);

            c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) - 1);
            Date date2 = c.getTime();
            in(date2);
            
            c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + 2);
            Date date3 = c.getTime();
            in(date3);
            
            c.set(Calendar.DAY_OF_MONTH, d);
            c.set(Calendar.MONTH, m-1);
            c.set(Calendar.YEAR, y);
            c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
            Date dauThang = c.getTime();
            
            c.set(Calendar.DAY_OF_MONTH, d);
            c.set(Calendar.MONTH, m-1);
            c.set(Calendar.YEAR, y);
            c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
            Date cuoiThang = c.getTime();
            in(dauThang);
            in(cuoiThang);

        }
    }

}
