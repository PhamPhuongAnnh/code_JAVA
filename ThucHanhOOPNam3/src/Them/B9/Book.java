/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B9;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;


/**
 *
 * @author vinh
 */
public class Book {
     private String id;
    private String author;
    private String title;
    private String category;

    public Book() {
    }

    public Book(String id, String author, String title, String category) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public void nhapThongTin() {
        System.out.print("Id: ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        id = sc.nextLine();
        System.out.print("Author: ");
        author = sc.nextLine();
        System.out.print("Title: ");
        title = sc.nextLine();
        System.out.println("Category:");
        System.out.println("1. Tạp chí.");
        System.out.println("2. KHXH.");
        System.out.println("3. KHTN.");
        System.out.println("4. Luận văn.");
        System.out.print("Your choose:");
        int choose = sc.nextInt();
        if(choose == 1) category = "Tạp chí";
        else if(choose == 2) category = "KHXH";
        else if(choose == 3) category = "KHTN";
        else if(choose == 4) category = "Luận văn";
    }
    
    public void hienThiThongTin() {
        System.out.println("Id: " + id);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("");
    }
}
