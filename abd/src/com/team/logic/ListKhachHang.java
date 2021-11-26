package com.team.logic;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListKhachHang {
	private final String PATH = System.getProperty("user.dir")+"\\src\\com\\team\\assets\\ListKhachHang.txt";
	private List<KhachHang> khachHangs;
	
	public ListKhachHang() {
		khachHangs = new ArrayList<>();
		try {
			readDataFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<KhachHang> getKhachHangs() {
		return khachHangs;
	}

	public void setKhachHangs(List<KhachHang> khachHangs) {
		this.khachHangs = khachHangs;
	}

	private void readDataFromFile() throws IOException{
		File file = new File(PATH);
		file.createNewFile();
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		String line = "";
		while((line = raf.readLine()) != null) {
			String[] item = line.split("&");
			KhachHang temp = new KhachHang(item[0], item[1], item[2], item[3], item[4], item[5]);
			FileSystem.getSanPhamKHFromFile(item[6], temp);
			khachHangs.add(temp);
		}
		raf.close();
	}
	
	public void writeDataToFile() throws IOException{
		File file = new File(PATH);
		file.createNewFile();
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		for(int i = 0; i < getKhachHangs().size(); i++) {
			raf.writeBytes(getKhachHangs().get(i).getInfos()
					+FileSystem.writeSanPhamKHToFile(getKhachHangs().get(i))+"\n");
		}
		raf.close();
	}
	
	public void addKhachHang(KhachHang khachHang) {
		this.khachHangs.add(khachHang);
	}
}
