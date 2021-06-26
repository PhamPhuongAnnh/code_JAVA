    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietkesonguyento;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class LietKeSoNguyenTo {
 /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

   
    public static void main(String[] args) {
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int i;
        boolean[] check = new boolean[5000001];
        for (i = 2; i <= b; i++) {
            check[i] = true;
        }
        for (i = 2; i <= b; i++) {
            if (check[i] == true) {
                for (int j = 2 * i; j <= b; j += i) {
                    check[j] = false;
                }
            }
        }
        for (i = a; i <= b; i++) {
            if (check[i] == true) {
                System.out.printf("%d\n", i);
            }
        }
    }


}
