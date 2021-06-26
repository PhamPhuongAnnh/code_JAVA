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
public class TestMyCircle {

    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(2,3, 5);
        MyPoint p = new MyPoint(6, 6);
        MyCircle c2 = new MyCircle(p, 8);

        System.out.println(c1.getCircumference());
        System.out.println(c1.getArea());
        System.out.println(c2.getCircumference());
        System.out.println(c2.getArea());
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}
