/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13_2_1;

import java.util.Comparator;

/**
 *
 * @author phuon
 */
public class GPAComparator implements Comparator<Student>{
      @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGpa()> o2.getGpa()){
            return 1;
        }
        else if(o1.getGpa() < o2.getGpa()){
            return -1;
        }
        else{
            return 0;
        }
    }

}
