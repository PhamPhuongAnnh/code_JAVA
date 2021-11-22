/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.bai6_lap2;

/**
 *
 * @author Phương Lan
 */
public class Main {

    static void setDefaultName(Student st) {
        st.Name = "Pham Viet Hoang";
    }

    public static void main(String[] args) {
        Student sv1 = new Student("Pham Thi Phuong Anh", "CT4D");
        Student sv2 = new Student("Pham Thi Lan Anh", "CT4D");
        setDefaultName(sv2);
        sv1.show();
        sv2.show();
    }
}
