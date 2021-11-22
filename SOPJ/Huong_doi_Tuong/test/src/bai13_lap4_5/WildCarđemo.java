/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13_lap4_5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuon
 */
public class WildCarđemo {
    static void show(List<?> list){
       for(int i=0 ;i<list.size(); i++){
           System.out.println(list.get(i));
       }
    }
    public static void main(String[] args) {
        ArrayList<String> monHoc = new ArrayList<>();
        monHoc.add("Toan");
        monHoc.add("Van");
        monHoc.add("Su");
        monHoc.add("Dia");
        ArrayList<Double> diemMonHoc = new ArrayList<>();
        diemMonHoc.add(9.2);
        diemMonHoc.add(8.1);
        diemMonHoc.add(8.6);
        diemMonHoc.add(9.5);
        show(monHoc);
        show(diemMonHoc);
    }
}
