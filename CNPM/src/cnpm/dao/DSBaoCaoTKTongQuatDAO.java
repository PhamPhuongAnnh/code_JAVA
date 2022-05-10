package cnpm.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cnpm.model.NhaCungCap;
import cnpm.model.ThongKeBaoCaoTQ;
import cnpm.model.Thuoc;

public class DSBaoCaoTKTongQuatDAO {
	Connection con;
	PreparedStatement pre;
	ResultSet rs;

	ArrayList<ThongKeBaoCaoTQ> ds;
	ThongKeBaoCaoTQ tkbc;

	public DSBaoCaoTKTongQuatDAO() {
		ds = new ArrayList<ThongKeBaoCaoTQ>();
	}
	
	
	
	public List<String> getAllNgay() throws Exception {
		List<String> result = new ArrayList<String>();
		try {
			Connection con = ConectDatabase.getInstance().getConnection();
			PreparedStatement stmt = null;
			String sql = "select NgayLap from HoaDon";
			stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			String ngay;
			while (rs.next()) {
				ngay = rs.getString(1);
				result.add(ngay);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return result;
	}

	public double tinhTongThuocBanDuocTheoThang(int thang, int nam) throws Exception {
		double tongTien = 0;
		try {
			Connection con = ConectDatabase.getInstance().getConnection();
			String sql = "select sum(c.SoLuong* c.DonGia) from HoaDon h join CT_HoaDon c on h.MaHoaDon=c.MaHoaDon\r\n"
					+ "where month(NgayLap)=? and  year(NgayLap)=?";
			pre = con.prepareStatement(sql);
			pre.setInt(1, thang);
			pre.setInt(2, nam);
			rs = pre.executeQuery();
			while (rs.next()) {
				tongTien = rs.getDouble(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return tongTien;
	}

	 

	
	public double tinhTongTienThuocDaNhapTheoThang(int thang, int nam) throws Exception {
		double tongTien = 0;
		try {
			Connection con = ConectDatabase.getInstance().getConnection();
			String sql =  "								select t.MaThuoc,t.TenThuoc,t.DonGia,t.GiaNhap,CONVERT (nvarchar(10), h.NgayLap, 103) as HanSuDung,t.[SoDangKi],SUM(t.SoLuongNhap) AS SoLuongNhap,sum(ct.SoLuong) as SoLuongBan,sum(ct.SoLuong*ct.DonGia) as TienBan,sum(ct.SoLuong*t.GiaNhap) as TienNhap\r\n" + 
					"					from CT_HoaDon ct join Thuoc t on ct.maThuoc= t.maThuoc join HoaDon h on  ct.MaHoaDon=h.MaHoaDon\r\n" + 
					"					where month(NgayLap)=? and year(NgayLap)=?\r\n" + 
					"					group by  t.MaThuoc,t.TenThuoc,t.DonGia,t.GiaNhap,CONVERT (nvarchar(10), h.NgayLap, 103),t.[SoDangKi]\r\n" + 
					"					";
			pre = con.prepareStatement(sql);
			pre.setInt(1, thang);
			pre.setInt(2, nam);
			rs = pre.executeQuery();
			while (rs.next()) {
				tongTien += rs.getInt(8) * rs.getDouble(4);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return tongTien;
	}
	
	
	
	public List<ThongKeBaoCaoTQ> thongKeThuocDaBan_DoanhThu_TheoThang(int thang, int nam) throws Exception {
		List<ThongKeBaoCaoTQ> dsThuoc = new ArrayList<>();
		try {
			Connection con = ConectDatabase.getInstance().getConnection();
			String sql = "								select t.MaThuoc,t.TenThuoc,t.DonGia,t.GiaNhap,CONVERT (nvarchar(10), h.NgayLap, 103) as HanSuDung,t.[SoDangKi],SUM(t.SoLuongNhap) AS SoLuongNhap,sum(ct.SoLuong) as SoLuongBan,sum(ct.SoLuong*ct.DonGia) as TienBan,sum(ct.SoLuong*t.GiaNhap) as TienNhap\r\n" + 
					"					from CT_HoaDon ct join Thuoc t on ct.maThuoc= t.maThuoc join HoaDon h on  ct.MaHoaDon=h.MaHoaDon\r\n" + 
					"					where month(NgayLap)=? and year(NgayLap)=?\r\n" + 
					"					group by  t.MaThuoc,t.TenThuoc,t.DonGia,t.GiaNhap,CONVERT (nvarchar(10), h.NgayLap, 103),t.[SoDangKi]\r\n" + 
					"					";
			pre = con.prepareStatement(sql);
			pre.setInt(1, thang);
			pre.setInt(2, nam);
			rs = pre.executeQuery();
			while (rs.next()) {
				ThongKeBaoCaoTQ thuoc = new ThongKeBaoCaoTQ();
				thuoc.setMaThuoc(rs.getString(1));
				thuoc.setTenThuoc(rs.getString(2));
				thuoc.setDonGia(rs.getDouble(3));
				thuoc.setDonGiaNhap(rs.getDouble(4));
				thuoc.setNgay(rs.getString(5));
				thuoc.setSoDK(rs.getString(6));
				thuoc.setSoLuongNhap(rs.getInt(7));
				thuoc.setSoLuongBan(rs.getInt(8));
				thuoc.setLoiNhuan(rs.getDouble(9));
				thuoc.setTienThuocNhap(rs.getDouble(10));
				dsThuoc.add(thuoc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return dsThuoc;
			
		
	}
	

}
