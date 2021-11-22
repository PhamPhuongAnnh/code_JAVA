/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13_lap3;

import java.util.ArrayList;

/**
 *
 * @author phuon
 */
public class StorageManagement {

    static <E> void getFirst(ArrayList<E> arr) {
        System.out.println(arr.get(0));
    }

    static <E> void getLast(ArrayList<E> arr) {
        System.out.println(arr.get(arr.size() - 1));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Pham lan anh");
        list2.add("Pham Phuong Anh");
        list2.add("Pham Viet Hoang");
        list2.add("Pham Van Bien");
        list2.add("Nguyen Thi Tuat");

        getFirst(list1);
        getFirst(list2);
        getLast(list1);
        getLast(list2);

    }

}
