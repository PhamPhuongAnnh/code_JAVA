/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13_lap6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author phuon
 */
public class ArraysDemo {

    static <E> void show(E[] list) {
        for (E item : list) {
            System.out.println(item.toString());
        }
        System.out.println("======================");
    }

    public static void main(String[] args) {
        Student[] list = new Student[5];
        list[0] = new Student(123, "Pham Phuong Anh", 20);
        list[1] = new Student(123, "Pham Phuong Lan", 20);
        list[2] = new Student(123, "Pham Anh", 20);
        list[3] = new Student(123, "Anh Pham", 20);
        list[4] = new Student(123, "lan", 20);
        
        show(list);
        Arrays.sort(list);
        show(list);
    }
}
