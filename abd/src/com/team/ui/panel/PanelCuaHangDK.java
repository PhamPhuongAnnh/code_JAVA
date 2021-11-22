package com.team.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.team.logic.CuaHang;
import com.team.logic.FileSystem;
import com.team.logic.SanPhamCuaHang;
import com.team.ui.ActionClick;
import com.team.ui.GUI;

public class PanelCuaHangDK extends BasePanel{
	private static final String TITLE = "Đăng ký thông tin cửa hàng";
	private static final String BT_XACNHAN = "BT_XACNHAN";
	private static final String BT_THEMANH = "BT_THEMANH";
	private static final String BT_XACNHANSP = "BT_XACNHANSP";
	private JLabel lb_QuayLai, lb_Title, lb_TaiKhoan, lb_MatKhau, lb_ConfirmMK, lb_TenShop, lb_DiaChi, lb_Sdt, lb_Email;
	private JTextField tf_TaiKhoan, tf_TenShop, tf_DiaChi, tf_Sdt, tf_Email;
	private JPasswordField tf_MatKhau, tf_ConfirmMK;
	private JButton bt_XacNhan, bt_XacNhanSP, bt_ThemAnh;
	private JPanel pn_infoSP;
	private JLabel lb_PQuayLai,lb_PTitle,lb_PMaSp,lb_PTenSp,lb_PPhanLoai,lb_PThongTin,lb_PSoLuong,lb_GiaTien,lb_PImage;
	private JTextField tf_PMaSp,tf_PTenSp,tf_PPhanLoai,tf_PSoLuong,tf_GiaTien,tf_PImage;
	private JTextArea ta_PThongTin;
	private CuaHang cuaHang;

