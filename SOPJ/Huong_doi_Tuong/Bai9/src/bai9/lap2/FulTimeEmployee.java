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
public class FulTimeEmployee extends Employee {

    public FulTimeEmployee() {
    }

    public FulTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }

    @Override
    public void showInfo() {
    String srt = String.format("Name: %s, salary per day: %d",getName(), calculateSalary());
        System.out.println(srt);
    }

}
