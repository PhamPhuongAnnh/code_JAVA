/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team.ui.panel;

import com.team.logic.SanPhamCuaHang;
import com.team.logic.SanPhamKhachHang;
import com.team.ui.ActionClick;
import com.team.ui.GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author phuon
 */
public class PanelPhienLamViecCuaKhachHang extends BasePanel {

    private JLabel lb_QuayLai;
    private ActionClick ack;
    private JButton btn_listSP, btn_gioHang, btn_lichSu, btn_khac;
    static final String BT_listSP = "DanhSachSP";
    static final String BT_gioHang = "GioHang";
    static final String BT_lichSu = "LS";
    static final String BT_khac = "Khac";
    private List<SanPhamCuaHang> listSanPhamCuaHang;
    private DefaultListModel<SanPhamCuaHang> model_sp_test;
    
    public ActionClick getAck() {
        return ack;
    }

    public void setAck(ActionClick ack) {
        this.ack = ack;
    }

    @Override
    public void initUI() {
        setLayout(null);
        setBackground(GUI.colerTheme);
        setVisible(true);
    }

    @Override
    public void addEvent() {

    }

    @Override
    public void addComp() {

        Font font1 = new Font("Tahoma", Font.BOLD, 20);
        Font font2 = new Font("Tahoma", Font.BOLD, 15);
        Icon icon = new ImageIcon("D:\\Downloads\\ic_arrow_back_ios1.png", "comeback");
        lb_QuayLai = new JLabel("<html><u>Quay lại</u></html>", icon, JLabel.CENTER);
        lb_QuayLai.setLocation(20, 20);
        lb_QuayLai.setBackground(GUI.colerTheme);
        lb_QuayLai.setSize(100, 40);
        lb_QuayLai.setFont(font2);
        lb_QuayLai.setOpaque(true);
        lb_QuayLai.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ack.fromPhienLamViec();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_QuayLai.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_QuayLai.setForeground(Color.BLACK);
            }
        });
        add(lb_QuayLai);
        btn_listSP = createButton("Danh sách sản phẩm", 200, 120, font2, Color.BLACK, BT_listSP);
        btn_listSP.setSize(450, 50);
        add(btn_listSP);
        btn_gioHang = createButton("Giỏ hàng của bạn", 200, btn_listSP.getY() + 70, font2, Color.BLACK, BT_gioHang);
        btn_gioHang.setSize(450, 50);
        add(btn_gioHang);
        btn_lichSu = createButton("Lịch sử mua hàng", 200, btn_gioHang.getY() + 70, font2, Color.BLACK, BT_lichSu);
        btn_lichSu.setSize(450, 50);
        add(btn_lichSu);
        btn_khac = createButton("Chức năng khác", 200, btn_lichSu.getY() + 70, font2, Color.BLACK, BT_khac);
        btn_khac.setSize(450, 50);
        add(btn_khac);

        listSanPhamCuaHang = new ArrayList<>();
        listSanPhamCuaHang.add(new SanPhamCuaHang("2", "Áo dài tay", "Áo", "Áo cao cấp", 20, 200, null));
        listSanPhamCuaHang.add(new SanPhamCuaHang("1", "Áo thun", "Áo", "Áo cao cấp", 20, 150, null));
        listSanPhamCuaHang.add(new SanPhamCuaHang("2", "Áo dài tay", "Áo", "Áo cao cấp", 20, 200, null));
        listSanPhamCuaHang.add(new SanPhamCuaHang("3", "Áo phông ", "Áo", "Áo cao cấp", 20, 150, null));
        listSanPhamCuaHang.add(new SanPhamCuaHang("4", "Áo sơ mi", "Áo", "Áo cao cấp", 20, 350, null));
        listSanPhamCuaHang.add(new SanPhamCuaHang("5", "Quần đùi", "Quần", "Quần cao cấp", 20, 200, null));
        listSanPhamCuaHang.add(new SanPhamCuaHang("6", "Quần dài", "Quần", "Quần cao cấp", 20, 250, null));
        
        model_sp_test = new DefaultListModel<>();
        model_sp_test.addElement(new SanPhamCuaHang("3", "Áo dài tay", "Áo", "Áo cao cấp", 20, 200, null));
        model_sp_test.addElement(new SanPhamCuaHang("2", "Áo dài tay", "Áo", "Áo cao cấp", 20, 200, null));
        model_sp_test.addElement(new SanPhamCuaHang("1", "Áo dài tay", "Áo", "Áo cao cấp", 20, 200, null));
        
    
    }

    public DefaultListModel<SanPhamCuaHang> getModel_sp_test() {
        return model_sp_test;
    }

    public void setModel_sp_test(DefaultListModel<SanPhamCuaHang> model_sp_test) {
        this.model_sp_test = model_sp_test;
    }

    
    
    public List<SanPhamCuaHang> getListSanPhamCuaHang() {
        return listSanPhamCuaHang;
    }

    public void setListSanPhamCuaHang(List<SanPhamCuaHang> listSanPhamCuaHang) {
        this.listSanPhamCuaHang = listSanPhamCuaHang;
    }

    @Override
    protected void handleClick(String name) {
        if (name.equals(BT_listSP)) {
            System.out.println(ack.getListCH().size());
            ack.toDanhSachSanPham();
        }
        if (name.equals(BT_gioHang)) {
            ack.toGioHang();
        }
        if (name.equals(BT_lichSu)) {
            ack.toLichSu();
        }
    }

}
