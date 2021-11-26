/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12_lap2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class lap2 {

    static Scanner sc = new Scanner(System.in);

    static LocalDateTime input() {
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        LocalDateTime dateFirst = LocalDateTime.of(y, m, d, sc.nextInt(), sc.nextInt(), sc.nextInt());
        return dateFirst;
    }

    static void show(LocalDateTime first, LocalDateTime last) {
        Duration p = Duration.between(first, last);
        String f = first.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
        String l = last.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
        int d = (int) Math.abs(p.toDays());
        int h = (int) Math.abs(p.toHours() - p.toDays() * 24);
        int m = (int) Math.abs(p.toMinutes() - p.toHours() * 60);
        int s = (int) Math.abs(p.toMillis()/1000 - p.toMinutes() * 60);
        System.out.printf("Difference between (%s) and (%s):\n%d Days, %d Hours, %d Minutes, %d Seconds\n", f, l, d, h, m, s);

    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        int i;
        for (i = 0; i < t; i++) {
            LocalDateTime dateFirst = input();
            LocalDateTime dateLast = input();
            System.out.printf("Case #%d:\n", i + 1);
            show(dateFirst, dateLast);
        }
    }
}
