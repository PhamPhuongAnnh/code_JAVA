/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phantichthuasonguyento;
import java.util.Scanner;

class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int dem;
            System.out.printf("%5d = ", n);
            if (n == 1) {
                System.out.printf("%d", n);
            } else {
                for (int i = 2; i <= n; i++) {
                    dem = 0;
                    while (n % i == 0) {
                        dem++;
                        n = n / i;
                    }
                    if (dem >= 1) {
                        if (dem > 1) {
                            for (int j = 1; j <= dem; j++) {
                                System.out.printf("%d", i);
                                if (j < dem) {
                                    System.out.printf(" x ");
                                } else if (j <dem) {
                                    System.out.printf("%d", i);
                                }
                                else {
                                    break;
                                }
                            }
                        } else {
                            System.out.printf("%d", i);
                        }
                        if (n >= i) {
                            System.out.printf(" x ");
                        }
                    }

                }
                System.out.println("");
            }
        }

    }
}
