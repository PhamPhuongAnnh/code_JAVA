/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13_lap9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author phuon
 */
public class Demo {
    static <E> void show(List<E> list){
        for(E item:list){
            System.out.println(item.toString());
        }
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(2, "Pham Phuong Anh", 20));
        list.add(new Student(1, "Vu Van Thanh", 10));
        list.add(new Student(3, "Vu Dinh Anh Tuan", 24));
        list.add(new Student(6, "Nuyen van Nam", 20));
        list.add(new Student(10, "Pham Phuong Lam", 39));
        show(list);
        Collections.sort(list,new MaSVComparator().thenComparing(new HoTenComparator().thenComparing(new DiemComparator())));
        show(list);
    }
}
