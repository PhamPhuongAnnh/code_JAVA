/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoDan;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class KhachHang {
    String hoTenChuHo;
    int soNha; 
    String maSoCongTo;

    public KhachHang() {
    }

    public KhachHang(String hoTenChuHo, int soNha, String maSoCongTo) {
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }
    
    public void nhap(){
        System.out.println("Thong tin khach hang");
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ho ten chu ho: ");
        hoTenChuHo = sc.nextLine();
        System.out.println("So nha: ");
        soNha = sc.nextInt();
        System.out.println("Ma so cong to: ");
        sc.nextLine(); 
        maSoCongTo = sc.nextLine(); 
    }

    @Override
    public String toString() {
        return  ", hoTenChuHo=" + hoTenChuHo + ", soNha=" + soNha + ", maSoCongTo=" + maSoCongTo + '}';
    }
    
}
