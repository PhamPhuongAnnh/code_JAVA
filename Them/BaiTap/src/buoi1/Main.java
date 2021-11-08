package buoi1;

import java.util.Scanner;

public class Main {

    //1. giải phương trình bậc 2 nhập 3 số nguyên từ bàn phím và xuất ra nghiệm của ptrinhf bậc 2 
    // 2. nhập vào 3 cạnh của tam giác là số nguyên kiểm tra xem có phải là tam giác không 
    // nhập vào 1 số kiểm tra xem nó có là số chính phương không 
    public static void giaiPhuongTrinhBac2(int a, int b, int c) {
        double x1, x2;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Voi Moi x la nghiem");
                } else {
                    System.out.println("vo nghiem");
                }
            } else {
                System.out.println(" co 1 nghiem");
                System.out.println("x = " + -(c / b));
            }
        } else {
            double denta = b * b - 4 * a * c;
            if (denta < 0) {
                System.out.println("vo nghiem");
            } else if (denta == 0) {
                x1 = (double) -b / (2 * a);
                System.out.println("nghiem kep");
                System.out.println("x1 = x2 = " + x1);
            } else {
                x2 = (double) (-b + Math.sqrt(denta)) / (2 * a);
                x1 = (double) (-b - Math.sqrt(denta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                System.out.println("x1 = " + x1);
                System.out.println("\nx2 = " + x2);
            }
        }
    }

    public static void LoaiTamGiac(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.printf("Day khong phia la tam giac");
        } else {
            if (a == b && b == c && a == c) {
                System.out.println("day là tam giác và  la tam giac deu");
            } else if (a == b && b!=c  || b == c && c!=a || a == c&& c!=b) {
                System.out.println("day la tam giac và la tam giac can");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("day la tam giac và la tam giac vuong");
            } else {
                System.out.println("day la tam giac và la tam giac thuong");
            }
        }
    }

    // nhập vào số nguyên kiểm tra xem nó có là số chính phương hay không 
    public boolean kiemTraSoChinhPhuong(int n){
        if(Math.sqrt(n) * Math.sqrt(n) == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void SoChinhPhuong(int n) {
        
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println("Nhiệm của phương trình là: ");
//        giaiPhuongTrinhBac2(a, b, c);
//        System.out.println("__________________________________");
//        System.out.println("\nLoại của tam giác là: ");
//        LoaiTamGiac(a, b, c);
            
//          SinhVien sv = new SinhVien();
//          sv.nhap();


    }

}
