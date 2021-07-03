/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13_2;


/**
 *
 * @author phuon
 */
public class DatabaseIkpl<T> implements IDatabase<T>{

    @Override
    public void insert(T obj) {
        System.out.println("Them gia tri "+ obj +" vao database");
        
    }

    @Override
    public void update(T obj) {
        System.out.println("Giu thong tin cua "+obj);
    }
    
    
}
