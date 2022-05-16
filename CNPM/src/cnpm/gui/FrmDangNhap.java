package cnpm.gui;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import cnpm.dao.ConectDatabase;
import cnpm.model.TaiKhoan;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.SystemColor;

public class FrmDangNhap extends JFrame  implements ActionListener,KeyListener{

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtLoginFRM;
	private JLabel lblUser;
	private JTextField txtPass;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JButton btnReset;
	private JLabel lblSao;
	private JLabel lblSao2;
	private JLabel lblBatBuoc;
	private JLabel lblBatBuoc2;
	private JLabel lblMessLoiUser;
	private JLabel lblMessLoiPass;
	public static TaiKhoan taiKhoan ;
	public static boolean TrangThaiDangNhapNhanVien = false;
	public static boolean TrangThaiDangNhapQuanLy = false;
	private String tenTaiKhoanAdmin = "ADMIN";
	private String matKhauAdmin = "ADMIN";
	public static String usernameToGetNhanVien="";
	private JLabel lblNewLabel;
	/**
	 * Create the frame.
	 */
	public FrmDangNhap() {

		
		
		
		setBackground(new Color(153, 153, 255));
		setTitle("Đăng nhập");
		setBounds(100, 100, 578, 339);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtUser = new JTextField();
		txtUser.setForeground(new Color(51, 0, 51));
		txtUser.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtUser.setBackground(new Color(255, 255, 255));
		txtUser.setBounds(352, 83, 189, 25);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		lblUser = new JLabel("UserName:");
		lblUser.setBackground(Color.LIGHT_GRAY);
		lblUser.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblUser.setBounds(254, 84, 88, 25);
		contentPane.add(lblUser);

		txtPass = new JPasswordField();
		txtPass.setBackground(new Color(255, 255, 255));
		txtPass.setBounds(352, 144, 189, 25);
		txtPass.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(txtPass);
		txtPass.setColumns(10);

		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPassword.setBounds(254, 146, 81, 25);
		contentPane.add(lblPassword);

		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLogin.setBounds(303, 222, 131, 32);
		btnLogin.setIcon(new ImageIcon("Hinh\\login.png"));
		contentPane.add(btnLogin);

		btnReset = new JButton("Reset");
		btnReset.setIcon(new ImageIcon("Hinh\\arrow_refresh.png"));
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnReset.setBounds(436, 222, 107, 32);
		contentPane.add(btnReset);

		lblMessLoiUser = new JLabel("");
		lblMessLoiUser.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblMessLoiUser.setForeground(Color.RED);
		lblMessLoiUser.setBounds(240, 112, 298, 21);
		contentPane.add(lblMessLoiUser);

		lblMessLoiPass = new JLabel("");
		lblMessLoiPass.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblMessLoiPass.setForeground(Color.RED);
		lblMessLoiPass.setBounds(254, 172, 287, 25);
		contentPane.add(lblMessLoiPass);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Luu Pot\\Desktop\\Working\\QLyHieuThuoc\\src\\image\\login.jpg"));
		label.setBounds(0, 0, 244, 300);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("Quản Lý Hiệu Thuốc");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(314, 25, 227, 36);
		contentPane.add(lblNewLabel);
		btnReset.addActionListener(this);
		btnLogin.addActionListener(this);
		txtUser.requestFocus();
		this.addKeyListener(this);
		
	}
	public boolean KiemTraDuLieu() {
		String tenUser = txtUser.getText();
		// ten dang nhap phai la chu hoac so va khong co ki tu dac biet co toi da tu 5-20 ki tu
		boolean match = tenUser.matches("[a-zA-z0-9 ]{3,20}");
		if(match!=true) {
			lblMessLoiUser.setText("Lỗi: Tên đăng Nhập(Không Chứa Ký Tự �?ặt Biệt,Tối Thiểu 3-20 Ký Tự)");
			return false;
		}
		else
			return true;
	}
	public void loadTaiKhoan(String tenDangNhap,String matKhau) {
		try {
			Connection con = ConectDatabase.getInstance().getConnection();
			PreparedStatement stmt = null;
			String sql  = "select t.TenTaiKhoan,MatKhau,LoaiNhanVien\r\n" + 
					"from dbo.TaiKhoan t join dbo.NhanVien n on t.TenTaiKhoan = n.TenTaiKhoan \r\n" + 
					"where t.TenTaiKhoan=? and t.MatKhau=?";
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1,tenDangNhap);
			stmt.setString(2, matKhau);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String ten = rs.getString(1).trim();
				String mk = rs.getString(2).trim();
				String loaiTk = rs.getString(3).trim();
				taiKhoan  = new TaiKhoan(ten, mk, loaiTk);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public boolean kiemTraDangNhap(String tenDangNhap,String matKhau) {
		if(tenDangNhap.equalsIgnoreCase(tenTaiKhoanAdmin) && matKhau.equalsIgnoreCase(matKhauAdmin)) {
			TrangThaiDangNhapNhanVien = true ;
			TrangThaiDangNhapQuanLy = true;
			return true;
		}
		else if(taiKhoan.getTenTaiKhoan().equalsIgnoreCase(tenDangNhap) && taiKhoan.getMatKhau().equalsIgnoreCase(matKhau) && taiKhoan.getLoaiTaiKhoan().equalsIgnoreCase("NV") ) {
			TrangThaiDangNhapNhanVien =true;
			return true;
		}
		else if(taiKhoan.getTenTaiKhoan().equalsIgnoreCase(tenDangNhap) && taiKhoan.getMatKhau().equalsIgnoreCase(matKhau) && taiKhoan.getLoaiTaiKhoan().equalsIgnoreCase("QL")) {
			TrangThaiDangNhapQuanLy =true;
			return true;
		}
		
		return false;
	}
	public boolean kiemTraDangNhapAdmin(String tenDangNhap,String matKhau) {
		if(tenDangNhap.equalsIgnoreCase(tenTaiKhoanAdmin) && matKhau.equalsIgnoreCase(matKhauAdmin)) {
			TrangThaiDangNhapNhanVien = true ;
			TrangThaiDangNhapQuanLy = true;
			return true;
		}
		return false;
	}
	public void logIn() {
		try {
			if(KiemTraDuLieu()) {
				String tenDN = txtUser.getText().trim();
				String matKhau = txtPass.getText().trim();
				loadTaiKhoan(tenDN, matKhau);
				if(kiemTraDangNhap(tenDN, matKhau) && TrangThaiDangNhapNhanVien==true && TrangThaiDangNhapQuanLy==true) {
					usernameToGetNhanVien=txtUser.getText();
					FrmManHinhChinh frmManHinhChinh = new FrmManHinhChinh();
					frmManHinhChinh.setVisible(true);
					this.setVisible(false);
				}
				else if(kiemTraDangNhap(tenDN, matKhau) && TrangThaiDangNhapNhanVien==true) {
					usernameToGetNhanVien=txtUser.getText();
					FrmManHinhChinh frmManHinhChinh = new FrmManHinhChinh();
					frmManHinhChinh.mntmQuanLyThuoc.setEnabled(false);
					frmManHinhChinh.mnNhanVien.setEnabled(false);
					frmManHinhChinh.mnThongKe.setEnabled(false);
					frmManHinhChinh.setVisible(true);
					this.setVisible(false);
				}
				else if(kiemTraDangNhap(tenDN, matKhau) && TrangThaiDangNhapQuanLy==true) {
					usernameToGetNhanVien=txtUser.getText();
					FrmManHinhChinh frmManHinhChinh = new FrmManHinhChinh();
					frmManHinhChinh.mnLapHoaDon.setEnabled(false);
					frmManHinhChinh.setVisible(true);
					
					this.setVisible(false);
				}
				
				else 
					JOptionPane.showMessageDialog(this,"Tên Đăng Nhập, Hoặc Mật Khẩu Sai.");
			}
		} catch (Exception e2) {
			// TODO: handle exception
			//e2.printStackTrace();
			JOptionPane.showMessageDialog(this,"Tên Đăng Nhập, Hoặc Mật Khẩu Sai.");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj.equals(btnReset)) {
			txtUser.setText("");
			txtPass.setText("");
			lblMessLoiUser.setText("");
			lblMessLoiPass.setText("");
			txtUser.requestFocus();
		}
		else if(obj.equals(btnLogin)) {
			logIn();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			logIn();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			logIn();
		}
	}

}
