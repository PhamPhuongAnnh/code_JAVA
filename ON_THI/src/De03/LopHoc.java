/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De03;

import java.util.List;

/**
 *
 * @author phuon
 */
public class LopHoc {
    private int siSo; 
    private String tenLop; 
    private List<SinhVien> listSV; 

    public LopHoc() {
    }

    public LopHoc(int siSo, String tenLop, List<SinhVien> listSV) {
        this.siSo = siSo;
        this.tenLop = tenLop;
        this.listSV = listSV;
    }

    public List<SinhVien> getListSV() {
        return listSV;
    }

    public void setListSV(List<SinhVien> listSV) {
        this.listSV = listSV;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "siSo=" + siSo + ", tenLop=" + tenLop + ", listSV=" + listSV + '}';
    }
    
    
}
