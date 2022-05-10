package cnpm.controller;

import java.awt.Color;

import cnpm.dao.ConectDatabase;
import cnpm.gui.FrmDangNhap;
public class main  {
public static void main(String[] args) {
	
	ConectDatabase.getInstance().connect();
		FrmDangNhap frmDangNhap = new FrmDangNhap();
		frmDangNhap.setVisible(true);
		frmDangNhap.setLocationRelativeTo(null);
	}
}
