/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deso3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuon
 */
public class LopHoc {
    private List<SinhVien>  list = new ArrayList<>();
    private int siSo;
    private String TenLop;

    public LopHoc() {
    }

    public LopHoc(int siSo, String TenLop) {
        this.siSo = siSo;
        this.TenLop = TenLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public List<SinhVien> getList() {
        return list;
    }

    public void setList(List<SinhVien> list) {
        this.list = list;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }
    
}
