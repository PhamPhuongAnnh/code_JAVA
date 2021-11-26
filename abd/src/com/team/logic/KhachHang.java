package com.team.logic;

import java.util.ArrayList;
import java.util.List;

public class KhachHang extends CommonUser{
	private String hoTen;
	private String diaChi;
	private String sdt;
	private String email;
	private List<SanPhamKhachHang> gioHang;
	private List<SanPhamKhachHang> lishSuMuaHang;
	
	public KhachHang(String taiKhoan, String matKhau, String hoTen, String diaChi, String sdt, String email) {
		super(taiKhoan, matKhau);
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.email = email;
		this.gioHang = new ArrayList<>();
		this.lishSuMuaHang = new ArrayList<>();
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<SanPhamKhachHang> getGioHang() {
		return gioHang;
	}

	public void setGioHang(List<SanPhamKhachHang> gioHang) {
		this.gioHang = gioHang;
	}

	public List<SanPhamKhachHang> getLishSuMuaHang() {
		return lishSuMuaHang;
	}

	public void setLishSuMuaHang(List<SanPhamKhachHang> lishSuMuaHang) {
		this.lishSuMuaHang = lishSuMuaHang;
	}

	public String getInfos() {
		return this.getTaiKhoan()+"&"+this.getMatKhau()+"&"+this.getHoTen()+"&"+this.getDiaChi()+"&"
				+this.getSdt()+"&"+this.getEmail()+"&";
	}
	
	public boolean isAccountOrPhoneExisted(String acc, String phone) {
		if(this.getTaiKhoan().equals(acc) || this.getSdt().equals(phone)) {
			return true;
		}
		return false;
	}
}
