package com.team.ui;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.team.ui.panel.MainPanel;


public class GUI extends JFrame{
	
	public static final Color colerTheme = new Color(151, 215, 211);
	public static final int H_SIZE = 650;
	public static final int W_SIZE = 800;
	private MainPanel mainPanel;
	
	public GUI() {
		initUI();
		addEvent();
		addComp();
	}
	
	private void addComp() {
		// TODO Auto-generated method stub
		mainPanel = new MainPanel();
		add(mainPanel);
	}
	
	private void addEvent() {
		// TODO Auto-generated method stub
		WindowAdapter event = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Do you want to close",
						"Confirm",JOptionPane.YES_NO_OPTION);
				if( result == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		};
		addWindowListener(event);
	}
	
	//initUI hien thi GUI nhu nao
	private void initUI() {
		// TODO Auto-generated method stub
		setTitle("English Game");
		setSize(W_SIZE,H_SIZE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.PINK);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLayout(new CardLayout());
		
		  try {
			  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel" );  
		  }catch (Exception e) { e.printStackTrace(); }
		
	}
}
