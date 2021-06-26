/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9.lap2;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Lab02_Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t, m, n, p, q, i, j;
        t = sc.nextInt();
        for (i = 0; i < t; i++) {
            m = sc.nextInt();
            n = sc.nextInt();
            
            p = sc.nextInt();
            q = sc.nextInt();
            
            FulTimeEmployee[] fullTime = new FulTimeEmployee[m];
            for (j = 0; j < m; j++) {
                fullTime[j] = new FulTimeEmployee();
                sc.nextLine();
                fullTime[j].setName(sc.nextLine());
                fullTime[j].setPaymentPerHour(sc.nextInt());
            }
            
            PartTimeEmployee[] partTime = new PartTimeEmployee[n];
            for (j = 0; j < n; j++) {
                partTime[j]= new PartTimeEmployee();
                sc.nextLine();
                partTime[j].setName(sc.nextLine());
                partTime[j].setPaymentPerHour(sc.nextInt());
                partTime[j].setWorkingHours(sc.nextInt());
            }
            
            int[] htful = new int[p];
            for(j=0; j<p; j++){
                htful[j] = sc.nextInt();
            }
            
            int[] htpar = new int[q];
            for(j=0; j<q; j++){
                htpar[j] = sc.nextInt();
            }
            
            
            System.out.printf("Case #%d:\n",i+1);
           
            for(j = 0; j<p; j++){
                System.out.println("Full time employee:");
                fullTime[htful[j]].showInfo();
            }
            
            for(j=0; j<q; j++){
                System.out.println("Part time employee:");
                partTime[htpar[j]].showInfo();
            }
            
           
        }
    }
}
