package com.team.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.team.logic.FileSystem;
import com.team.ui.ActionClick;
import com.team.ui.GUI;

public class PanelDangKy extends BasePanel{
	private static final String TITLE = "Bạn muốn đăng ký tài khoản cho";
	private static final String DKCH = "Quản lý cửa hàng";
	private static final String BT_DKCH = "BT_DKCH";
	private static final String DKKH = "Khách hàng";
	private static final String BT_DKKH = "BT_DKKH";
	private JButton bt_DKCuaHang, bt_DKKhachHang;
	private JLabel lb_text, lb_QuayLai;
	
	
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
				ack.comeBack();
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
		lb_text = createLabel(TITLE, 0, lb_QuayLai.getY()+lb_QuayLai.getHeight()+50, font1, Color.BLACK, Color.WHITE);
		int x = GUI.W_SIZE/2 - lb_text.getWidth()/2;
		lb_text.setLocation(x, lb_text.getY());
		add(lb_text);
		bt_DKCuaHang = createButton(DKCH, 0, lb_text.getY()+lb_text.getHeight()+30, font1, Color.BLACK, BT_DKCH);
		x = GUI.W_SIZE/2 - bt_DKCuaHang.getWidth()/2;
		bt_DKCuaHang.setLocation(x, bt_DKCuaHang.getY());
		add(bt_DKCuaHang);
		bt_DKKhachHang = createButton(DKKH, 0, bt_DKCuaHang.getY()+bt_DKCuaHang.getHeight()+30, font1, Color.BLACK, BT_DKKH);
		bt_DKKhachHang.setSize(bt_DKCuaHang.getSize());
		x = GUI.W_SIZE/2 - bt_DKCuaHang.getWidth()/2;
		bt_DKKhachHang.setLocation(x, bt_DKKhachHang.getY());
		add(bt_DKKhachHang);
	}

	@Override
	protected void handleClick(String name) {
		if(name.equals(BT_DKKH)) {
			ack.toKhachHangDK();
		}
		if(name.equals(BT_DKCH)) {
			ack.toCuaHangDK();
		}
	}
	
	private ActionClick ack;

	public ActionClick getAck() {
		return ack;
	}

	public void setAck(ActionClick ack) {
		this.ack = ack;
	}
	
	
}
