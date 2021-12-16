/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.B2;

import Them.B1.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Store {
    
    private static List<Book> listItem = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    
    public static void menu() {
        System.out.println("=====================MENU==================");
        System.out.println("1. Nhập thông tin về các tài liệu");
        System.out.println("2. Hiển thị thông tin về các loại tài liệu");
        System.out.println("3. tìm kiến thông tin sách theo loại");
        System.out.println("4. chỉnh sửa thông tin");
        System.out.println("5. Xóa thông tin");
        System.out.println("0. thoát chương trinhg");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Lựa chọn: ");
    }
    
    public static List<Book> add() {
        System.out.println("Nhập số lượng: ");
        int check = sc.nextInt();
        for(int i=0; i<check; i++){
            Book b = new Book();
            b.nhap();
            listItem.add(b);
        }
        
        return listItem;
    }
    
    public static void list() {
        for (Book item : listItem) {
            System.out.println(item.toString());
        }
    }
    
    public static void find(String ma) {
        for (Book item : listItem) {
            if (item.getID().equals(ma)) {
                System.out.println(item.toString());
            }
        }
    }
    
    public static void delete(String ma) {
        for (Book item : listItem) {
            if (item.getID().equals(ma)) {
                listItem.remove(item);
            }
        }
    }

    public static void edit(String ma) {
        for (Book item : listItem) {
            if (item.getID().equals(ma)) {
                System.out.println("Name: ");
                item.setName(sc.nextLine());
                System.out.println("Price: ");
                item.setPrice(sc.nextInt());
            }
        }
    }

    public static void main(String[] args) {
        
        while (true) {
            menu();
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    listItem = add();
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    System.out.println("Nhập mã cần tìm kiếm");
                    sc.nextLine();
                    String ma = sc.nextLine();
                    find(ma);
                    break;
                case 4:
                    System.out.println("Nhập mã cần chinh sửa");
                    sc.nextLine();
                    String ma1 = sc.nextLine();
                    edit(ma1);
                    break;
                case 5:                    
                    System.out.println("Nhập mã cần Xoa");
                    sc.nextLine();
                    String ma12 = sc.nextLine();
                    delete(ma12);
                    break;
                case 6:                    
                    return;
                default:
                    System.out.println("Mời nhập lại");
                    break;
            }
        }
    }
}
