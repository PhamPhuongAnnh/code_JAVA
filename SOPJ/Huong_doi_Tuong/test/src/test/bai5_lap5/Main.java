/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.bai5_lap5;

/**
 *
 * @author Phương Lan
 */
public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.nhap();
        if(st.check()) { // if(đk) {...} else {...}
            st.xuat();
        }
        // Nhap cho den khi nao ma du lieu dung thi moi in ra
    }
}
