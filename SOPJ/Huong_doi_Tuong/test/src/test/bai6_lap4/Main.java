/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.bai6_lap4;

/**
 *
 * @author Phương Lan
 */
public class Main {
    static int getSum(int... arr){
        int s=0;
        for(int x: arr){
            s+= x;
        }
        return s;
    }
    static String ghepChuoi(String... a){
        String res = "";
        for(String x: a){
            res +=x+ " - ";
        }
        return res;
    }
    public static void main(String[] args) {
        String str = ghepChuoi("Nguyen Van Binh" , "At29" , "Thai Binh");
        System.out.println(str);
    }
}
