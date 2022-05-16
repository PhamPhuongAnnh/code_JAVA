/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Them.Test_3_b1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Main {

    public static void menu() {
        System.out.println("1. nhập  tài khoản từ bàn phím");
        System.out.println("2. xuất thông tin tài khoản đã nhập");
        System.out.println("3. nạp tiền vào tài khoản");
        System.out.println("4. rút tiền");
        System.out.println("5. đáo hạn");
        System.out.println("6. chuyển khoản");
        System.out.println("0. Kết thúc");
    }
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        while (true) {
            menu();
            int check = sc.nextInt();

            switch (check) {
                case 1:
                    Account acc = new Account();
                    acc.nhap();
                    list.add(acc);
                   
                    while (true) { 
                        System.out.println("\t1. nhập tiếp\n\t0.không nhập nữa");
                        int s = sc.nextInt();
                        if (s == 0) {
                            break;
                        } else if (s == 1) {
                            Account acc1 = new Account();
                            acc1.nhap();
                            list.add(acc1);
                        } else {
                            System.out.println("Chỉ nhập 1 và 0. Mời nhập lại");
                        }
                    }
                    break;
                case 2:
                    int i = 0;
                    for (Account item : list) {
                        System.out.println("Tài khoản số: " + (++i));
                        System.out.println(item.toString());
                    }
                    break;
                case 3:
                    System.out.println("Nhập số tiền muốn nạp ");
                    double check1 = sc.nextDouble();
                    System.out.println("Bạn muốn nhập vào tài khoản số mấy:");
                    int c = sc.nextInt();
                    for (int j = 0; j < list.size(); j++) {
                        if (j + 1 == c) {
                            list.get(j).napTien(check1);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập số muốn rút: ");
                    double check2 = sc.nextDouble();
                    System.out.println("Bạn muốn rút ở tài khoản số mấy: ");
                    int c1 = sc.nextInt();
                    for (int j = 0; j < list.size(); j++) {
                        if (j + 1 == c1) {
                            list.get(j).rutTien(check2);
                        }
                    }
                    break;
                case 5:
                    for (Account item : list) {
                        item.daoHan();
                    }
                    break;
                case 6:
                    System.out.println("Nhập số tài khoản chuyển đi: ");
                    int ch = sc.nextInt();
                    System.out.println("Nhập số tài khoản chuyển đến: ");
                    int ch1 = sc.nextInt();

                    double s;
                    for (int j = 0; j < list.size(); j++) {
                        if (j + 1 == ch) {
                            do {
                                System.out.println("Nhập số tiền chuyển: ");
                                s = sc.nextDouble();
                            } while (s > list.get((j)).getSoTien());
                            list.get(j).chuyenKhoan(list.get(ch1 - 1), s);
                        }
                    }

                    break;
                case 0:
                    break;

            }
        }

    }
}
