
package Bai13lap2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class lap02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Student> list = new LinkedList<>();
        String[] arr = new String[N];
        String[] arr1;
        int a, b, c;
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
            arr1 = arr[i].split(" ");
            a = Integer.parseInt(arr1[0]);
            switch (a) {
                case 1:
                    int id = Integer.parseInt(arr1[1]);
                    String fisrtName = arr1[2];
                    String lastName = arr1[3];
                    LocalDate bir = LocalDate.parse(arr1[4], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    double gpa = Double.parseDouble(arr1[5]);
                    Student sv = new Student(id, fisrtName, lastName, bir, gpa);
                    list.add(sv);
                    break;
                case 2:
                    b = Integer.parseInt(arr1[1]);
                    switch (b) {
                        
                        case 1:
                            for (int j = list.size() - 1; j >= 0; j--) {
                                if (list.get(j).getFirstName().compareTo(arr1[2]) == 0) {
                                    list.remove(j);
                                }
                            }
                            break;
                        case 2:
                            for (int j = list.size() - 1; j >= 0; j--) {
                                if (list.get(j).getLastName().compareTo(arr1[2]) == 0) {
                                    list.remove(j);
                                }
                                
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    b = Integer.parseInt(arr1[1]);
                    c = Integer.parseInt(arr1[2]);
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j).getId() == b) {
                            switch (c) {
                                case 1:
                                    list.get(j).setFirstName(arr1[3]);
                                    break;
                                case 2:
                                    list.get(j).setLastName(arr1[3]);
                                    break;
                                case 3:
                                    list.get(j).setBrithday(LocalDate.parse(arr1[3], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                                    break;
                                case 4:
                                    list.get(j).setGpa(Double.parseDouble(arr1[3]));
                                    break;
                                default:
                                    break;
                                
                            }
                            
                        }
                    }
                    break;
                case 4:
                    b = Integer.parseInt(arr1[1]);
                    switch (b) {
                        case 1:
                            Collections.sort(list, new LastNameComparator().thenComparing(new FirstNameComparator()).thenComparing(new AgeComparator().thenComparing(new GPAComparator())));
                            break;
                        case 2:
                            Collections.sort(list, new AgeComparator().thenComparing(new LastNameComparator()).thenComparing(new FirstNameComparator()).thenComparing(new GPAComparator()));
                            break;
                        case 3:
                            Collections.sort(list, new GPAComparator().thenComparing(new LastNameComparator()).thenComparing(new FirstNameComparator()).thenComparing(new AgeComparator()));
                            break;
                        default:
                            break;
                        
                    }
                    break;
                case 5:
                    if (list.size() > 10) {
                        for (int j = 0; j < 10; j++) {
                            System.out.println(list.get(j));
                        }
                    } else {
                        for (int j = 0; j < list.size(); j++) {
                            System.out.println(list.get(j));
                        }
                    }
                    break;
                case 6:
                    for (int j = 0; j < list.size(); j++) {
                        System.out.println(list.get(j));
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
