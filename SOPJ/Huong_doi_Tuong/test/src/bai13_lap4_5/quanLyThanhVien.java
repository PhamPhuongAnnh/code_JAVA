/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13_lap4_5;

import java.util.ArrayList;

/**
 *
 * @author phuon
 */
public class quanLyThanhVien {

    static <T> void show(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Phuong Anh");
        list.add("Thanh Tung");
        list.add("Hoang Phi");
        list.add("Truong");
        show(list.get(0));
        show(list.get(list.size() - 1));

    }
}
