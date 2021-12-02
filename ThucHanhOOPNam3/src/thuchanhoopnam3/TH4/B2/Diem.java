/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.TH4.B2;

/**
 *
 * @author phuon
 */
public class Diem {
    private double x;
    private double y;

    public Diem() {
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void inTTDiem(){
        System.out.println("(x;y) = ("+getX()+";"+getY()+")");
    }
    
    public double KhoangCach(Diem d){
        double kc = 0;
        kc = (this.x-d.x)*(this.x-d.x)+(this.y-d.y)*(this.y-d.y);
        return Math.sqrt(kc);
    }
}
