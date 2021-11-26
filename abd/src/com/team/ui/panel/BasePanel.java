package com.team.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.team.ui.ICommon;


public abstract class BasePanel extends JPanel implements ICommon{
	
	public BasePanel() {
		initUI();
		addEvent();
		addComp();
	}
	
	protected JLabel createLabel(String text,int x,int y,Font f, Color c,Color bg) {
		JLabel lb = new JLabel();
		lb.setText(text);
		lb.setLocation(x,y);
		lb.setBackground(bg);
		lb.setOpaque(true);
		lb.setForeground(c);
		lb.setFont(f);
		FontMetrics fontMetric = getFontMetrics(lb.getFont());
		int wTitle = fontMetric.stringWidth(lb.getText());
		int hTitle = fontMetric.getHeight();
		lb.setSize(wTitle, hTitle);
		return lb;
	}
	
	protected JTextField createTextField(int x,int y,int w,Font f,Color c) {
		JTextField tf = new JTextField();
		tf.setFont(f);
		tf.setLocation(x, y);
		FontMetrics fm = getFontMetrics(tf.getFont());
		int hTfA = fm.getHeight();
		tf.setSize(w, hTfA);
		tf.setForeground(c);
		return tf;
	}
	

	protected JPasswordField createPasswordField(int x,int y,int w,Font f,Color c) {
		JPasswordField tf = new JPasswordField();
		tf.setFont(f);
		tf.setLocation(x, y);
		FontMetrics fm = getFontMetrics(tf.getFont());
		int hTfA = fm.getHeight();
		tf.setSize(w, hTfA);
		tf.setForeground(c);
		return tf;
	}
	

	protected JButton createButton(String text,int x,int y,Font f,Color c,String name) {
		JButton bt = new JButton();
		bt.setText(text);
		bt.setFont(f);
		bt.setName(name);
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComponent comp = (JComponent) e.getSource();
				String name = comp.getName();
				handleClick(name);
			}
		});
		bt.setOpaque(true);
		bt.setBackground(Color.decode("#97D7D3"));
		bt.setForeground(c);
		bt.setLocation(x, y);
		FontMetrics fm=getFontMetrics(bt.getFont());
		int w=fm.stringWidth(bt.getText())+bt.getInsets().left*2 + 40;
		int h=fm.getHeight()+getInsets().top*4 + 20;
		bt.setSize(w, h);

		return bt;
	}
	
	
	protected void handleClick(String name) {

	}
}
