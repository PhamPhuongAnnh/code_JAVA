/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13_2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Lab01_Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number, x, y, dem;
       
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        sc.nextLine();
        String[] arr = new String[n];
        String[] b;
        String kiTu;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            b = arr[i].split(" ");
            number = Integer.parseInt(b[0]);
            switch (number) {
                case 1:
                    kiTu = b[1];
                    switch (kiTu) {
                        case "F":
                            x = Integer.parseInt(b[2]);
                            list.add(0, x);
                            break;
                        case "L":
                            x = Integer.parseInt(b[2]);
                            list.add(x);
                            break;
                        case "P":
                            y = Integer.parseInt(b[2]);
                            x = Integer.parseInt(b[3]);
                            if (y < list.size()) {
                                list.add(y, x);
                            } else {
                                list.add(x);

                            }
                            break;
                    }
                    break;
                case 2:
                     x= Integer.parseInt(b[1]);
                    dem = 0;
                    for (int j = list.size() - 1; j >= 0; j--) {
                        if (list.get(j) == x) {
                            list.remove(j);
                            dem++;
                        }
                    }
                    System.out.println(dem);
                    break;
                case 3:
                    dem = 0;
                    x = Integer.parseInt(b[1]);
                    for (int j = 0; j < list.size(); j++) {
                        if (x == list.get(j)) {
                            dem++;
                        }
                    }
                    System.out.println(dem);
                    break;
                case 4:
                    x = Integer.parseInt(b[1]);
                    y = Integer.parseInt(b[2]);
                    if (y < list.size()) {
                        for (int j = x; j <= y; j++) {
                            System.out.printf("%d ", list.get(j));
                        }
                    } else {
                        for (int j = x; j <= y; j++) {
                            System.out.printf("%d ", list.get(j));
                        }

                    }
                    System.out.println("");
                    break;
                case 5:
                    for (int j = 0; j < list.size(); j++) {
                        System.out.printf("%d ", list.get(j));
                    }
                    System.out.println("");
                    break;
            }

        }
    }

}
