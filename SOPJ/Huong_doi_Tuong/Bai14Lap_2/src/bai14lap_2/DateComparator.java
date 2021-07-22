/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14lap_2;

import bai14lap_2.model.List;

import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 * @author phuon
 */
public class DateComparator implements Comparator<List> {

    @Override
    public int compare(List o1, List o2) {

        String date1 = o1.getDtTxt().substring(0, o1.getDtTxt().lastIndexOf(" "));
        LocalDate day1 = LocalDate.parse(date1);

        String date2 = o2.getDtTxt().substring(0, o2.getDtTxt().lastIndexOf(" "));
        LocalDate day2 = LocalDate.parse(date2);
        if (day1.isBefore(day2)) {
            return -1;
        } else if (day1 == day2) {
            return 0;
        }
        return 1;
    }

}
