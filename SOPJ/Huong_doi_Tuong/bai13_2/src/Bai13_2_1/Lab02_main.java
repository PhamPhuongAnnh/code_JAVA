/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13_2_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Lab02_main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();
        Student st;
        sc.nextLine();
        String[] arr = new String[n];
        String[] b;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            b = arr[i].split(" ");
            switch (Integer.parseInt(b[0])) {
                case 1:
                    st = new Student();
                    st.setId(Integer.parseInt(b[1]));
                    st.setFirstName(b[2]);
                    st.setLastName(b[3]);
                    st.setBirthday(LocalDate.parse(b[4], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    st.setGpa(Double.parseDouble(b[5]));
                    list.add(st);
                    break;
                case 2:
                    switch (Integer.parseInt(b[1])) {
                        case 1:
                            for (int j = 0; j < list.size(); j++) {
                                if (list.get(j).getFirstName().equals(b[2])) {
                                    list.remove(j);
                                }
                            }
                            break;
                        case 2:
                            for (int j = 0; j < list.size(); j++) {
                                if (list.get(j).getLastName().equals(b[2])) {
                                    list.remove(j);
                                }
                            }
                            break;
                    }
                case 3:
                    for (Student item: list) {
                        if (item.getId() == Integer.parseInt(b[1])) {
                            switch (Integer.parseInt(b[2])) {
                                case 1:
                                    item.setFirstName(b[3]);
                                    break;
                                case 2:
                                    item.setLastName(b[3]);
                                    break;
                                case 3:
                                    item.setBirthday(LocalDate.parse(b[3], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                                    break;
                                case 4:
                                    item.setGpa(Double.parseDouble(b[3]));
                                    break;
                            }
                        }
                    }
                    break;
                case 4:
                    switch (Integer.parseInt(b[1])) {
                        case 1:
                            Collections.sort(list, new LastNameComparator().thenComparing(new FirstNameComparator().thenComparing(new AgeComparator().thenComparing(new GPAComparator()))));
                            break;
                        case 2:
                             Collections.sort(list,new AgeComparator().thenComparing(new LastNameComparator().thenComparing(new FirstNameComparator().thenComparing(new GPAComparator()))));
                            break;
                        case 3:
                             Collections.sort(list,new GPAComparator().thenComparing(new LastNameComparator().thenComparing(new FirstNameComparator().thenComparing(new AgeComparator()))));
                            break;

                    }
                case 5:
                    for (i = 0; i < list.size(); i++) {
                        list.get(i).toString();
                        if (i == 9) {
                            break;
                        }
                    }
                    break;
                case 6:
                    list.stream().forEach(ob -> System.out.println(ob));
                    break;
            }
        }

    }

}
