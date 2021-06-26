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
public class MyCircle {

    private MyPoint tam = new MyPoint();
    private double r;

    public MyCircle() {
        this.tam = new MyPoint();
        this.r = 0;
    }

    public MyCircle(double x, double y, double r) {
        this.tam.setX(x);
        this.tam.setY(y);
        this.r = r;
    }

    public MyCircle(MyPoint tam, double r) {
        this.tam = tam;
        this.r = r;
    }

    public MyPoint getTam() {
        return tam;
    }

    public void setTam(MyPoint tam) {
        this.tam = tam;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getCircumference() {
        double C = 2 * Math.PI * r;
        return C;
    }

    public double getArea() {
        return Math.PI * r * r;

    }

    @Override
    public String toString() {
        String s1 = String.format("Circle info:(%.2f, %.2f), radius = %.2f, circumference = %.3f, area = %.3f", getTam().getX(), getTam().getY(), getR(), getCircumference(), getArea());
        return s1;
    }

}
