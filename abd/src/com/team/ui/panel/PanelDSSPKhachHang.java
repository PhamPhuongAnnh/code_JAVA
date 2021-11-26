/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team.ui.panel;

import com.team.logic.SanPhamCuaHang;
import com.team.ui.ActionClick;
import com.team.ui.GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author phuon
 */
public class PanelDSSPKhachHang extends BasePanel {

    private JLabel lb_QuayLai, lb_tatCa, lb_tong;
    private JTextField tf_timKiem, tf_tongTien;
    private JButton btn_timKiem, btn_filter, btn_themVaoGioHang;
    
    private ActionClick ack;
    private ActionClick ac;
    
    static final String BT_timKiem = "Tìm kiếm";
    static final String BT_showAll = "Tất cả";
    static final String BT_themVaoGioHang = "Thêm vào giỏ hàng";

    private JList<SanPhamCuaHang> listSanPhamCuaHang;
    private DefaultListModel<SanPhamCuaHang> model_sp;
    private ImageIcon imageIcon_Quandai;
    public BufferedImage image_quanDai;
    private ImageIcon imageIcon_aoPhong;
    public BufferedImage image_aoPhong;

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
        //quay lai
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
                ack.fromDanhSachSanPham();
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
        // jtextfield tim kiem
        tf_timKiem = createTextField(150, 45, 320, font2, Color.BLACK);
        tf_timKiem.setSize(320, 40);
        add(tf_timKiem);
        // bnt tim kiem
        btn_timKiem = createButton("Tìm kiếm", tf_timKiem.getX() + 350, 45, font2, Color.BLACK, BT_timKiem);
        add(btn_timKiem);
        //btn filter 
        btn_filter = createButton("Tất cả", tf_timKiem.getX() + 500, 45, font2, Color.BLACK, BT_showAll);
        add(btn_filter);

        try {
            image_quanDai = ImageIO.read(new File("src/com/team/ui/Picture/quandai.png"));
            image_aoPhong = ImageIO.read(new File("src/com/team/ui/Picture/aophong.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageIcon_Quandai = new ImageIcon(image_quanDai.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        imageIcon_aoPhong = new ImageIcon(image_aoPhong.getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        // jlist
        JPanel jPanel_main = new JPanel();
        jPanel_main.setBounds(0, 130, 795, 370);
        jPanel_main.setBackground(GUI.colerTheme);
        jPanel_main.setLayout(new BorderLayout());

        model_sp = new DefaultListModel<>(); // Tạo model để add vào JList -- mỗi model là thể hiện cho 1 sản phẩm của cửa hàng
 

  
        listSanPhamCuaHang = new JList<>(model_sp);
        listSanPhamCuaHang.setCellRenderer(new PanelSanPhamRender());
        jPanel_main.add(new JScrollPane(listSanPhamCuaHang), BorderLayout.CENTER); // add Jlist vào trong 1 ScrollPane , sau đó add ScrollPane vào cái PanelMain

        add(jPanel_main);

        //btn thanh toán
        btn_themVaoGioHang = createButton("Thêm vào giỏ hàng", 400, 550, font2, Color.BLACK, BT_themVaoGioHang);
        add(btn_themVaoGioHang);

    }

    @Override
    protected void handleClick(String name) {
        if (name.equals(BT_timKiem)) {
            int check = 0;
            DefaultListModel<SanPhamCuaHang> model_FullSpCuaHang = (DefaultListModel<SanPhamCuaHang>) listSanPhamCuaHang.getModel();
            for (int i = 0; i < model_FullSpCuaHang.size(); i++) {
                if (model_FullSpCuaHang.get(i).getMaSP().equals(tf_timKiem.getText())) {
                    DefaultListModel<SanPhamCuaHang> model_SpCanTim = new DefaultListModel<>();
                    model_SpCanTim.addElement(new SanPhamCuaHang(model_FullSpCuaHang.get(i).getMaSP(), model_FullSpCuaHang.get(i).getTenSP(), model_FullSpCuaHang.get(i).getPhanLoai(), model_FullSpCuaHang.get(i).getThongTinChiTiet(), model_FullSpCuaHang.get(i).getSoLuong(), model_FullSpCuaHang.get(i).getGiaTien(), model_FullSpCuaHang.get(i).getAnhMH()));
                    listSanPhamCuaHang.setModel(model_SpCanTim);
                    check += 1;
                    break;
                }
            }
            if (check == 0) {
                JOptionPane.showConfirmDialog(null, "Không có sản phẩm", "Error", JOptionPane.CLOSED_OPTION);
            }
        }
        if (name.equals(BT_showAll)) {
            ack.showAllDanhSachSanPham();
        }
        if (name.equals(BT_themVaoGioHang)) {
            themSanPham();
        }
    }

    private void themSanPham() {
        DefaultListModel<SanPhamCuaHang> model = (DefaultListModel<SanPhamCuaHang>) listSanPhamCuaHang.getModel();
        DefaultListModel<SanPhamCuaHang> model_sanPhamLuaChon = new DefaultListModel<>();
        if (!model.isEmpty() && listSanPhamCuaHang.getSelectedIndex() >= 0) {
            model_sanPhamLuaChon.addElement(model.getElementAt(listSanPhamCuaHang.getSelectedIndex()));
        }
        System.out.println(model_sanPhamLuaChon);
    }

    public DefaultListModel<SanPhamCuaHang> getModel_sp() {
        return model_sp;
    }

    public void setModel_sp(DefaultListModel<SanPhamCuaHang> model_sp) {
        this.model_sp = model_sp;
    }

    public JList<SanPhamCuaHang> getListSanPhamKhachHang() {
        return listSanPhamCuaHang;
    }

    public void setListSanPhamKhachHang(JList<SanPhamCuaHang> listSanPhamCuaHang) {
        this.listSanPhamCuaHang = listSanPhamCuaHang;
    }

    public void setModelList(DefaultListModel<SanPhamCuaHang> model) {
        listSanPhamCuaHang.setModel(model);
    }
    
    public void setModel(DefaultListModel<SanPhamCuaHang> model) {
       this.model_sp = model;
    }

    public ActionClick getAc() {
        return ac;
    }

    public void setAc(ActionClick ac) {
        this.ac = ac;
    }
    
    
    
}
