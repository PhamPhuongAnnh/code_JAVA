/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH10.PhuongTien;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author phuon
 */
public class XeMay extends PTGT{
    private int congSuat; 

    public XeMay() {
    }

    public XeMay(int congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(int congSuat, int soMay, String hangSX, int namSX, double giaban) {
        super(soMay, hangSX, namSX, giaban);
        this.congSuat = congSuat;
    }
    
    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return  super.toString() + ", congSuat=" + congSuat + '}';
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Cong suat: ");
        Scanner sc = new Scanner(System.in); 
        congSuat = sc.nextInt();
    }
}
