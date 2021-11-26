package com.team.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.team.ui.ActionClick;
import com.team.ui.GUI;

public class PanelStartApp extends BasePanel{
	private static final String APP_NAME = "STORES";
	private static final String BAN_LA = "Bạn là";
	private static final String CH = "Quản lý cửa hàng";
	private static final String BT_CUAHANG = "BT_CUAHANG";
	private static final String BT_KHACHHANG = "BT_KHACHHANG";
	private static final String KH = "Khách hàng";
	private static final String TEXT_DANG_KY = "Bạn chưa có tài khoản";
	private static final String DANG_KY = "Đăng ký";
	private static final String BT_DANGKY = "BT_DANGKY";
	private JLabel lb_AppName, lb_BanLa, lb_DangKy;
	private JButton bt_CuaHang, bt_KhachHang, bt_DangKy;
	private ActionClick ack;
	private int roleAccount;
	
	@Override
	public void initUI() {
		setLayout(null);
		setVisible(true);
		setBackground(Color.WHITE);
	}

	@Override
	public void addEvent() {
		
	}

	@Override
	public void addComp() {
		Font font1 = new Font("Tahoma", Font.BOLD, 60);
		Font font2 = new Font("Tahoma", Font.BOLD, 20);
		lb_AppName = createLabel(APP_NAME, 0, 20, font1, Color.BLACK, getBackground());
		int x = GUI.W_SIZE/2 - lb_AppName.getWidth()/2;
		lb_AppName.setLocation(x, lb_AppName.getY());
		add(lb_AppName);
		lb_BanLa = createLabel(BAN_LA, 0, lb_AppName.getY()+lb_AppName.getHeight()+40, font2, Color.BLACK, getBackground());
		x = GUI.W_SIZE/2 - lb_BanLa.getWidth()/2;
		lb_BanLa.setLocation(x, lb_BanLa.getY());
		add(lb_BanLa);
		bt_CuaHang = createButton(CH, 0, lb_BanLa.getY()+lb_BanLa.getHeight()+20, font2, Color.BLACK, BT_CUAHANG);
		x = GUI.W_SIZE/2 - bt_CuaHang.getWidth()/2;
		bt_CuaHang.setLocation(x,bt_CuaHang.getY());
		add(bt_CuaHang);
		bt_KhachHang = createButton(KH, 0, bt_CuaHang.getY()+bt_CuaHang.getHeight()+20, font2, Color.BLACK, BT_KHACHHANG);
		bt_KhachHang.setSize(bt_CuaHang.getSize());
		x = GUI.W_SIZE/2 - bt_KhachHang.getWidth()/2;
		bt_KhachHang.setLocation(x,bt_KhachHang.getY());
		add(bt_KhachHang);
		lb_DangKy = createLabel(TEXT_DANG_KY, 0, bt_KhachHang.getY()+bt_KhachHang.getHeight()+40, font2, Color.BLACK, getBackground());
		x = GUI.W_SIZE/2 - lb_DangKy.getWidth()/2;
		lb_DangKy.setLocation(x, lb_DangKy.getY());
		add(lb_DangKy);
		bt_DangKy = createButton(DANG_KY, 0, lb_DangKy.getY()+lb_DangKy.getHeight()+20, font2, Color.BLACK, BT_DANGKY);
		x = GUI.W_SIZE/2 - bt_DangKy.getWidth()/2;
		bt_DangKy.setLocation(x, bt_DangKy.getY());
		add(bt_DangKy);
	}

	@Override
	protected void handleClick(String name) {
		if(name.equals(BT_CUAHANG)) {
			setRoleAccount(0);
			ack.toDangNhap();
		}
		if(name.equals(BT_KHACHHANG)) {
			setRoleAccount(1);
			ack.toDangNhap();
		}
		if(name.equals(BT_DANGKY)) {
			ack.toDangKy();
		}
	}
	
	
	public int getRoleAccount() {
		return roleAccount;
	}

	private void setRoleAccount(int roleAccount) {
		this.roleAccount = roleAccount;
	}

	public ActionClick getAck() {
		return ack;
	}

	public void setAck(ActionClick ack) {
		this.ack = ack;
	}
	
}
