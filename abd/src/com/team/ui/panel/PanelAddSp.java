package com.team.ui.panel;

import com.team.logic.FileSystem;
import com.team.logic.SanPhamCuaHang;
import com.team.ui.ActionClick;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelAddSp extends BasePanel{
    private JTextField textField_maSp;
    private JTextField textField_tenSp;
    private JTextField textField_phanLoai;
    private JTextField textField_thongtinChiTiet;
    private JTextField textField_soLuong;
    private JTextField textField_giaTien;
    private JTextField textField_anh;

    private JLabel label_TitleaddSp;
    private JLabel label_maSp;
    private JLabel label_tenSp;
    private JLabel label_phanLoai;
    private JLabel label_thongtinChiTiet;
    private JLabel label_soLuong;
    private JLabel label_giaTien;
    private JLabel label_anh;

    private JButton button_Xacnhan;
    private JButton button_return;
    private JButton button_anh;

    private DefaultListModel<SanPhamCuaHang> model_SpCH;
    
    @Override
    public void initUI() {
        setLayout(null);
        setVisible(true);
        setBackground(Color.decode("#61149c"));
    }

    @Override
    public void addEvent() {

    }

    @Override
    public void addComp() {
        Font small_font = new Font("Tahoma",Font.PLAIN,25);

        textField_maSp = createTextField(200,150,400,small_font,Color.black);
        textField_tenSp = createTextField(200,200,400,small_font,Color.black);
        textField_phanLoai = createTextField(200,250,400,small_font,Color.black);
        textField_thongtinChiTiet = createTextField(200,300,400,small_font,Color.black);
        textField_soLuong = createTextField(200,350,400,small_font,Color.black);
        textField_giaTien = createTextField(200,400,400,small_font,Color.black);
        textField_anh =createTextField(200, 450, 300, small_font, Color.black);
        textField_anh.setEditable(false);

        label_TitleaddSp = createLabel("Thêm sản phẩm",210,35,new Font("Helvetica Neue",Font.CENTER_BASELINE,50),Color.black,Color.white);
        label_TitleaddSp.setSize(400,60);
        label_TitleaddSp.setForeground(Color.decode("#e019b2"));
        label_TitleaddSp.setBackground(null);

        label_maSp = createLabel("Mã sản phẩm",40,148,small_font,Color.decode("#e05ccf"),null);
        label_maSp.setSize(150,30);
        label_tenSp = createLabel("Tên sản phẩm",40,198,small_font,Color.decode("#e05ccf"),null);
        label_tenSp.setSize(150,30);
        label_phanLoai = createLabel("Phân loại",40,248,small_font,Color.decode("#e05ccf"),null);
        label_phanLoai.setSize(150,30);
        label_thongtinChiTiet = createLabel("Chi tiết ",40,298,small_font,Color.decode("#e05ccf"),null);
        label_thongtinChiTiet.setSize(150,30);
        label_soLuong = createLabel("Số lượng ",40,348,small_font,Color.decode("#e05ccf"),null);
        label_soLuong.setSize(150,30);
        label_giaTien = createLabel("Giá ",40,398,small_font,Color.decode("#e05ccf"),null);
        label_giaTien.setSize(150,30);
        label_anh = createLabel("Ảnh sản phẩm", 40, 448, small_font, Color.decode("#e05ccf"), null);
        
        button_Xacnhan = createButton("Xác nhận",320,500,new Font("Helvetica Neue",Font.CENTER_BASELINE,25),Color.black,"button_xacNhanAddSp");
        button_return = createButton("Trở lại",5,5,small_font,Color.black,"button_return");
        button_anh = createButton("...",550 , textField_anh.getY(), small_font, Color.black, "BT_ANH");
        button_anh.setSize(50, textField_anh.getHeight());

        add(textField_maSp);
        add(textField_tenSp);
        add(textField_phanLoai);
        add(textField_thongtinChiTiet);
        add(textField_soLuong);
        add(textField_giaTien);
        add(textField_anh);

        add(label_TitleaddSp);
        add(label_maSp);
        add(label_tenSp);
        add(label_phanLoai);
        add(label_thongtinChiTiet);
        add(label_soLuong);
        add(label_giaTien);
        add(label_anh);

        add(button_Xacnhan);
        add(button_return);
        add(button_anh);
    }

    @Override
    protected void handleClick(String name) {
        if (name.equals("button_xacNhanAddSp")){
            if (textField_maSp.getText().equals(" ")|| textField_tenSp.getText().equals("")|| textField_phanLoai.getText().equals("")||textField_thongtinChiTiet.getText().equals("") || textField_soLuong.getText().equals("")||textField_giaTien.getText().equals("")){
                JOptionPane.showConfirmDialog(null,"Hãy nhập đầy đủ","Error",JOptionPane.CLOSED_OPTION);
            }
            else {
            	String path_image = "";
				if(textField_anh.getText().equals("")) {
					path_image = FileSystem.PATH_IMAGE_DEFAULT;
				}else {
					path_image = textField_anh.getText();
				}
				try {
					BufferedImage image = ImageIO.read(new File(path_image));
					ImageIcon icon = new ImageIcon(image.getScaledInstance(50, 50, BufferedImage.SCALE_SMOOTH),path_image);
					model_SpCH.addElement(new SanPhamCuaHang(textField_maSp.getText(),textField_tenSp.getText(),textField_phanLoai.getText(),textField_thongtinChiTiet.getText(),Integer.valueOf(textField_soLuong.getText()),Integer.valueOf(textField_giaTien.getText()),icon));
	                removeTextField();
	                actionClick.acctionShowSP();
				}catch (IOException e) {
					BufferedImage image;
					try {
						image = ImageIO.read(new File(FileSystem.PATH_IMAGE_DEFAULT));
						ImageIcon icon = new ImageIcon(image.getScaledInstance(50, 50, BufferedImage.SCALE_SMOOTH),path_image);
						model_SpCH.addElement(new SanPhamCuaHang(textField_maSp.getText(),textField_tenSp.getText(),textField_phanLoai.getText(),textField_thongtinChiTiet.getText(),Integer.valueOf(textField_soLuong.getText()),Integer.valueOf(textField_giaTien.getText()),icon));
		                removeTextField();
		                actionClick.acctionShowSP();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
                
            }
        }
        if (name.equals("button_return")){
            removeTextField();
            actionClick.acctionShowSP();
        }
        if(name.equals("BT_ANH")) {
        	JFileChooser file = new JFileChooser();
			int opt = file.showOpenDialog(this);
			File file0 = file.getSelectedFile();
			if(opt == JFileChooser.APPROVE_OPTION) {
				textField_anh.setText(file0.getAbsolutePath());
			}
        }
    }
    
    private ActionClick actionClick;

    public ActionClick getActionClick() {
        return actionClick;
    }

    public void setActionClick(ActionClick actionClick) {
        this.actionClick = actionClick;
    }

    public DefaultListModel<SanPhamCuaHang> getModel_SpCH() {
        return model_SpCH;
    }

    public void removeTextField(){
        textField_maSp.setText("");
        textField_tenSp.setText("");
        textField_phanLoai.setText("");
        textField_thongtinChiTiet.setText("");
        textField_soLuong.setText("");
        textField_giaTien.setText("");
    }

	public void setModel_SpCH(DefaultListModel<SanPhamCuaHang> model_SpCH) {
		this.model_SpCH = model_SpCH;
	}
    
}
