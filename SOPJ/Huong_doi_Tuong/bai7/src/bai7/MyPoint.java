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
public class MyPoint {

    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(double x1, double y1) {
        double kq = Math.sqrt(Math.pow((this.x - x1),2) + Math.pow((this.y- y1),2));
        return kq;
    }

    @Override
    public String toString() {
         String s1 = String.format("(%.2f, %.2f)", getX(), getY());
         return s1;
    }
    
    

}
