package buoi1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        Scanner sc = new Scanner(System.in);
//        sv.nhapThongTin();
        sv.Lop = sc.nextLine();
        sv.xuatTHongTIn();
        sv.xepLoai();
        System.out.println("Xep Loai: " + sv.XepLoai());
    }

}
