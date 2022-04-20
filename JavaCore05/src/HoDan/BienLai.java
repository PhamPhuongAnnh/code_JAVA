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
public class BienLai {
    KhachHang kh = new KhachHang(); 
    int chiSoMoi; 
    int chiSoCu; 

    public BienLai() {
    }

    public BienLai(int chiSoMoi, int chiSoCu) {
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
    }
     public void nhap(){
         Scanner sc = new Scanner(System.in); 
         System.out.println("Nhap thong tin bien lai: ");
         kh.nhap();
         System.out.println("Chi so cu: ");
         chiSoCu = sc.nextInt();
         System.out.println("Chi so moi: ");
         chiSoMoi = sc.nextInt();   
         
     }
     public double tongTien(){
       return (chiSoMoi - chiSoCu) *850000;   
     }
    @Override
    public String toString() {
        return "BienLai{" + "kh=" + kh + ", chiSoMoi=" + chiSoMoi + ", chiSoCu=" + chiSoCu + ", tongTien=" + tongTien() + '}';
    }
     
     
}
