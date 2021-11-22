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
public interface IDatabase<T> {
    void insert(T obj);
    void update(T obj);
}
