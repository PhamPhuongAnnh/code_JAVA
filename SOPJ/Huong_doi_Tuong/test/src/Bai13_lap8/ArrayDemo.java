/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13_lap8;

import java.util.Arrays;

/**
 *
 * @author phuon
 */
public class ArrayDemo {

    static <E> void show(E[] list) {
        for (E item : list) {
            System.out.println(item.toString());
        }
        System.out.println("====================");
    }

    public static void main(String[] args) {
        Employee[] nhanVien = new Employee[5];

        nhanVien[0] = new Employee(1, "Nguyen", "Cong Phương", 26);
        nhanVien[1] = new Employee(2, "Nguyen", "Thi Lan", 25);
        nhanVien[2] = new Employee(3, "Nguyen", "Phương Anh", 26);
        nhanVien[3] = new Employee(4, "Luong", "Xuan Truong", 26);
        nhanVien[4] = new Employee(5, "Vu", "Van Thanh", 24);

        show(nhanVien);
        Arrays.sort(nhanVien, new AgeCompator());
        show(nhanVien);
        Arrays.sort(nhanVien, new FirstNameCompator());
        show(nhanVien);
        Arrays.sort(nhanVien, new LastNameComparator());
        show(nhanVien);
    }
}
