/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH7.B1;

/**
 *
 * @author phuon
 */
public class main {
    public static void main(String[] args) {
        DaySo ds1= new DaySo();
        ds1.nhapDaySo();
        ds1.inDaySo();
        ds1.inSoNguyenTo();
        ds1.inSoHoanHao();
        ds1.sapXepTang();
        System.out.println("");
        ds1.sapXepGiam();
        System.out.println("");
        DaySo ds2= new DaySo();
        System.out.println("");
        ds2.nhapDaySo();
        ds2.inDaySo();
        System.out.println("");
        DaySo ds3 = ds1.congDay(ds2);
        ds3.inDaySo();
        
        
    }
}
