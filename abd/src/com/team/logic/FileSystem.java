package com.team.logic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class FileSystem {
	public static final String PATH_IMAGE_DEFAULT = System.getProperty("user.dir")+"\\src\\com\\team\\assets\\ic_photo_size_select_actual.png";
	public static final String PATH_ICON_RETURN = System.getProperty("user.dir")+"\\src\\com\\team\\assets\\ic_arrow_back_ios1.png";

	public static void getSanPhamKHFromFile(String path,KhachHang khachHang) throws IOException{
		List<SanPhamKhachHang> gioHang = new ArrayList<>();
		List<SanPhamKhachHang> lichSu = new ArrayList<>();
		File file = new File(path);
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		String line = "";
		while((line = raf.readLine()) != null) {
			String[] item = line.split("&");
			if(item[0].equals("$")) {
				SanPhamKhachHang temp = new SanPhamKhachHang(item[3]);
				temp.setNgay(Date.valueOf(item[1]));
				temp.setThoiGian(Time.valueOf(item[2]));
				temp.setThanhToan(true);
				lichSu.add(temp);
			}else {
				SanPhamKhachHang temp = new SanPhamKhachHang(item[3]);
				temp.setNgay(Date.valueOf(item[1]));
				temp.setThoiGian(Time.valueOf(item[2]));
				temp.setThanhToan(false);
				gioHang.add(temp);
			}
		}
		khachHang.setGioHang(gioHang);
		khachHang.setLishSuMuaHang(lichSu);
		raf.close();
	}
	
	public static String writeSanPhamKHToFile(KhachHang owner) throws IOException{
		String path = System.getProperty("user.dir")+"\\src\\com\\team\\assets\\"+owner.getSdt()+".txt";
		File file = new File(path);
		file.delete();
		file.createNewFile();
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		for(int i = 0; i < owner.getLishSuMuaHang().size(); i++) {
			raf.writeBytes(owner.getLishSuMuaHang().get(i).getInfos()+"\n");
		}
		for(int i = 0; i < owner.getGioHang().size(); i++) {
			raf.writeBytes(owner.getGioHang().get(i).getInfos()+"\n");
		}
		raf.close();
		return path;
	}
	
	public static void getSanPhamCHFromFile(String path, CuaHang cuaHang) throws IOException{
		List<SanPhamCuaHang> list = new ArrayList<>();
		File file = new File(path);
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		String line = "";
		while((line = raf.readLine()) != null) {
			String[] item = line.split("&");
			String thongTinSP = item[3].replaceAll("#", "\n");
			SanPhamCuaHang temp = new SanPhamCuaHang(item[0], item[1], item[2], thongTinSP,
					Integer.parseInt(item[4]),Long.parseLong(item[5]), null);
			BufferedImage image = ImageIO.read(new File(item[6]));
			ImageIcon icon = new ImageIcon(image.getScaledInstance(50, 50, BufferedImage.SCALE_SMOOTH), item[6]);
			temp.setAnhMH(icon);
			list.add(temp);
		}
		cuaHang.setSanPhamCuaHangs(list);
		raf.close();
	}
	
	public static String writeSanPhamCHToFile(CuaHang owner) throws IOException{
		String path = System.getProperty("user.dir")+"\\src\\com\\team\\assets\\"+owner.getSdtShop()+".txt";
		File file = new File(path);
		file.delete();
		file.createNewFile();
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		for (int i = 0; i < owner.getSanPhamCuaHangs().size(); i++) {
			raf.writeBytes(owner.getSanPhamCuaHangs().get(i).getInfos() + "\n");
		}
		raf.close();
		return path;
	}
}
