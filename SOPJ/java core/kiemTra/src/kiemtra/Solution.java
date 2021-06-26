/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (a < 0) {
//            System.out.printf("|a| = %d\n", -a);
//        } else {
//            System.out.printf("|a| = %d\n", a);
//        }
//        if (b < 0) {
//            System.out.printf("|b| = %d\n", -b);
//        } else {
//            System.out.printf("|b| = %d\n", b);
//        }
//        if (c < 0) {
//            System.out.printf("|c| = %d\n", -c);
//        } else {
//            System.out.printf("|c| = %d\n", c);
//        }

        //tim so lon nhat trong 3 so 
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int max = a;
//        if (max < b) {
//            max = b;
//        }
//        if (max < c) {
//            max = c;
//        }
//        System.out.printf("max{%d, %d, %d} = %d",a,b,c,max);
// sap xep thư tự tang dần
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        if (a > b) {
//            double tg = a;
//            a = b;
//            b = tg;
//        }
//        if (a > c) {
//            double tg = a;
//            a = c;
//            c = tg;
//        }
//        if (b > c) {
//            double tg = b;
//            b = c;
//            c = tg;
//        }
//        System.out.printf("%.2lf --> %.2lf --> %.2lf", a, b, c);
        // Thư teong tuan
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        switch (a) {
//            case 2:
//                System.out.println("Thu Hai");
//                break;
//            case 3:
//                System.out.println("Thu Ba");
//                break;
//            case 4:
//                System.out.println("Thu Tu");
//                break;
//            case 5:
//                System.out.println("Thu Nam");
//                break;
//            case 6:
//                System.out.println("Thu Sau");
//                break;
//            case 7:
//                System.out.println("Thu Bay");
//                break;
//            case 8:
//                System.out.println("Chu Nhat");
//                break;
//            default:
//                System.out.println("Khong hop le");
//
//        }
//        
//        // Giải Phương Trinh bac 1
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        if(a==0){
//        if(b==0){
//            System.out.println("Moi x la nghiem");
//        }
//        else{
//            System.out.println("Vo nghiem");
//        }
//        }
//        else {
//            System.out.printf("%.5f",-(b/a));
//        }
//        
        /// Giaai phuong trinh bac hai
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        double x1, x2;
//        if (a == 0) {
//            if (b == 0) {
//                if (c == 0) {
//                    System.out.println("Moi x la nghiem");
//                } else {
//                    System.out.println("Phuong trinh vo nghiem");
//                }
//            } else {
//                System.out.println("Phuong trinh co 1 nghiem don");
//                System.out.printf("x = %.5f", -(c / b));
//            }
//        } else {
//            double denta = b * b - 4 * a * c;
//            if (denta < 0) {
//                System.out.println("Phuong trinh vo nghiem");
//            } else if (denta == 0) {
//                x1 = (double) -b / (2 * a);
//                System.out.println("Phuong trinh co nghiem kep");
//                System.out.printf("x1 = x2 = %.5f", x1);
//            } else {
//                x2 = (double) (-b + Math.sqrt(denta)) / (2 * a);
//                x1 = (double) (-b - Math.sqrt(denta)) / (2 * a);
//                System.out.println("Phuong trinh co 2 nghiem phan biet");
//                System.out.printf("x1 = %.5f\n", x1);
//                System.out.printf("x2 = %.5f\n", x2);
//            }
//        }
        // hệ phương trình
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double e = sc.nextDouble();
//        double c = sc.nextDouble();
//        double d = sc.nextDouble();
//        double f = sc.nextDouble();
//        double D, Dx, Dy, x, y;
//        D = a * d - c * b;
//        Dx = e * d - f * b;
//        Dy = a * f - c * e;
//        if (D == 0) {
//            if (Dx + Dy == 0) {
//                System.out.println("He phuong trinh co vo so nghiem");
//
//            } else {
//                System.out.println("He phuong trinh vo nghiem");
//
//            }
//        } else {
//            x = Dx / D;
//            y = Dy / D;
//            System.out.printf("He phuong trinh co nghiem duy nhat\n");
//            System.out.printf("x = %.5f\n", x);
//            System.out.printf("y = %.5f\n", y);
//        }
        // kiem tra tam giac vuong 
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        if (a + b <= c || a + c <= b || b + c <= a) {
//            System.out.printf("Khong");
//        } else {
//            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
//                System.out.printf("Co");
//            } else {
//                System.out.printf("Khong");
//            }
//        }
        //Kiem tra 3 canh cua tam gia
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        if (a + b <= c || a + c <= b || b + c <= a) {
//            System.out.printf("%.2f, %.2f, %.2f khong the la 3 canh cua tam giac", a, b, c);
//        } else {
//            System.out.printf("%.2f, %.2f, %.2f co the la 3 canh cua tam giac", a, b, c);
//        }
        // xac dinh loai tam gia
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.printf("(%0.5f, %0.5f, %0.5f) khong phia la tam giac", a, b, c);
        } else {
            if (a == b && b == c && a == c) {
                System.out.printf("(%0.5f, %0.5f, %0.5f) la tam giac deu", a, b, c);
            } else if (a == b || b == c || a == c) {
                System.out.printf("(%0.5f, %0.5f, %0.5f) la tam giac can", a, b, c);
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.printf("(%0.5f, %0.5f, %0.5f) la tam giac vuong", a, b, c);
            } else {
                System.out.printf("(%0.5f, %0.5f, %0.5f) la tam giac thuong", a, b, c);
            }
        }
    }
}
