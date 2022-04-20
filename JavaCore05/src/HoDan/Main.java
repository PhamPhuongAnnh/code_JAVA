/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoDan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        List<BienLai> listBienLai = new ArrayList<>(); 
        
        for(int i=0; i<n; i++){
             BienLai bl = new BienLai();
             bl.nhap();
             listBienLai.add(bl); 
        }
        
        for(BienLai x: listBienLai){
            System.out.println(x.toString());
        }
        
        
  
    }

}
