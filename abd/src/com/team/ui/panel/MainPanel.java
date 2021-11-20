package com.team.ui.panel;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.ListCuaHang;
import com.team.logic.ListKhachHang;

import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.SanPhamCuaHang;
import com.team.logic.SanPhamKhachHang;
import com.team.ui.ActionClick;

public class MainPanel extends BasePanel implements ActionClick {

    private ListKhachHang listKhachHang;
    private ListCuaHang listCuaHang;
    private PanelStartApp panelStartApp;
    private PanelDangKy panelDangKy;
    private PanelKhachHangDK panelKhachHangDK;
    private PanelCuaHangDK panelCuaHangDK;
    private PanelDangNhap panelDangNhap;
    private PanelPhienCH panelPhienCH;
    private PanelListSP panelListSP;
    private PanelAddSp panelAddSp;
    private PanelGioHang panelGioHang;
    private PanelPhienLamViecCuaKhachHang panelLamViecKhachHang;
    private PanelLichSu panelLichSu;
    private PanelDSSPKhachHang panelDSSPKhachHang;

    public MainPanel() {
        listCuaHang = new ListCuaHang();
        listKhachHang = new ListKhachHang();
    }

    @Override
    public void initUI() {
        setBackground(Color.WHITE);
        setLayout(new CardLayout());
    }

    @Override
    public void addEvent() {

    }

    @Override
    public void addComp() {
       
        panelStartApp = new PanelStartApp();
        panelStartApp.setAck(this);
        add(panelStartApp);

        panelDangKy = new PanelDangKy();
        panelDangKy.setAck(this);
        add(panelDangKy);

        panelKhachHangDK = new PanelKhachHangDK();
        panelKhachHangDK.setAck(this);
        add(panelKhachHangDK);

        panelCuaHangDK = new PanelCuaHangDK();
        panelCuaHangDK.setAck(this);
        add(panelCuaHangDK);

        panelDangNhap = new PanelDangNhap();
        panelDangNhap.setActionClick(this);
        add(panelDangNhap);

        panelPhienCH = new PanelPhienCH();
        panelPhienCH.setActionClick_ListSP(this);
        add(panelPhienCH);

        panelListSP = new PanelListSP();
        panelListSP.setActionClick(this);
        add(panelListSP);

        panelAddSp = new PanelAddSp();
        panelAddSp.setActionClick(this);
        add(panelAddSp);
        
         panelLamViecKhachHang = new PanelPhienLamViecCuaKhachHang();
        panelLamViecKhachHang.setAck(this);
        add(panelLamViecKhachHang);
        
        panelGioHang = new PanelGioHang();
        panelGioHang.setAck(this);
        add(panelGioHang);
        
        panelDSSPKhachHang = new PanelDSSPKhachHang();
        panelDSSPKhachHang.setAc(this);
        add(panelDSSPKhachHang);
        
        panelLichSu = new PanelLichSu();
        panelLichSu.setAck(this);
        add(panelLichSu);

    }

    @Override
    public void actionClick() {
        panelPhienCH.setVisible(true);
        panelDangNhap.setVisible(false);
    }

    @Override
    public void goBacktoPhienCH() {
        panelPhienCH.setVisible(true);
        panelListSP.setVisible(false);
    }

    @Override
    public void acctionShowSP() {
        panelListSP.setModel_sp(panelAddSp.getModel_SpCH());
        panelListSP.addList(panelAddSp.getModel_SpCH().getElementAt(panelAddSp.getModel_SpCH().getSize() - 1));
        panelListSP.setVisible(true);
        panelPhienCH.setVisible(false);
        panelAddSp.setVisible(false);
    }

    @Override
    public void addSp() {
        panelAddSp.setModel_SpCH(panelListSP.getModel_sp());
        panelListSP.setVisible(false);
        panelAddSp.setVisible(true);
    }

    @Override
    public DefaultListModel<SanPhamCuaHang> getModel_SpCH() {
        return panelAddSp.getModel_SpCH();
    }

    @Override
    public void goBacktoLogin() {
        panelDangNhap.setVisible(true);
        panelPhienCH.setVisible(false);
    }

    @Override
    public void toDangKy() {
        panelStartApp.setVisible(false);
        panelDangKy.setVisible(true);
    }

    @Override
    public void toDangNhap() {
        panelStartApp.setVisible(false);
        panelDangNhap.setVisible(true);
    }

