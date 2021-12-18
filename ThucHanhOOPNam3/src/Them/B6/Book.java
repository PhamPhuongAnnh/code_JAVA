/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B6;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Book {

    private String id;
    private String authors;
    private String title;
    private String category;

    public Book() {
    }

    public Book(String id, String authors, String title, String category) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
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

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", authors=" + authors + ", title=" + title + ", category=" + category + '}';
    }

    public void menu() {
        System.out.println("\t1. Tạp chí");
        System.out.println("\t2. KHXH");
        System.out.println("\t3. KHTN");
        System.out.println("\t4. Luận văn");
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("Authors: ");
        id = sc.nextLine();

        System.out.println("Title: ");
        id = sc.nextLine();

        System.out.println("Category: ");
        menu();
        int check = sc.nextInt();
        switch (check) {
            case 1:
                this.setCategory("Tạp chí");
                break;
            case 2:
                this.setCategory("KHXH");
                break;
            case 3:
                this.setCategory("KHTN");
                break;
            case 4:
                this.setCategory("Luận văn");
                break;
        }
    }
}
