/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtongamduong;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a,Sa=0, Sd=0;
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            do{
                a= sc.nextInt();
                if(a<0){
                    Sa +=a;
                }
                else{
                    Sd+=a;
                }
            }while(a!=0);
            System.out.printf("NegativeSum = %6d;     PositiveSum = %6d\n",Sa,Sd);
            Sa=0; Sd=0;
        }
    }
    
}
