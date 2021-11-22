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
public class Student_demo {

    public static void main(String[] args) {
        Student sv = new Student("CT040401", "Pham Phuong Anh", 21);
        StudentDao svDao = new StudentDao();
        svDao.insert(sv);
    }
}