    @Override
    public void comeBack() {
        panelPhienCH.setVisible(false);
        panelDangNhap.setVisible(false);
        panelCuaHangDK.setVisible(false);
        panelKhachHangDK.setVisible(false);
        panelDangKy.setVisible(false);
        panelStartApp.setVisible(true);
    }

    @Override
    public void backToDangKy() {
        panelCuaHangDK.setVisible(false);
        panelKhachHangDK.setVisible(false);
        panelDangKy.setVisible(true);
    }

    @Override
    public void toKhachHangDK() {
        panelKhachHangDK.setVisible(true);
        panelDangKy.setVisible(false);
    }

    @Override
    public void addListKhachHang(KhachHang khachHang) {
        this.listKhachHang.addKhachHang(khachHang);
        try {
            listKhachHang.writeDataToFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void toCuaHangDK() {
        panelCuaHangDK.setVisible(true);
        panelDangKy.setVisible(false);
    }

    @Override
    public void addListCuaHang(CuaHang cuaHang) {
        this.listCuaHang.addCuaHang(cuaHang);
        try {
            listCuaHang.writeDataToFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public List<CuaHang> getListCH() {
        return this.listCuaHang.getCuaHangs();
    }

    @Override
    public List<KhachHang> getListKH() {
        return this.listKhachHang.getKhachHangs();
    }

    @Override
    public int getRole() {
        return panelStartApp.getRoleAccount();
    }

    @Override
    public void passDataCHToPanel(CuaHang cuaHang) {
        panelPhienCH.setCuaHang(cuaHang);
    }

    @Override
    public void goToPhienCH() {
        panelDangNhap.setVisible(false);
        panelPhienCH.setVisible(true);
    }

    @Override
    public void setUserNameCH(String username, String shopname) {
        panelPhienCH.setjLabel_UserName(username);
        panelPhienCH.setjLabel_TenCH(shopname);
    }

    //dang nhap vao khach hang 
    @Override
    public void passDataKHToPanel(KhachHang khachHang) {

    }

    @Override
    public void setUserNameKH(String name) {

    }

    @Override
    public void saveDataCH(CuaHang cuaHang) {
        for (int i = 0; i < listCuaHang.getCuaHangs().size(); i++) {
            if (cuaHang.getTaiKhoan().equals(listCuaHang.getCuaHangs().get(i).getTaiKhoan())) {
                listCuaHang.updateCuaHang(cuaHang, i);
                break;
            }
        }
        try {
            listCuaHang.writeDataToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void passListSPCHToPanelList(List<SanPhamCuaHang> list) {
        panelListSP.setListSPCH(list);
        DefaultListModel<SanPhamCuaHang> model = new DefaultListModel<>();
        if (list.size() > 0) {
//                    addAll
            for (int i = 0; i < list.size(); i++) {
                model.addElement(list.get(i));
            }
        }
        panelListSP.setModel_sp(model);
        panelListSP.setVisible(true);
        panelPhienCH.setVisible(false);
    }

    @Override
    public void passListSPCHToPanelPhienCH(List<SanPhamCuaHang> list) {
        panelPhienCH.setListToCH(list);
    }

    @Override
    public void fromGioHang() {
        panelGioHang.setVisible(false);
        panelLamViecKhachHang.setVisible(true);
    }

    @Override
    public void fromPhienLamViec() {
        panelLamViecKhachHang.setVisible(false);
//        panelStartApp.setVisible(true);
    }

    @Override
    public void toGioHang() {
        panelGioHang.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public void toLichSu() {
        panelLichSu.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public void fromLichSu() {
        panelLichSu.setVisible(false);
        panelLamViecKhachHang.setVisible(true);
    }

    @Override
    public void showAllGioHang() {
        panelGioHang.setModelList(panelGioHang.getModel_sp());
        panelGioHang.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public void showAllLichSu() {
        panelLichSu.setModelList(panelLichSu.getModel_sp());
        panelLichSu.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public void toDanhSachSanPham() {
       
        panelDSSPKhachHang.setModel(panelLamViecKhachHang.getModel_sp_test());
        panelDSSPKhachHang.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public void fromDanhSachSanPham() {
     panelPhienCH.setVisible(false);
   //     panelDSSPKhachHang.setVisible(false);
        panelDangNhap.setVisible(false);
        panelLamViecKhachHang.setVisible(true);
    }

    @Override
    public void showAllDanhSachSanPham() {
        panelDSSPKhachHang.setModelList(panelDSSPKhachHang.getModel_sp());
        panelDSSPKhachHang.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public DefaultListModel<SanPhamKhachHang> model_SanPhamKhachHang() {
        return model_SanPhamKhachHang();
    }
}
