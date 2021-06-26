/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.bai7_lap1;

/**
 *
 * @author Phương Lan
 */
public class hinhTron {

    private final float pi = 3.14f;
    private float banKinh;

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public float chuVi() {
        return 2 * this.banKinh * pi;
    }

    public float dienTich() {
        return 2 * this.banKinh * this.banKinh * pi;
    }

}
