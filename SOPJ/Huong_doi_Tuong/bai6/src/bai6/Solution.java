package bai6;

import java.util.Scanner;

public class Solution {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //số lượng testcase
        int t = sc.nextInt();
        
        //số lượng phần tử mảng 1 chiều 
        int n;
        
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            
            //nhập mảng 1 chiều gồm n phần tử
            double[] a = new double[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextDouble();
            }
            
            //nhập chuỗi 1 2 
            sc.nextLine();
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            
            //số nguyên thứ k trong dãy fibonacci
            int k = sc.nextInt();
            
            // hiển thị 
            System.out.printf("Case #%d: \n",i+1);
            
            // Tổng các phần tử trong mảng
            System.out.printf("Sum: %.2f\n", Paractive.getSum(a));
            
            // Phần tử nhỏ nhất 
            System.out.printf("Min: %f\n", Paractive.getMin(a));
           
            //Phần tử lớn nhất
            System.out.printf("Max: %f\n", Paractive.getMax(a));

            // chuỗi str1 sau khi chuyển sang chữ in hoa
            System.out.println("To upper: " + Paractive.toUpper(str1));
           
            //chuỗi str2 sau khi chuyển sang chữ in thường
            System.out.println("To lower: " + Paractive.toLower(str2));
            
            // chuỗi str1 - str2 sau khi chuyển chữ cái đầu thành chữ in hoa
            //chuyển chuỗi 1 2 về chữ cái thường
            String str3 = Paractive.toLower(str1); 
            String str4 = Paractive.toLower(str2);
            // chuyển chữ cái đầu thành chữ cái in hoa
            System.out.println("To upper first char: " + Paractive.toUpperFirstChar(str3) + " - " + Paractive.toUpperFirstChar(str4));
            
            //phần tử fibonacci thứ k
            System.out.printf("Fibonacci(%d): %d\n",k,Paractive.getFibonacci(k));
        }

    }

}
