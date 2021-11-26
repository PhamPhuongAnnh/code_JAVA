/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.basic.lesson14.lab1;

import java.util.Comparator;

/**
 *
 * @author admin
 */
public class DiemComparator implements Comparator<ThiSinh> {

    @Override
    public int compare(ThiSinh s1, ThiSinh s2) {
        if (s1.getTongDiem() > s2.getTongDiem()) {
            return -1;
        } else if (s1.getTongDiem() == s2.getTongDiem()) {
            return 0;
        }
        return 1;
    }
}
