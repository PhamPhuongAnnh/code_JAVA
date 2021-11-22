/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.csv.model;

import java.util.Comparator;

/**
 *
 * @author phuon
 */
public class NameComparator implements Comparator<Country>{

    @Override
    public int compare(Country o1, Country o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
