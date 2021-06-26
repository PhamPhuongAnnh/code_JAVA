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
public class Student {
    public String Name;
    public String className;

   
    public Student(String Name, String className) {
        this.Name = Name;
        this.className = className;
    }
    
    public void show(){
        System.out.println(this.Name);
        System.out.println(this.className);
    }
}
