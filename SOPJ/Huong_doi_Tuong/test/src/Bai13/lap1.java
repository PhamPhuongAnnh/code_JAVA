/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

import java.util.LinkedList;


/**
 *
 * @author phuon
 */
public class lap1 {
    static void show(LinkedList a)
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.add("PA");
        list.add("Truong");
        list.add("Tung");
        list.add("Phi");
        show(list);
        list.set(2, "TUNG");
        show(list);
    }
}
