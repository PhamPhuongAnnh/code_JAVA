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
public class lap2 {

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
//            c.clear();
            c.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            c.set(Calendar.MONTH, sc.nextInt()-1);
            c.set(Calendar.YEAR, sc.nextInt());
            Date date = c.getTime();
            System.out.printf("Case #%d:\n", i + 1);
            in(date);
            c.setFirstDayOfWeek(Calendar.MONDAY);
            c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            Date date2 = c.getTime();
            in(date2);
            c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
            Date date3 = c.getTime();
            in(date3);
        }

    }
}
