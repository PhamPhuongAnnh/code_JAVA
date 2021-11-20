package com.team.logic;

import java.util.ArrayList;
import java.util.List;

public class CuaHang extends CommonUser{
	private String tenShop;
	private String diaCHiShop;
	private String sdtShop;
	private String emailShop;
	private List<SanPhamCuaHang> sanPhamCuaHangs;
	
	public CuaHang(String taiKhoan, String matKhau, String tenShop, String diaCHiShop, String sdtShop,
			String emailShop) {
		super(taiKhoan, matKhau);
		this.tenShop = tenShop;
		this.diaCHiShop = diaCHiShop;
		this.sdtShop = sdtShop;
		this.emailShop = emailShop;
		sanPhamCuaHangs = new ArrayList<>();
	}

	public String getTenShop() {
		return tenShop;
	}

	public void setTenShop(String tenShop) {
		this.tenShop = tenShop;
	}

	public String getDiaCHiShop() {
		return diaCHiShop;
	}

	public void setDiaCHiShop(String diaCHiShop) {
		this.diaCHiShop = diaCHiShop;
	}

	public String getSdtShop() {
		return sdtShop;
	}

	public void setSdtShop(String sdtShop) {
		this.sdtShop = sdtShop;
	}

	public String getEmailShop() {
		return emailShop;
	}

	public void setEmailShop(String emailShop) {
		this.emailShop = emailShop;
	}

	public List<SanPhamCuaHang> getSanPhamCuaHangs() {
		return sanPhamCuaHangs;
	}

	public void setSanPhamCuaHangs(List<SanPhamCuaHang> sanPhamCuaHangs) {
		this.sanPhamCuaHangs = sanPhamCuaHangs;
	}
	
	public void addSamPhamCuaHang(SanPhamCuaHang hang) {
		sanPhamCuaHangs.add(hang);
	}
	
	public String getInfos() {
		return this.getTaiKhoan()+"&"+this.getMatKhau()+"&"+this.getTenShop()+"&"+this.getDiaCHiShop()
				+"&"+this.getSdtShop()+"&"+this.getEmailShop()+"&";
	}
	
	public boolean isSanPhamExisted(String maSP) {
		for (int i = 0; i < sanPhamCuaHangs.size(); i++) {
			if(sanPhamCuaHangs.get(i).getMaSP().equals(maSP)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isAccountOrPhoneExisted(String acc, String phone) {
		if(this.getTaiKhoan().equals(acc) || this.getSdtShop().equals(phone)) {
			return true;
		}
		return false;
	}
}
