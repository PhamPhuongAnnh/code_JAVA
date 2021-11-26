package com.team.ui.panel;

import com.team.logic.CuaHang;
import com.team.logic.SanPhamCuaHang;
import com.team.ui.ActionClick;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelPhienCH extends BasePanel{
    private JLabel jLabel_UserName;
    private JButton jButton_Logout;
    private JLabel jLabel_TenCH;

    private JButton jButton_ListSP;
    private JButton jButton_Doanhthu;
    private JButton jButton_CnKhac;

    private ActionClick actionClick_ListSP;
    
    private CuaHang cuaHang;

    @Override
    public void initUI() {
        setLayout(null);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    @Override
    public void addEvent() {

    }

    @Override
    public void addComp() {
        Font font = new Font("Tahoma",Font.PLAIN,20);
        Font small_font = new Font("Tahoma",Font.CENTER_BASELINE,15);

        jLabel_UserName = createLabel("UserName",10,12,small_font,Color.black,Color.white);
        jLabel_UserName.setBackground(null);
        add(jLabel_UserName);

        jButton_Logout = createButton("Đăng xuất", jLabel_UserName.getWidth() + 15, 6,small_font,Color.black,"button_logout");
        jButton_Logout.setSize(100,30);
        jButton_Logout.setFocusable(false);
        jButton_Logout.setBorder(BorderFactory.createEmptyBorder());
        jButton_Logout.setBackground(Color.decode("#d95a09"));
        add(jButton_Logout);
        
        //TEN CUA HANG SE DUOC THAY THE SAU #########
        jLabel_TenCH = createLabel("Tên cửa hàng",219,180,new Font("Tahoma",Font.CENTER_BASELINE,20),Color.black,Color.white);
        jLabel_TenCH.setSize(350,35);
        jLabel_TenCH.setBackground(null);
        jLabel_TenCH.setForeground(Color.decode("#d95a09"));
        add(jLabel_TenCH);

        jButton_ListSP = createButton("Danh sách sản phẩm",219,220,font,Color.black,"button_ListSP");
        jButton_ListSP.setSize(350,50);
        jButton_ListSP.setFocusable(false);
        jButton_ListSP.setBackground(Color.decode("#97D7D3"));
        add(jButton_ListSP);

        jButton_Doanhthu = createButton("Doanh thu",219,290,font,Color.black,"button_doanhthu");
        jButton_Doanhthu.setSize(350,50);
        jButton_Doanhthu.setFocusable(false);
        jButton_Doanhthu.setBackground(Color.decode("#97D7D3"));
        add(jButton_Doanhthu);

        jButton_CnKhac = createButton("Chức năng khác",219,360,font,Color.black,"button_cnkhac");
        jButton_CnKhac.setSize(350,50);
        jButton_CnKhac.setFocusable(false);
        jButton_CnKhac.setBackground(Color.decode("#97D7D3"));
        add(jButton_CnKhac);
    }

    @Override
    protected void handleClick(String name) {
//        if (name.equals("button_ListSP")){
//        	//actionClick_ListSP.passListSPCHToPanelList(cuaHang.getSanPhamCuaHangs());
//        }
        if (name.equals("button_logout")){
        	actionClick_ListSP.saveDataCH(cuaHang);
            actionClick_ListSP.comeBack();
        }
        if(name.equals("button_ListSP")){
            System.out.println(actionClick_ListSP.getListCH().size());
            actionClick_ListSP.fromDanhSachSanPham();
        }
    }
    
	public void setjLabel_UserName(String name) {
		this.jLabel_UserName.setText(name);
	}
	
	public void setjLabel_TenCH(String name) {
		this.jLabel_TenCH.setText(name);
	}

	public CuaHang getCuaHang() {
		return cuaHang;
	}

	public void setCuaHang(CuaHang cuaHang) {
		this.cuaHang = cuaHang;
	}

	public ActionClick getActionClick_ListSP() {
        return actionClick_ListSP;
    }

    public void setActionClick_ListSP(ActionClick actionClick_ListSP) {
        this.actionClick_ListSP = actionClick_ListSP;
    }
    
    public void setListToCH(List<SanPhamCuaHang> list) {
    	cuaHang.setSanPhamCuaHangs(list);
    }
}
