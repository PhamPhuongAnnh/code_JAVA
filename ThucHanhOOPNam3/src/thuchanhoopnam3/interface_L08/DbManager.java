/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.interface_L08;

/**
 *
 * @author phuon
 */
public class DbManager {

    public static void main(String[] args) {
        DbAction db1 = new Product();
        DbAction db2 = new Order();
        db1.insert();
        db2.insert();

    }
}
