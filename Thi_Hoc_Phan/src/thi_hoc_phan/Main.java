/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi_hoc_phan;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("___________Menu________");

        System.out.println("Lua chon: ");
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Moi nhap lai chuc nang");
            }
        }
    }
}
