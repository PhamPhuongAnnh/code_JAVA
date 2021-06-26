/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

/**
 *
 * @author Phương Lan
 */
public class Paractive {

    public static final double getSum(double... arr) {
        double s = 0;
        for (double x : arr) {
            s += x;
        }
        return s;
    }
    
    public static final double getMin(double ... a){
        double min = a[0];
        for(double x: a){
            if(x<min){
               min = x;
            }
        }
        return min;
    }
    
    public static final double getMax(double ... a){
        double max = a[0];
        for(double x: a){
            if(x>max){
               max = x;
            }
        }
        return max;
    }
    public static String toUpper(String str){
        char c;
        String s = "";
        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            if(c<=122 &&c >=97){
                c -= 32;
            }
            s +=c;
        }
        return s;
    }
    
    public static String toLower(String str){
        char c;
        String s = "";
        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            if(c<=90 &&c >=65){
                c += 32;
            }
            s +=c;
        }
        return s;
    }
    public static String toUpperFirstChar(String str){
        String[] words = str.split(" ");
        for(int i=0; i<words.length; i++){
            char firstChar = words[i].charAt(0);
            char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
            words[i] = upperFirstChar+ words[i].substring(1);
        }
       
        String result = String.join(" ", words);
        return result;
    }
    
    public static long getFibonacci(int position){
        if(position == 0){
            return 0;
        }
        if(position == 1){
            return 1;
        }
        else {
            long res = getFibonacci(position -1) + getFibonacci(position -2);
            return res;
        }
    }
}
