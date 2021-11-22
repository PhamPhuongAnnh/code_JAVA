package com.team.ui.panel;

import com.team.logic.FileSystem;
import com.team.ui.ActionClick;
import com.team.ui.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class PanelDangNhap extends BasePanel{
    private JLabel jLabel_Title;
    private JLabel jLabel_Login;
    private JLabel jLabel_Acc;
    private JLabel jLabel_Pass;

    private JTextField jTextField_Acc;
    private JPasswordField jPasswordField_Pass;

    private JButton jButton_Login;
    private ActionClick actionClick;
	private JLabel lb_QuayLai;

    @Override
    public void initUI() {
        setLayout(null);
        setBackground(Color.white);
        setVisible(true);
    }

    @Override
    public void addEvent() {

    }

    @Override
    public void addComp() {
        Font big_font = new Font("Tahoma",Font.PLAIN,60);
        Font font = new Font("Tahoma",Font.PLAIN,30);
        Font small_font = new Font("Tahoma",Font.PLAIN,20);
        Font font2 = new Font("Tahoma", Font.BOLD, 15);

        jLabel_Title = createLabel("STORE",305,50,big_font,Color.BLACK,null);
        jLabel_Title.setSize(220,60);
        add(jLabel_Title);

        jLabel_Login = createLabel("Đăng nhập",322,150,font,Color.black,null);
        add(jLabel_Login);

        jTextField_Acc = createTextField(250,300,320,small_font,Color.black);
        jTextField_Acc.setSize(320,35);
        add(jTextField_Acc);
        jLabel_Acc = createLabel("Tài Khoản",138,300,small_font,Color.black,null);
        add(jLabel_Acc);

        jPasswordField_Pass = new JPasswordField();
        jPasswordField_Pass.setFont(small_font);
        jPasswordField_Pass.setSize(320,jTextField_Acc.getHeight());
        jPasswordField_Pass.setLocation(250,360);
        add(jPasswordField_Pass);
        jLabel_Pass = createLabel("Mật Khẩu",140,360,small_font,Color.black,null);
        add(jLabel_Pass);

        jButton_Login = createButton("Xác nhận",315,480,small_font,Color.black,"button_login");
        jButton_Login.setSize(160,50);
        jButton_Login.setBackground(Color.decode("#97D7D3"));
        add(jButton_Login);

        Icon icon = new ImageIcon(FileSystem.PATH_ICON_RETURN,"comeback");
		lb_QuayLai = new JLabel("<html><u>Quay lại</u></html>", icon, JLabel.CENTER);
		lb_QuayLai.setLocation(20, 20);
		lb_QuayLai.setBackground(Color.WHITE);
		lb_QuayLai.setSize(100,40);
		lb_QuayLai.setFont(font2);
		lb_QuayLai.setOpaque(true);
		lb_QuayLai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				actionClick.comeBack();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_QuayLai.setForeground(Color.BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lb_QuayLai.setForeground(Color.BLACK);
			}
		});
		add(lb_QuayLai);
    }

    @Override
    protected void handleClick(String name) {
        if(name.equals("button_login")){
        	if(jTextField_Acc.getText().equals("") || jPasswordField_Pass.getText().equals("")) {
        		JOptionPane.showConfirmDialog(null, "Mời bạn nhập đầy đủ thông tin", "Error", JOptionPane.CLOSED_OPTION);
        	}else {
        		if(checkValidAccount(jTextField_Acc.getText(), jPasswordField_Pass.getText(),actionClick.getRole())) {
        			JOptionPane.showConfirmDialog(null, "Đăng nhập thành công", "Stores", JOptionPane.CLOSED_OPTION);
        			clearText();
                                if(actionClick.getRole() == 0){
                                    actionClick.goToPhienCH();
                                }
                                else{
                                    actionClick.fromDanhSachSanPham();
                                }
        			
        		}else {
        			JOptionPane.showConfirmDialog(null, "Đăng nhập không thành công,\nvui lòng thử lại", "Error", JOptionPane.CLOSED_OPTION);
        		}
        	}
        }
        
    }
 
    private boolean checkValidAccount(String acc, String pass,int role){
    	if(role == 0) {
    		for (int i = 0; i < actionClick.getListCH().size(); i++) {
    			if(acc.equals(actionClick.getListCH().get(i).getTaiKhoan()) && pass.equals(actionClick.getListCH().get(i).getMatKhau())) {
    				actionClick.passDataCHToPanel(actionClick.getListCH().get(i));
    				actionClick.setUserNameCH(actionClick.getListCH().get(i).getTaiKhoan(), actionClick.getListCH().get(i).getTenShop());
    				return true;
    			}
    		}
        	return false;
    	}else{
    		for (int i = 0; i < actionClick.getListKH().size(); i++) {
    			if(acc.equals(actionClick.getListKH().get(i).getTaiKhoan()) && pass.equals(actionClick.getListKH().get(i).getMatKhau())) {
                                System.out.println(actionClick.getListCH().size());
    				actionClick.passDataKHToPanel(actionClick.getListKH().get(i));
    			
    				return true;
    			}
    		}
        	return false;
    	}
    	
    }

    private void clearText() {
    	jTextField_Acc.setText("");
    	jPasswordField_Pass.setText("");
    }
    
    public ActionClick getActionClick() {
        return actionClick;
    }

    public void setActionClick(ActionClick actionClick) {
        this.actionClick = actionClick;
    }
}
