/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_12;

/**
 *
 * @author Phương Lan
 */
public class lap1 {
    static void sun(){
        long s =0;
        for(int i =0; i<1000; i++){
            s+=i;
        }
    }
    static void run(int n){
        int i;
        for(i =0; i<n; i++){
            sun();
        }
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        run(10000);
        long finish = System.currentTimeMillis();
        System.out.println("Time: "+(finish - start));
    }
}
