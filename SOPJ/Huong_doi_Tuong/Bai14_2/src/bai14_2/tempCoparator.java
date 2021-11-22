/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14_2;

import bai14_2.Model.List;
import java.util.Comparator;

/**
 *
 * @author phuon
 */
public class tempCoparator implements Comparator<List>{

    @Override
    public int compare(List o1, List o2) {
        if(o1.getMain().getTemp() > o2.getMain().getTemp()){
            return -1;
        }else if(o1.getMain().getTemp() == o2.getMain().getTemp() ){
            return 0;
        }
        return 1;
    }
    
    
}
