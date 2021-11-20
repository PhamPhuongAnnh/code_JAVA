package com.team.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.team.logic.FileSystem;
import com.team.logic.KhachHang;
import com.team.ui.ActionClick;
import com.team.ui.GUI;

public class PanelKhachHangDK extends BasePanel{
	private static final String TITLE = "Đăng ký thông tin khách hàng";
	private static final String BT_XACNHAN = "BT_XACNHAN";
	private JLabel lb_QuayLai, lb_Title, lb_TaiKhoan, lb_MatKhau, lb_ConfirmMK, lb_HoTen, lb_DiaChi, lb_sdt, lb_Email;
	private JTextField tf_TaiKhoan, tf_HoTen, tf_DiaChi, tf_sdt, tf_Email;
	private JPasswordField tf_MatKhau, tf_ConfirmMK;
	private JButton bt_XacNhan;

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
				clearText();
				ack.backToDangKy();
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
		lb_Title = createLabel(TITLE, 0, lb_QuayLai.getY()+lb_QuayLai.getHeight()+20, font1, Color.BLACK, Color.WHITE);
		int x = GUI.W_SIZE/2 - lb_Title.getWidth()/2;
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
		lb_HoTen = createLabel("Họ tên:", 0, lb_ConfirmMK.getY()+lb_ConfirmMK.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		lb_HoTen.setLocation(lb_TaiKhoan.getX()-(lb_HoTen.getWidth()-lb_TaiKhoan.getWidth()), lb_HoTen.getY());
		add(lb_HoTen);
		tf_HoTen = createTextField(tf_TaiKhoan.getX(), lb_HoTen.getY(), 320, font2, Color.BLACK);
		add(tf_HoTen);
		lb_DiaChi = createLabel("Địa chỉ:", 0, lb_HoTen.getY()+lb_HoTen.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		lb_DiaChi.setLocation(lb_TaiKhoan.getX()-(lb_DiaChi.getWidth()-lb_TaiKhoan.getWidth()), lb_DiaChi.getY());
		add(lb_DiaChi);
		tf_DiaChi = createTextField(tf_TaiKhoan.getX(), lb_DiaChi.getY(), 320, font2, Color.BLACK);
		add(tf_DiaChi);
		lb_sdt = createLabel("Số điện thoại:", 0, lb_DiaChi.getY()+lb_DiaChi.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		lb_sdt.setLocation(lb_TaiKhoan.getX()-(lb_sdt.getWidth()-lb_TaiKhoan.getWidth()), lb_sdt.getY());
		add(lb_sdt);
		tf_sdt = createTextField(tf_TaiKhoan.getX(), lb_sdt.getY(), 320, font2, Color.BLACK);
		add(tf_sdt);
		lb_Email = createLabel("Email:", 0, lb_sdt.getY()+lb_sdt.getHeight()+20, font2, Color.BLACK, Color.WHITE);
		lb_Email.setLocation(lb_TaiKhoan.getX()-(lb_Email.getWidth()-lb_TaiKhoan.getWidth()), lb_Email.getY());
		add(lb_Email);
		tf_Email = createTextField(tf_TaiKhoan.getX(), lb_Email.getY(), 320, font2, Color.BLACK);
		add(tf_Email);
		bt_XacNhan = createButton("Xác nhận:", 0, tf_Email.getY()+tf_Email.getHeight()+40, font1, Color.BLACK, BT_XACNHAN);
		x = GUI.W_SIZE/2 - bt_XacNhan.getWidth()/2;
		bt_XacNhan.setLocation(x, bt_XacNhan.getY());
		add(bt_XacNhan);
	}

	@Override
	protected void handleClick(String name) {
		if(name.equals(BT_XACNHAN)) {
			if(tf_TaiKhoan.getText().equals("")||tf_MatKhau.getText().equals("")||tf_ConfirmMK.getText().equals("")||
					tf_HoTen.getText().equals("")||tf_DiaChi.getText().equals("")||tf_sdt.getText().equals("")||
					tf_Email.getText().equals("")) {
				JOptionPane.showConfirmDialog(null, "Mời bạn nhập đầy đủ thông tin", "Error", JOptionPane.CLOSED_OPTION);
			}else {
				if(checkValidAccount()) {
					if(tf_ConfirmMK.getText().equals(tf_MatKhau.getText())) {
						KhachHang khachHang = new KhachHang(tf_TaiKhoan.getText(), tf_MatKhau.getText(), tf_HoTen.getText(),
								tf_DiaChi.getText(), tf_sdt.getText(), tf_Email.getText());
						ack.addListKhachHang(khachHang);
						JOptionPane.showConfirmDialog(null, "Đăng ký thành công", "Stores", JOptionPane.CLOSED_OPTION);
						clearText();
						ack.comeBack();
					}else {
						JOptionPane.showConfirmDialog(null, "Mật khẩu xác nhận không chính xác", "Error", JOptionPane.CLOSED_OPTION);
					}
				}
			}
			
		}
	}
	
	private boolean checkValidAccount() {
		for (int i = 0; i < ack.getListKH().size(); i++) {
			if(ack.getListKH().get(i).isAccountOrPhoneExisted(tf_TaiKhoan.getText(), tf_sdt.getText())) {
				JOptionPane.showConfirmDialog(null, "Tên tài khoản hoặc số điện thoại đã được đăng ký mời bạn kiểm tra lại", "Error", JOptionPane.CLOSED_OPTION);
				return false;
			}
		}
		return true;
	}

	private void clearText() {
		tf_ConfirmMK.setText("");
		tf_DiaChi.setText("");
		tf_Email.setText("");
		tf_HoTen.setText("");
		tf_MatKhau.setText("");
		tf_sdt.setText("");
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
