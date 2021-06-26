/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.bai6_lap1;

/**
 *
 * @author Phương Lan
 */
public class Main {
    static void m(int x){
        x+=5;
       
    }
    static void m(int[] x){
        x[0] +=5;
        
    }
    public static void main(String[] args) {
        int x = 3;
        int[] a = {1,2,3};
        m(x);
        m(a);
        System.out.println(x);
        System.out.println(a[0]);
        
    }
}
