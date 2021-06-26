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
public class PartTimeEmployee extends Employee {

    private int workingHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int workingHours) {
        this.workingHours = workingHours;
    }

    public PartTimeEmployee(int workingHours, String name, int paymentPerHour) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * getWorkingHours();
    }

    @Override
    public void showInfo() {
        String srt = String.format("Name: %s, salary per day: %d", getName(), calculateSalary());
        System.out.println(srt);
    }

}
