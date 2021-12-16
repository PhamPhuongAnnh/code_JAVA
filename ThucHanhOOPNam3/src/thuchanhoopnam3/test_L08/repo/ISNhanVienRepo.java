/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package thuchanhoopnam3.test_L08.repo;

import java.util.List;
import thuchanhoopnam3.TH5.B1.NhanSu;
import thuchanhoopnam3.test_L08.Model.NhanVien;

/**
 *
 * @author phuon
 */
public interface ISNhanVienRepo {
    public boolean insert(NhanVien nv);
    public List<NhanVien> select();
}
