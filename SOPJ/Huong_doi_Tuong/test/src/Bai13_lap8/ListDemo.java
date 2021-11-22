/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13_lap8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author phuon
 */
public class ListDemo {
    static <E> void show(List<E> list){
        for(E item :list){
            System.out.println(item.toString());
        }
        System.out.println("================");
    }
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Nguyen Hoang", "Phi", 20));
        list.add(new Employee(1, "Nguyen Luong", "Cuong", 19));
        list.add(new Employee(1, "Hua Trung", "Hieu", 10));
        list.add(new Employee(1, "Pham Phuong", "Anh", 21));
        list.add(new Employee(1, "Mai Gia", "Phuc", 19));
        
        show(list);
        Collections.sort(list,new LastNameComparator().thenComparing(new AgeCompator()));
        show(list);
        Collections.sort(list,new FirstNameCompator());
        show(list);
        Collections.sort(list,new AgeCompator());
        show(list);
    }
}
