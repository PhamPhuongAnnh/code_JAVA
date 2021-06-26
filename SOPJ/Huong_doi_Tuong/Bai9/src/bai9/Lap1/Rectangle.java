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
public class Rectangle implements IShape {

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return getLength()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public void show() {
        String str = String.format("Rectangle(%f, %f): perimeter = %.3f, area = %.3f", getLength(), getWidth(), getPerimeter(), getArea());
        System.out.println(str);
    }

}
