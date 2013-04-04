package cn.smartlab.listen;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test {
	public static void main(String[] args) {
		MyFrame form = new MyFrame();
		form.setVisible(true);
	}
}

class MyFrame extends Frame {
	Image m_Images;

	MyFrame() {
		setSize(200, 300);
		addWindowListener(new Wclose());
		m_Images = getToolkit().getImage("1.png");
	}

	public void paint(Graphics g) {
		g.drawImage(m_Images, 50, 50, this);
	}
}

class Wclose extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
