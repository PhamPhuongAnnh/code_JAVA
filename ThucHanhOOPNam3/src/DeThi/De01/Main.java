/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi.De01;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Main {

    public static void menu() {
        System.out.println("_____________________MENU_______________________________");
        System.out.println("1. Nhập sản phẩm");
        System.out.println("2. Nhập khách hàng");
        System.out.println("3. Thay đổi thông tin của 1 sản phẩm");
        System.out.println("4. Hiển thị danh sách sản phẩm ");
        System.out.println("5. Mua hàng");
        System.out.println("6. Khách hàng có tổng số tiền đã mua lớn nhất");
        System.out.println("7. Thay đổi thông tin khách hàng");
        System.out.println("8. sắp xếp theo thứ tự tăng dần của số tìn mà khách hàng đã mua và hiển thị");
        System.out.println("0. Thoát");
        System.out.println("_________________________________________________________");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manage ql = new Manage();
        while (true) {
            menu();
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    ql.inputListProduct();
                    break;
                case 2:
                    ql.inputCustomer();
                    break;
                case 3:
                    System.out.println("Enter id to edit: ");
                    sc.nextLine();
                    String id = sc.nextLine();
                    ql.editProduct(id);
                    break;
                case 4:
                    ql.ouputProduct();
                    break;
                case 5:
                    System.out.println("Enter id Customer: ");
                    sc.nextLine();
                    String idCheck = sc.nextLine();
                    double money = 0;
                    System.out.println("Enter id prodouct: ");

                    String idcheck2 = sc.nextLine();
                    System.out.println("Enter the quantity you want to buy");
                    int sl = sc.nextInt();
                    money += ql.buyProduct(idCheck, idcheck2, sl);
                    while (true) {
                        System.out.println("1. Do you buy again");
                        System.out.println("0. No, thanks");
                        int check4 = sc.nextInt();
                        if (check4 == 0) {
                            for (Customer item : ql.listCustomer) {
                                if (item.getIdKH().equals(idCheck)) {
                                    item.setMoney(money);
                                    break;
                                }
                            }
                            break;
                        } else if (check4 == 1) {
                            System.out.println("Enter id prodouct: ");
                            sc.nextLine();
                            String idcheck3 = sc.nextLine();
                            System.out.println("Enter the quantity you want to buy");
                            int s2 = sc.nextInt();
                            money += ql.buyProduct(idCheck, idcheck3, s2);
                        }
                    }
                    break;
                case 6:
                    ql.ouputCust();
                    break;
                case 0:
                    return;
                case 7:
                    System.out.println("Enter id Customer: ");
                    sc.nextLine();
                    String ma = sc.nextLine();
                    ql.editCustomer(ma);
                    break;
                case 8:
                    ql.sort();
                    break;
                default:
                    System.out.println("Please re_enter");
            }
        }
    }
}
