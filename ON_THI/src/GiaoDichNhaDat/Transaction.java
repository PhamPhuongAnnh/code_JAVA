/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDichNhaDat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class Transaction {
    private String ID; 
    private Date date; 
    private double pince; 

    public Transaction(String ID, Date date, double pince) {
        this.ID = ID;
        this.date = date;
        this.pince = pince;
    }

    public Transaction() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPince() {
        return pince;
    }

    public void setPince(double pince) {
        this.pince = pince;
    }
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    public void input(){
        System.out.println("ID: ");
        Scanner sc = new Scanner(System.in); 
        ID = sc.nextLine();
        System.out.println("Date: ");
        String date1 = sc.nextLine(); 
        try { 
            date = df.parse(date1);
        } catch (ParseException ex) {
            System.out.println("date input error");
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Pince: ");
        pince = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Transaction{" + "ID=" + ID + ", date=" + date + ", pince=" + pince + " ";
    }

    public DateFormat getDf() {
        return df;
    }

    public void setDf(DateFormat df) {
        this.df = df;
    }
    
}
