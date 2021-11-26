package com.team.ui;

import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.SanPhamCuaHang;

import javax.swing.*;
import java.util.List;

import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.ListKhachHang;
import com.team.logic.SanPhamKhachHang;

public interface ActionClick {

    int getRole();
    void actionClick();
    void comeBack();
    void goBacktoLogin();
    void goBacktoPhienCH();
    void goToPhienCH();
    void acctionShowSP();
    void addSp();
    void toDangKy();
    void toDangNhap();
    void backToDangKy();
    void toKhachHangDK();
    void toCuaHangDK();
    void addListKhachHang(KhachHang khachHang);
    void addListCuaHang(CuaHang cuaHang);
    void passDataCHToPanel(CuaHang cuaHang);
    void passDataKHToPanel(KhachHang khachHang);
    void setUserNameCH(String username, String shopname);
    void setUserNameKH(String name);
    void saveDataCH(CuaHang cuaHang);
    void passListSPCHToPanelList(List<SanPhamCuaHang> list);
    void passListSPCHToPanelPhienCH(List<SanPhamCuaHang> list);
    List<CuaHang> getListCH();
    List<KhachHang> getListKH();
    DefaultListModel<SanPhamCuaHang> getModel_SpCH();
    void fromGioHang();
    void fromLichSu();
    void fromPhienLamViec();
    void toGioHang();
    void toLichSu();
    DefaultListModel<SanPhamKhachHang> model_SanPhamKhachHang();
    void showAllGioHang();
    void showAllLichSu();
    void toDanhSachSanPham();
    void fromDanhSachSanPham();
    void showAllDanhSachSanPham();

}
