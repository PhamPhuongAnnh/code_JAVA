/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.bai7_lap2;

/**
 *
 * @author Phương Lan
 */
public class student {

    private String hoTen;
    private String tuoi;

    public student() {
    }

    public student(String hoTen, String tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if (hoTen == null || hoTen.isEmpty()) {
            this.hoTen = "khong hop le";
        } else {
            this.hoTen = hoTen;
        }
    }

    public String getTuoi() {
        if(tuoi.equals("-1")){
            return "khong hop le";
        }
        else{
           return tuoi;
        }
        
    }

    public void setTuoi(String tuoi) {
        if(Integer.parseInt(tuoi)<18){
            this.tuoi ="-1";
//            System.out.println("tuoi = "+Integer.parseInt(tuoi));
        }
        else {
            this.tuoi=tuoi;
        }
        
    }

    public void show() {
        System.out.println("ho va ten: " + getHoTen());
        System.out.println("tuoi: " + getTuoi());
    }
}
