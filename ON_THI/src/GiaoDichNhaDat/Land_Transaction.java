/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDichNhaDat;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Land_Transaction extends Transaction{
    private char type; 
    private double S; 

    public Land_Transaction() {
    }

    public Land_Transaction(char type, double S, String ID, Date date, double pince) {
        super(ID, date, pince);
        this.type = type;
        this.S = S;
    }

    public Land_Transaction(char type, double S) {
        this.type = type;
        this.S = S;
    }

    

    public double getS() {
        return S;
    }

    public void setS(double S) {
        this.S = S;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "type=" + type + ", S=" + S + '}';
    }
    
    @Override
    public void input(){
        super.input();
        System.out.println("Type land: ");
        Scanner sc = new Scanner(System.in); 
        
        do{
           type = sc.next().charAt(0);
           if(type != 'A' ||type != 'B' || type != 'C'){
               System.out.println("Input Error: ex: A or B or C");
           }
        }while(type != 'A' ||type != 'B' || type != 'C');
    }
}
