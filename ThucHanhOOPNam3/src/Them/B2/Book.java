/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B2;

import Them.B1.*;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author phuon
 */
public class Book {
    private String ID;
    private String name;
    private int price;

    public Book() {
    }

    public Book(String ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void nhap (){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        ID = sc.nextLine();
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Price: ");
        price = sc.nextInt();
    }

    @Override
    public String toString() {
        return "{" + "ID=" + ID + ", name=" + name + ", price=" + price+"}";
    }
    
}
