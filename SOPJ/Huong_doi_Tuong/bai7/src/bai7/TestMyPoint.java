/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author Phương Lan
 */
public class TestMyPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(15, 20);

        MyPoint p2 = new MyPoint();
        p2.setX(2);
        p2.setY(3);

        MyPoint p3 = new MyPoint();
        p3.setXY(5, 6);
        System.out.println(p1.getDistance(10, 10));
        System.out.println(p2.getDistance(10, 10));
        System.out.println(p3.getDistance(10, 10));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }

}
