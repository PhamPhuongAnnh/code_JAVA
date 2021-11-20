package com.team.ui.panel;

import com.team.logic.SanPhamCuaHang;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelSanPhamRender extends JPanel implements ListCellRenderer<SanPhamCuaHang> {
    private JLabel label_Image;
    private JLabel label_Masp;
    private JLabel label_Tensp;
    private JLabel label_Giasp;



    public PanelSanPhamRender(){

        label_Image = new JLabel();
        label_Masp = new JLabel();
        label_Tensp = new JLabel();
        label_Giasp = new JLabel();

        JPanel panel_InfoSP = new JPanel(new FlowLayout());
        panel_InfoSP.setSize(300,300);
        panel_InfoSP.setBackground(Color.decode("#a6f7f6"));
        panel_InfoSP.add(label_Masp);
        panel_InfoSP.add(label_Tensp);
        panel_InfoSP.add(label_Giasp);


        setBorder(new LineBorder(Color.black));
        add(label_Image,BorderLayout.WEST);
        add(panel_InfoSP,BorderLayout.CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends SanPhamCuaHang> list, SanPhamCuaHang value, int index, boolean isSelected, boolean cellHasFocus) {
        label_Masp.setText("Mã sản phẩm:"+ value.getMaSP());
        label_Masp.setFont( new Font("Tahoma",Font.PLAIN,15));
        label_Masp.setForeground(Color.decode("#61149c"));

        label_Tensp.setText("Tên sản phẩm:"+ value.getTenSP());
        label_Tensp.setFont( new Font("Tahoma",Font.PLAIN,15));
        label_Tensp.setForeground(Color.decode("#61149c"));

        label_Giasp.setText("Giá sản phẩm:"+ String.valueOf(value.getGiaTien()));
        label_Giasp.setFont( new Font("Tahoma",Font.PLAIN,15));
        label_Giasp.setForeground(Color.decode("#61149c"));

        label_Image.setIcon(value.getAnhMH());

        if (isSelected){
            setBackground(list.getSelectionBackground());
        }
        else {
            setBackground(Color.decode("#97D7D3"));
        }
        return this;
    }
}
