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
public class key_value <K,V> {
   K key;
   V value;

    public key_value() {
    }

    public key_value(K key, V value) {
        this.key = key;
        this.value = value;
    }
   
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
   
}
