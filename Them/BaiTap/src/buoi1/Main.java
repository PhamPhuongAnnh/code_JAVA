package buoi1;

import java.util.Scanner;

public class Main {
    
    static void tinhTong(int a, int b){
        System.out.println("a + b = "+(a+b));
    }
    
   
    static int tinhTong1(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // hàm để nhập 
        System.out.println("4+5+6 = "+tinhTong1(tinhTong1(4, 5), 6));
//        System.out.println("a + b = "+ tinhTong1(a, b));
//        float b = sc.nextFloat();
//        
        // for while do while 
        // if else 
//        for(int i =0; i<5; i= i+2){
//            System.out.println("PA");
//        }

// sự khác nhau giữa while và do while 
//        int i = 0;
//        while (i <0) {
//            System.out.println("Trang");
//        }
//        
//        do {
//            System.out.println("PA");// thực hiện cái khối lệnh ít nhất 1 lần 
//        } while (i < 0);

    

    }

}
