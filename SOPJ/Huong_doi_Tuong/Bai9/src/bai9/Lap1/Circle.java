/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9.Lap1;

/**
 *
 * @author Phương Lan
 */
public class Circle implements IShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public void show() {
        String str = String.format("Circle(r = %f): perimeter = %.3f, area = %.3f", getRadius(), getPerimeter(), getArea());
        System.out.println(str);
    }

}
