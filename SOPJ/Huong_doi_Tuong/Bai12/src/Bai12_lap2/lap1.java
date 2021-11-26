
package Bai12_lap2;
//thư viện
import java.time.LocalDate;
//import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lap1 {

    static LocalDate input() {
//        
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        LocalDate dateFirst = LocalDate.of(y, m, d);
        return dateFirst;
    }
    static Scanner sc = new Scanner(System.in);

    static void show(Period p, LocalDate first, LocalDate last) {
        int day = Math.abs(p.getDays());
        int month = Math.abs(p.getMonths());
        int year = Math.abs(p.getYears());
        String f = first.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String l = last.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.printf("Difference between %s and %s:\n%d Year(s), %d Month(s), %d Day(s)\n", f, l, year, month, day);
        
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        int i;
        for (i = 0; i < t; i++) {
            LocalDate dateFirst = input();
            LocalDate dateLast = input();
            Period period = Period.between(dateFirst, dateLast);
            System.out.printf("Case #%d:\n",i+1);
            show(period, dateFirst, dateLast);
        }
    }

}
