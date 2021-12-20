/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi.De01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import thuchanhoopnam3.TH3.B3.KhachHang;

/**
 *
 * @author phuon
 */
public class Manage {

    List<Product> listProduct = new ArrayList<>();
    List<Customer> listCustomer = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void inputListProduct() {
        Product product = new Product();
        product.inputInFo();
        System.out.println("Quantily: ");
        int soLuong = sc.nextInt();
        if (listProduct.size() == 0) {
            product.setQuantily(soLuong);
            listProduct.add(product);
        } else {
            int flag = 0;
            for (Product item : listProduct) {
                if (item.getIdSP().equals(product.getIdSP())) {
                    int S = item.getQuantily() + soLuong;
                    item.setQuantily(S);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                product.setQuantily(soLuong);
                listProduct.add(product);
            }
        }
        while (true) {
            System.out.println("1. Continue");
            System.out.println("0. Stop");
            int check = sc.nextInt();
            if (check == 1) {
                Product product1 = new Product();
                product1.inputInFo();
                System.out.println("Quantily: ");
                int soLuong1 = sc.nextInt();

                int flag = 0;
                for (Product item : listProduct) {
                    if (item.getIdSP().equals(product1.getIdSP())) {
                        int S = item.getQuantily() + soLuong1;
                        item.setQuantily(S);
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    product1.setQuantily(soLuong1);
                    listProduct.add(product1);
                }
            } else if (check == 0) {
                break;
            } else {
                System.out.println("Please re-enter");
            }
        }
    }

    public void inputCustomer() {
        Customer customer = new Customer();
        customer.inputPerson();
        listCustomer.add(customer);
    }
    public SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public void editProduct(String id) {
        for (Product item : listProduct) {
            if (item.getIdSP().equals(id)) {
                while (true) {
                    System.out.println("What information do you want to edit: ");
                    System.out.println("1. Name");
                    System.out.println("2. Price");
                    System.out.println("3. Date");
                    System.out.println("4. Quantily");
                    System.out.println("0. I dont' want");
                    int check = sc.nextInt();
                    if (check == 1) {
                        System.out.println("Name: ");
                        sc.nextLine();
                        item.setNameSP(sc.nextLine());
                    } else if (check == 2) {
                        System.out.println("Price: ");
                        item.setPrice(sc.nextDouble());
                    } else if (check == 3) {
                        System.out.println("Date: ");
                        sc.nextLine();
                        String date = sc.nextLine();
                        try {
                            Date date1 = df.parse(date);
                            item.setDateSX(date1);
                        } catch (ParseException ex) {
                            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else if (check == 4) {
                        System.out.println("Qantily: ");
                        item.setQuantily(sc.nextInt());
                    } else if (check == 0) {
                        break;
                    } else {
                        System.out.println("Please re_enter");
                    }
                }
            }
        }
    }

    public void ouputProduct() {
        for (Product item : listProduct) {
            item.outputProduct();
        }
    }

    public double buyProduct(String idKH, String id, int soLuong) {
        int flag = 0, flag2 = 0;
        for (Customer item : listCustomer) {
            if (item.getIdKH().equals(idKH)) {
                flag = 1;
                break;
            }
        }
        for(Product item : listProduct){
            if (item.getIdSP().equals(id)) {
                flag2 = 1;
                break;
            }
        }
        if(flag2 == 0){
            System.out.println("No product found");
        }
        double money = 0;
        if (flag == 1) {
            for (Product item : listProduct) {
                if (item.getIdSP().equals(id)) {
                    if (item.getQuantily() < soLuong) {
                        System.out.println("Quantity is not enough to use");
                    } else {
                        int soLuongSau = item.getQuantily() - soLuong;
                        money += item.getPrice() * soLuong;
                        item.setQuantily(soLuongSau);
                    }
                }
            }
        } else {
            System.out.println("No customers found");
        }
        
        
        return money;

    }
    
    public  void ouputCust(){
        double max = 0;
        for (Customer item : listCustomer) {
            if (item.getMoney()>max) {
                max = item.getMoney();
                break;
            }
        }
        for (Customer item : listCustomer) {
            if (item.getMoney() == max) {
                System.out.println(item.toString());
                break;
            }
        }
    }
}
