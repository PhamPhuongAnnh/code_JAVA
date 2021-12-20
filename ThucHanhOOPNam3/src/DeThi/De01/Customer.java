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
public class Customer {

    private String idKH;
    private String nameKH;
    private int birthYear;
    private String address;
    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Customer() {
    }

    public Customer(String idKH, String nameKH, int birthYear, String address) {
        this.idKH = idKH;
        this.nameKH = nameKH;
        this.birthYear = birthYear;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public String getNameKH() {
        return nameKH;
    }

    public void setNameKH(String nameKH) {
        this.nameKH = nameKH;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "idKH=" + idKH + ", nameKH=" + nameKH + ", birthYear=" + birthYear + ", address=" + address + ", Money: " +money+ '}';
    }

    public void inputPerson() {
        System.out.println("ID Preson: ");
        Scanner sc = new Scanner(System.in);
        idKH = sc.nextLine();

        System.out.println("Name preson: ");
        nameKH = sc.nextLine();

        System.out.println("Birth year: ");
        birthYear = sc.nextInt();

        System.out.println("Address: ");
        sc.nextLine();
        address = sc.nextLine();

    }
}
