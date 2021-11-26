/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13_lap6;

/**
 *
 * @author phuon
 */
public class Student implements Comparable<Student>{
    private int id;
    private String fullName;
    private int age;

    public Student() {
    }

    public Student(int id, String fullName, int age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Student o) {
//      return this.getFullName().compareTo(o.getFullName());
      return this.getAge()-o.getAge();
    }
    
    
}
