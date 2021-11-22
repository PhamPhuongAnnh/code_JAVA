/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9.lap2;

/**
 *
 * @author Phương Lan
 */
public abstract class Employee implements IEmployee, IShow{
    private String name;
    private int paymentPerHour;

    public Employee() {
    }

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public  String getName(){
        return name;
    }
    @Override
    public abstract int calculateSalary();

    @Override
    public abstract void showInfo();
}
