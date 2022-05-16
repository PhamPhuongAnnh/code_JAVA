/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore05.btvn.chuong6;

/**
 *
 * @author LAPTOP
 */
public class Practice {

    public static final double getSum(double... x) {
        double sum = 0;
        for (double a : x) {
            sum += a;
        }
        return sum;
    }

    public static final double getMin(double... x) {
        double min = x[0];
        for (double a : x) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static final double getMax(double... x) {
        double max = x[0];
        for (double a : x) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        char c;
        String toUpper = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                c = (char) (str.charAt(i) - 32);
                toUpper += c;
            } else {
                toUpper += str.charAt(i);
            }
        }
        return toUpper;
    }

    public static String toLower(String str) {
        char c;
        String toLower = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                c = (char) (str.charAt(i) + 32);
                toLower += c;
            } else {
                toLower += str.charAt(i);
            }
        }
        return toLower;
    }

    public static String toFirstChar(String str) {
        char c;
        String str_lower = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                c = (char) (str.charAt(i) + 32);
                str_lower += c;
            } else {
                str_lower += str.charAt(i);
            }
        }
        char firstChar;
        char upperFirstChar;
        String result;
        String[] words = str_lower.split(" ");
        for (int i = 0; i < words.length; i++) {
            firstChar = (char) words[i].charAt(0);
            upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
            words[i] = upperFirstChar + words[i].substring(1);
        }
        result = String.join(" ", words);
        return result;
    }

    public static long getFibonacci(int position) {
        if (position < 3) {
            return 1;
        } else {
            return getFibonacci(position - 1) + getFibonacci(position - 2);
        }
    }
}
