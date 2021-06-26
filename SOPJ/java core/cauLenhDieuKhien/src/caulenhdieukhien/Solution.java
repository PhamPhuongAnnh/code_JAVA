/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caulenhdieukhien;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public  class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diemTb = sc.nextDouble();
     
        if( diemTb <4.0){
            System.out.println("Ban chua dat");
            
        }
        else if( diemTb <= 6.9){
            System.out.println("Ban da dat");
        }
        
        else if( diemTb <= 7.9){
            System.out.println("Ban dat học bong kha");
        }
        else{
            System.out.println("Ban dat hoc bong gioi");
        }
         
    }
    
}
