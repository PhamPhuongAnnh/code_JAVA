package javacore.basic.lesson14.lab1;

import java.util.Comparator;

public class NameComparator implements Comparator<ThiSinh> {

    @Override
    public int compare(ThiSinh s1, ThiSinh s2) {
        return s1.getHoTen().compareTo(s2.getHoTen());
    }
}
