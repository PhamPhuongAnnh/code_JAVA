package com.team.logic;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ListCuaHang {
	private final String PATH = System.getProperty("user.dir")+"\\src\\com\\team\\assets\\ListCuaHang.txt";
	private List<CuaHang> cuaHangs;
	
	public ListCuaHang() {
		cuaHangs = new ArrayList<>();
		try {
			readDataFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<CuaHang> getCuaHangs() {
		return cuaHangs;
	}

	public void setCuaHangs(List<CuaHang> cuaHangs) {
		this.cuaHangs = cuaHangs;
	}

	private void readDataFromFile() throws IOException{
		File file = new File(PATH);
		file.createNewFile();
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		String line = "";
		while((line = raf.readLine()) != null) {
			String[] item = line.split("&");
			CuaHang temp = new CuaHang(item[0], item[1], item[2], item[3], item[4], item[5]);
			FileSystem.getSanPhamCHFromFile(item[6], temp);
			cuaHangs.add(temp);
		}
		raf.close();
	}
	
	public void writeDataToFile() throws IOException{
		File file = new File(PATH);
		file.createNewFile();
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		for (int i = 0; i < cuaHangs.size(); i++) {
			raf.writeBytes(cuaHangs.get(i).getInfos()+FileSystem.writeSanPhamCHToFile(cuaHangs.get(i))+"\n");
		}
		raf.close();
	}
	
	public void addCuaHang(CuaHang cuaHang) {
		this.cuaHangs.add(cuaHang);
	}
	
	public void updateCuaHang(CuaHang cuaHang,int index) {
		cuaHangs.set(index, cuaHang);
	}
        
}
