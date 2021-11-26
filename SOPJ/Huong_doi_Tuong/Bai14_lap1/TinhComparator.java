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
public class TinhComparator implements Comparator<ThiSinh> {

    @Override
    public int compare(ThiSinh s1, ThiSinh s2) {
        return s1.getTinh().compareTo(s2.getTinh());
    }
}