	@Override
	public void initUI() {
		setLayout(null);
		setBackground(Color.WHITE);
		setVisible(true);
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComp() {
		Font font1 = new Font("Tahoma", Font.BOLD, 20);
		Font font2 = new Font("Tahoma", Font.BOLD, 15);
		pn_infoSP = new JPanel(null);
		pn_infoSP.setSize(600,500);
		pn_infoSP.setBackground(GUI.colerTheme);
		int x = GUI.W_SIZE/2 - pn_infoSP.getWidth()/2;
		pn_infoSP.setLocation(x, 40);
		pn_infoSP.setVisible(false);
		pn_infoSP.setBorder(new LineBorder(Color.PINK));
		add(pn_infoSP);
		Icon icon = new ImageIcon(FileSystem.PATH_ICON_RETURN,"comeback");
		lb_QuayLai = new JLabel("<html><u>Quay lại</u></html>", icon, JLabel.CENTER);
		lb_QuayLai.setLocation(20, 20);
		lb_QuayLai.setBackground(Color.WHITE);
		lb_QuayLai.setSize(100,40);
		lb_QuayLai.setFont(font2);
		lb_QuayLai.setOpaque(true);
		lb_QuayLai.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(!lb_QuayLai.isEnabled()) {
					return;
				}
				clearText();
				ack.backToDangKy();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(!lb_QuayLai.isEnabled()) {
					return;
				}
				lb_QuayLai.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(!lb_QuayLai.isEnabled()) {
					return;
				}
				lb_QuayLai.setForeground(Color.BLACK);
			}
			
		});
		add(lb_QuayLai);
		lb_Title = createLabel(TITLE, 0, lb_QuayLai.getY()+lb_QuayLai.getHeight()+20, font1, Color.BLACK, Color.WHITE);
		x = GUI.W_SIZE/2 - lb_Title.getWidth()/2;
		lb_Title.setLocation(x, lb_Title.getY());
		add(lb_Title);
		lb_TaiKhoan = createLabel("Tài khoản:", 150, lb_Title.getY()+lb_Title.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		add(lb_TaiKhoan);
		tf_TaiKhoan = createTextField(lb_TaiKhoan.getX()+lb_TaiKhoan.getWidth()+20, lb_TaiKhoan.getY(), 320, font2, Color.BLACK);
		add(tf_TaiKhoan);
		lb_MatKhau = createLabel("Mật khẩu:", lb_TaiKhoan.getX(), lb_TaiKhoan.getY()+lb_TaiKhoan.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		lb_MatKhau.setLocation(lb_TaiKhoan.getX()-(lb_MatKhau.getWidth()-lb_TaiKhoan.getWidth()), lb_MatKhau.getY());
		add(lb_MatKhau);
		tf_MatKhau = createPasswordField(tf_TaiKhoan.getX(), lb_MatKhau.getY(), 320, font2, Color.BLACK);
		add(tf_MatKhau);
		lb_ConfirmMK = createLabel("Xác nhận mật khẩu:", 0, lb_MatKhau.getY()+lb_MatKhau.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		lb_ConfirmMK.setLocation(lb_TaiKhoan.getX()-(lb_ConfirmMK.getWidth()-lb_TaiKhoan.getWidth()), lb_ConfirmMK.getY());
		add(lb_ConfirmMK);
		tf_ConfirmMK = createPasswordField(tf_TaiKhoan.getX(), lb_ConfirmMK.getY(), 320, font2, Color.BLACK);
		add(tf_ConfirmMK);
		lb_TenShop = createLabel("Tên shop:", 0, lb_ConfirmMK.getY()+lb_ConfirmMK.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		lb_TenShop.setLocation(lb_TaiKhoan.getX()-(lb_TenShop.getWidth()-lb_TaiKhoan.getWidth()), lb_TenShop.getY());
		add(lb_TenShop);
		tf_TenShop = createTextField(tf_TaiKhoan.getX(), lb_TenShop.getY(), 320, font2, Color.BLACK);
		add(tf_TenShop);
		lb_DiaChi = createLabel("Địa chỉ shop:", 0, lb_TenShop.getY()+lb_TenShop.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		lb_DiaChi.setLocation(lb_TaiKhoan.getX()-(lb_DiaChi.getWidth()-lb_TaiKhoan.getWidth()), lb_DiaChi.getY());
		add(lb_DiaChi);
		tf_DiaChi = createTextField(tf_TaiKhoan.getX(), lb_DiaChi.getY(), 320, font2, Color.BLACK);
		add(tf_DiaChi);
		lb_Sdt = createLabel("Số điện thoại:", 0, lb_DiaChi.getY()+lb_DiaChi.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		lb_Sdt.setLocation(lb_TaiKhoan.getX()-(lb_Sdt.getWidth()-lb_TaiKhoan.getWidth()), lb_Sdt.getY());
		add(lb_Sdt);
		tf_Sdt = createTextField(tf_TaiKhoan.getX(), lb_Sdt.getY(), 320, font2, Color.BLACK);
		add(tf_Sdt);
		lb_Email = createLabel("Email:", 0, lb_Sdt.getY()+lb_Sdt.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		lb_Email.setLocation(lb_TaiKhoan.getX()-(lb_Email.getWidth()-lb_TaiKhoan.getWidth()), lb_Email.getY());
		add(lb_Email);
		tf_Email = createTextField(tf_TaiKhoan.getX(), lb_Email.getY(), 320, font2, Color.BLACK);
		add(tf_Email);
		bt_XacNhan = createButton("Xác nhận", 0, tf_Email.getY()+tf_Email.getHeight()+40, font1, Color.BLACK, BT_XACNHAN);
		x = GUI.W_SIZE/2 - bt_XacNhan.getWidth()/2;
		bt_XacNhan.setLocation(x, bt_XacNhan.getY());
		add(bt_XacNhan);
		//panel add san pham
		lb_PQuayLai = new JLabel("<html><u>Quay lại</u></html>", icon, JLabel.CENTER);
		lb_PQuayLai.setLocation(20, 20);
		lb_PQuayLai.setBackground(GUI.colerTheme);
		lb_PQuayLai.setSize(100,40);
		lb_PQuayLai.setFont(font2);
		lb_PQuayLai.setOpaque(true);
		lb_PQuayLai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clearText();
				backToDKCH();
				ack.addListCuaHang(cuaHang);
				ack.backToDangKy();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_PQuayLai.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_PQuayLai.setForeground(Color.BLACK);
			}
		});
		pn_infoSP.add(lb_PQuayLai);
		lb_PTitle = createLabel("Nhập thông tin sản phẩm", 0, 40, font1, Color.BLACK, GUI.colerTheme);
		x = pn_infoSP.getWidth()/2 - lb_PTitle.getWidth()/2;
		lb_PTitle.setLocation(x, lb_PTitle.getY());
		pn_infoSP.add(lb_PTitle);
		lb_PMaSp = createLabel("Mã sản phẩm:", 50, lb_PTitle.getY()+lb_PTitle.getHeight()+30, font2, Color.BLACK, GUI.colerTheme);
		pn_infoSP.add(lb_PMaSp);
		tf_PMaSp = createTextField(lb_PMaSp.getX()+lb_PMaSp.getWidth()+20, lb_PMaSp.getY(), 300, font2, Color.BLACK);
		pn_infoSP.add(tf_PMaSp);
		lb_PTenSp = createLabel("Tên sản phẩm:", 0, lb_PMaSp.getY()+lb_PMaSp.getHeight()+20, font2, Color.BLACK, GUI.colerTheme);
		lb_PTenSp.setLocation(lb_PMaSp.getX()-(lb_PTenSp.getWidth()-lb_PMaSp.getWidth()), lb_PTenSp.getY());
		pn_infoSP.add(lb_PTenSp);
		tf_PTenSp = createTextField(tf_PMaSp.getX(), lb_PTenSp.getY(), 300, font2, Color.BLACK);
		pn_infoSP.add(tf_PTenSp);
		lb_PPhanLoai = createLabel("Loại sản phẩm:", 0, lb_PTenSp.getY()+lb_PTenSp.getHeight()+20, font2, Color.BLACK, GUI.colerTheme);
		lb_PPhanLoai.setLocation(lb_PMaSp.getX()-(lb_PPhanLoai.getWidth()-lb_PMaSp.getWidth()), lb_PPhanLoai.getY());
		pn_infoSP.add(lb_PPhanLoai);
		tf_PPhanLoai = createTextField(tf_PMaSp.getX(), lb_PPhanLoai.getY(), 300, font2, Color.BLACK);
		pn_infoSP.add(tf_PPhanLoai);
		lb_PThongTin = createLabel("Thông tin sản phẩm:", 0, lb_PPhanLoai.getY()+lb_PPhanLoai.getHeight()+20, font2, Color.BLACK, GUI.colerTheme);
		lb_PThongTin.setLocation(lb_PMaSp.getX()-(lb_PThongTin.getWidth()-lb_PMaSp.getWidth()), lb_PThongTin.getY());
		pn_infoSP.add(lb_PThongTin);
		ta_PThongTin = new JTextArea();
		JScrollPane sp = new JScrollPane(ta_PThongTin, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setSize(300,100);
		sp.setLocation(tf_PMaSp.getX(), lb_PThongTin.getY());
		pn_infoSP.add(sp);
		lb_PSoLuong = createLabel("Số lượng kho:", 0, sp.getY()+sp.getHeight()+20, font2, Color.BLACK, GUI.colerTheme);
		lb_PSoLuong.setLocation(lb_PMaSp.getX()-(lb_PSoLuong.getWidth()-lb_PMaSp.getWidth()), lb_PSoLuong.getY());
		pn_infoSP.add(lb_PSoLuong);
		tf_PSoLuong = createTextField(tf_PMaSp.getX(), lb_PSoLuong.getY(), 300, font2, Color.BLACK);
		pn_infoSP.add(tf_PSoLuong);
		lb_GiaTien = createLabel("Giá tiền:", 0, lb_PSoLuong.getY()+lb_PSoLuong.getHeight()+20, font2, Color.BLACK, GUI.colerTheme);
		lb_GiaTien.setLocation(lb_PMaSp.getX()-(lb_GiaTien.getWidth()-lb_PMaSp.getWidth()), lb_GiaTien.getY());
		pn_infoSP.add(lb_GiaTien);
		tf_GiaTien = createTextField(tf_PMaSp.getX(), lb_GiaTien.getY(), 300, font2, Color.BLACK);
		pn_infoSP.add(tf_GiaTien);
		lb_PImage = createLabel("Ảnh sản phẩm:", 0, lb_GiaTien.getY()+lb_GiaTien.getHeight()+20, font2, Color.BLACK, GUI.colerTheme);
		lb_PImage.setLocation(lb_PMaSp.getX()-(lb_PImage.getWidth()-lb_PMaSp.getWidth()), lb_PImage.getY());
		pn_infoSP.add(lb_PImage);
		tf_PImage = createTextField(tf_PMaSp.getX(), lb_PImage.getY(), 250, font2, Color.BLACK);
		tf_PImage.setEditable(false);
		pn_infoSP.add(tf_PImage);
		bt_ThemAnh = createButton("+", tf_PImage.getX()+tf_PImage.getWidth()+20, lb_PImage.getY(), font2, Color.BLACK, BT_THEMANH);
		bt_ThemAnh.setSize(30, tf_PImage.getHeight());
		pn_infoSP.add(bt_ThemAnh);
		bt_XacNhanSP = createButton("Xác nhận", 0, lb_PImage.getY()+lb_PImage.getHeight()+20, font2, Color.BLACK, BT_XACNHANSP);
		x = pn_infoSP.getWidth()/2 - bt_XacNhanSP.getWidth()/2;
		bt_XacNhanSP.setLocation(x, bt_XacNhanSP.getY());
		pn_infoSP.add(bt_XacNhanSP);
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void handleClick(String name) {
		if(name.equals(BT_XACNHAN)) {
			if(tf_TaiKhoan.getText().equals("")||tf_MatKhau.getText().equals("")||tf_ConfirmMK.getText().equals("")||
					tf_TenShop.getText().equals("")||tf_DiaChi.getText().equals("")||tf_Sdt.getText().equals("")||
					tf_Email.getText().equals("")) {
				JOptionPane.showConfirmDialog(null, "Mời bạn nhập đầy đủ thông tin", "Error", JOptionPane.CLOSED_OPTION);
			}else {
				if(checkValidAccount()) {
					if(tf_ConfirmMK.getText().equals(tf_MatKhau.getText())) {
						cuaHang = new CuaHang(tf_TaiKhoan.getText(), tf_MatKhau.getText(), tf_TenShop.getText(), tf_DiaChi.getText(), 
								tf_Sdt.getText(), tf_Email.getText());
						int x = JOptionPane.showConfirmDialog(null, "Đăng ký thành công, bạn có muốn thêm sản phẩm", "Stores", JOptionPane.YES_NO_OPTION);
						if(x == JOptionPane.YES_OPTION) {
							pn_infoSP.setVisible(true);
							addSanPham();
						}else {
							ack.addListCuaHang(cuaHang);
							ack.comeBack();
						}
						clearText();
						
					}else {
						JOptionPane.showConfirmDialog(null, "Mật khẩu xác nhận không chính xác", "Error", JOptionPane.CLOSED_OPTION);
					}
				}
			}
		}
		if(name.equals(BT_THEMANH)) {
			JFileChooser file = new JFileChooser();
			int opt = file.showOpenDialog(this);
			File file0 = file.getSelectedFile();
			if(opt == JFileChooser.APPROVE_OPTION) {
				tf_PImage.setText(file0.getAbsolutePath());
			}
		}
		if(name.equals(BT_XACNHANSP)) {
			if(checkValidInput()) {
				SanPhamCuaHang spCH = new SanPhamCuaHang(tf_PMaSp.getText(), tf_PTenSp.getText(), 
						tf_PPhanLoai.getText(), ta_PThongTin.getText(), Integer.parseInt(tf_PSoLuong.getText()),
						Long.parseLong(tf_GiaTien.getText()),null);
				String path_image = "";
				if(tf_PImage.getText().equals("")) {
					path_image = FileSystem.PATH_IMAGE_DEFAULT;
				}else {
					path_image = tf_PImage.getText();
				}
				try {
					BufferedImage image = ImageIO.read(new File(path_image));
					ImageIcon icon = new ImageIcon(image.getScaledInstance(50, 50, BufferedImage.SCALE_SMOOTH),path_image);
					spCH.setAnhMH(icon);
					cuaHang.addSamPhamCuaHang(spCH);
				} catch (IOException e) {
					e.printStackTrace();
				}
				int x = JOptionPane.showConfirmDialog(null, "Thêm sản phẩm thành công bạn có muốn thêm tiếp", 
						"Stores",JOptionPane.YES_NO_OPTION);
				if(x == JOptionPane.YES_OPTION) {
					clearTextSP();
				}else {
					ack.addListCuaHang(cuaHang);
					ack.comeBack();
				}
			}
		}
	}
	
	private boolean checkValidAccount() {
		for (int i = 0; i < ack.getListCH().size(); i++) {
			if(ack.getListCH().get(i).isAccountOrPhoneExisted(tf_TaiKhoan.getText(), tf_Sdt.getText())) {
				JOptionPane.showMessageDialog(null, "Tên tài khoản hoặc số điện thoại đã được đăng ký mời bạn kiểm tra lại", "Error", JOptionPane.CLOSED_OPTION);
				return false;
			}
		}
		return true;
	}

	private boolean checkValidInput() {
		if(tf_PTenSp.getText().equals("")||tf_PSoLuong.getText().equals("")||tf_PPhanLoai.getText().equals("")
				||tf_PMaSp.getText().equals("")||ta_PThongTin.getText().equals("")) {
			JOptionPane.showConfirmDialog(null, "Mời bạn nhập đầy đủ thông tin", "Error", JOptionPane.CLOSED_OPTION);
			return false;
		}else {
			for (int i = 0; i < ack.getListCH().size(); i++) {
				if(ack.getListCH().get(i).isSanPhamExisted(tf_PMaSp.getText())) {
					JOptionPane.showConfirmDialog(null, "Mã sản phẩm đã tồn tại", "Error", JOptionPane.CLOSED_OPTION);
					return false;
				}
			}
			return true;
		}
	}

	private void clearTextSP() {
		tf_PImage.setText("");
		tf_PMaSp.setText("");
		tf_PPhanLoai.setText("");
		tf_PSoLuong.setText("");
		tf_PTenSp.setText("");
		ta_PThongTin.setText("");
	}

	private void addSanPham() {
		lb_QuayLai.setEnabled(false);
		tf_ConfirmMK.setVisible(false);
		tf_DiaChi.setVisible(false);
		tf_Email.setVisible(false);
		tf_MatKhau.setVisible(false);
		tf_Sdt.setVisible(false);
		tf_TaiKhoan.setVisible(false);
		tf_TenShop.setVisible(false);
		bt_XacNhan.setVisible(false);
	}

	private void backToDKCH() {
		pn_infoSP.setVisible(false);
		lb_QuayLai.setEnabled(true);
		tf_ConfirmMK.setVisible(true);
		tf_DiaChi.setVisible(true);
		tf_Email.setVisible(true);
		tf_MatKhau.setVisible(true);
		tf_Sdt.setVisible(true);
		tf_TaiKhoan.setVisible(true);
		tf_TenShop.setVisible(true);
		bt_XacNhan.setVisible(true);
	}
	
	private void clearText() {
		tf_ConfirmMK.setText("");
		tf_DiaChi.setText("");
		tf_Email.setText("");
		tf_TenShop.setText("");
		tf_MatKhau.setText("");
		tf_Sdt.setText("");
		tf_TaiKhoan.setText("");
	}
	
	private ActionClick ack;

	public ActionClick getAck() {
		return ack;
	}

	public void setAck(ActionClick ack) {
		this.ack = ack;
	}
	
}
