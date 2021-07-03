/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13_2;

/**
 *
 * @author phuon
 */
public class key_value_demo {

    public static void main(String[] args) {
        key_value<String, String> tuDien = new key_value<>("hello", "Xin chao");
        String key = tuDien.getKey();
        String value = tuDien.getValue();
        System.out.println(key + ":" + value);
        key_value<String, Integer> giaTien = new key_value<>("Quan ao", 14);
        key = giaTien.getKey();
        int gia = giaTien.getValue();
        System.out.println(key + ":" + gia);

    }
}
