/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi.De01;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class Product {

    public SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public Scanner sc = new Scanner(System.in);

    private String idSP;
    private String nameSP;
    private double price;
    private Date dateSX;
    private int quantily;

    public Product() {
    }

    public Product(String idSP, String nameSP, double price, Date dateSX) {
        this.idSP = idSP;
        this.nameSP = nameSP;
        this.price = price;
        this.dateSX = dateSX;
    }

    public Date getDateSX() {
        return dateSX;
    }

    public void setDateSX(Date dateSX) {
        this.dateSX = dateSX;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inputInFo() {
        System.out.println("ID product: ");
        idSP = sc.nextLine();

        System.out.println("Name product: ");
        nameSP = sc.nextLine();

        System.out.println("Price: ");
        price = sc.nextDouble();

        System.out.println("Date(dd/MM/yyyy): ");
        sc.nextLine();
        String date = sc.nextLine();
        try {
            dateSX = df.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
      
        
      return "Product{" + "idSP=" + idSP + ", nameSP=" + nameSP + ", price=" + price + ", dateSX=" + df.format(dateSX) + ", quantily= " + quantily + '}';
    }
    public void outputProduct(){
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Product{" + "idSP=" + idSP + ", nameSP=" + nameSP + ", price=" + currencyFormatter.format(price) + ", dateSX=" + df.format(dateSX) + ", quantily= " + quantily + '}');
    }
    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int soLuong) {
        this.quantily = soLuong;
    }

}
