package com.team.logic;

import java.sql.Date;
import java.sql.Time;

import javax.swing.ImageIcon;

public class SanPhamKhachHang{
	private String maSP;
	private Date ngay;
	private Time thoiGian;
	private boolean thanhToan;
	
	public SanPhamKhachHang(String maSP) {
		this.maSP = maSP;
		this.ngay = new Date(System.currentTimeMillis());
		this.thoiGian = new Time(System.currentTimeMillis());
		this.thanhToan = false;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public Date getNgay() {
		return ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

	public Time getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Time thoiGian) {
		this.thoiGian = thoiGian;
	}

	public boolean isThanhToan() {
		return thanhToan;
	}

	public void setThanhToan(boolean thanhToan) {
		this.thanhToan = thanhToan;
	}

	public String getInfos() {
		String trangThai = "";
		if(isThanhToan()) {
			trangThai = "$";
		}else {
			trangThai = "!";
		}
		return trangThai+"&"+this.getNgay()+"&"+this.getThoiGian()+"&"+this.getMaSP();
	}
}
