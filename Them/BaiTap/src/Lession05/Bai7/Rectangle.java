/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession05.Bai7;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Rectangle {

    private int cd;
    private int cr;

    public Rectangle() {
    }

    public Rectangle(int cd, int cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    // nhập thông tin hình chữ nhật 
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài và chiều rộng: ");
        this.cd = sc.nextInt();
        this.cr = sc.nextInt();

    }
    
    // chu vi 
    public int chuvi(){
        return (this.cd + this.cr)*2;
    }
    // diện tích 
    public int dienTic(){
        return this.cd*this.cr;
    }
}
