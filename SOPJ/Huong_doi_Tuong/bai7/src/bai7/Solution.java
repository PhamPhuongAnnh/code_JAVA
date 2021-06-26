/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author Phương Lan
 */
public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //input
        int t = sc.nextInt();

        for (int l = 0; l < t; l++) {
            int n = sc.nextInt();

            MyPoint[] point = new MyPoint[n];
            
            for (int ii = 0; ii < n; ii++) {
                point[ii] = new MyPoint();
                point[ii].setX(sc.nextDouble());
                point[ii].setY(sc.nextDouble());
            }

            int k = sc.nextInt();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();

            int p = sc.nextInt();

            int m = sc.nextInt();
            MyCircle[] circle = new MyCircle[m];

            for (int j = 0; j < m; j++) {
                circle[j] = new MyCircle();
//                MyPoint p1 = new MyPoint(sc.nextDouble(), sc.nextDouble());
                circle[j].setTam(new MyPoint(sc.nextDouble(), sc.nextDouble()));
            }

            for (int j = 0; j < m; j++) {
                circle[j].setR(sc.nextDouble());
            }

            int q = sc.nextInt();

            int i = sc.nextInt();
            int j = sc.nextInt();

            //output
            System.out.printf("Case #%d:\n", l+1);
            System.out.printf("distance = %.3f\n", point[k].getDistance(x1, y1));
            System.out.println(point[p].toString());
            System.out.println(circle[q].toString());
            
           
            double kc = circle[i].getTam().getDistance(circle[j].getTam().getX(), circle[j].getTam().getY());
            double ri = circle[i].getR();
            double rj = circle[j].getR();
            if ((kc > ri + rj) || (kc < ri - rj && ri > rj)) {
                System.out.printf("Circle %d does not intersect Circle %d\n", i, j);
            } else if (kc < rj - ri && rj > ri) {
                System.out.printf("Circle %d is inside Circle %d\n", i, j);
            } else {
                System.out.printf("Circle %d intersects with Circle %d\n", i, j);
            }

        }

    }
}
