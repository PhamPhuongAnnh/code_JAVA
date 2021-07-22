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
public class LongitudeComparator implements Comparator<Country>{

    @Override
    public int compare(Country o1, Country o2) {
        if(o1.getLongitude()>o2.getLongitude()){
            return -1;
            
        }
        else if(o1.getLongitude() == o2.getLongitude()){
            return 0;
        }
        else return 1;
    }
    
}
