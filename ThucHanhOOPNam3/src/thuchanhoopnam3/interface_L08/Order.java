/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.interface_L08;

/**
 *
 * @author phuon
 */
public class Order  implements DbAction{
    
    @Override
    public void insert() {
        System.out.println("Insert Order");
    }

    @Override
    public void update() {
        System.out.println("Update Order");
    }

    @Override
    public void delete() {
        System.out.println("delete Order");
    }

    @Override
    public void select() {
        System.out.println("select Order");
    }
}
