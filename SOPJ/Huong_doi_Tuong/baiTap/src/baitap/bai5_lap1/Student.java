/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.bai5_lap1;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Student {
     public String fullname;
    public String studentID;
    
    public void input(){
        System.out.println(">> Full Name: ");
        Scanner sc = new Scanner(System.in);
        this.fullname = sc.nextLine();
        System.out.println(">> Student ID: ");
        this.studentID = sc.nextLine();
    }
    
    public void output(){
        System.out.println("---------------");
        System.out.println(this.fullname);
        System.out.println(this.studentID);
    }
}
