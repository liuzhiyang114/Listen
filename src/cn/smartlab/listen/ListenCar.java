package cn.smartlab.listen;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListenCar extends Frame implements ActionListener {

	private Color bg = new Color(255, 255, 234);// 背景色
	private Button btnNext = new Button("下一页");
	private Image img;
	private Image _img;
	private Font f;
	private CarBeans carBeans;
	private String status = "1";
	

	// 布局
	private void setup() {


	}

	public ListenCar() throws UnknownHostException, IOException {
		super("监控器");

		img = getToolkit().getImage("1.png");
		_img = getToolkit().getImage("2.png");
		
		setup(); // 布局
		getDate();
		
		// 窗体的设置
		setSize(640, 480);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(bg);

		addWindowListener(new WindowCloser());
	}

	// paint
	public void paint(Graphics g) {
		f = new Font("宋体",Font.BOLD,20);
		g.setFont(f);
		
		//getDate();
		/*g.drawImage(img, 120, 80, this);
		g.drawImage(_img, 280, 80, this);
		g.drawImage(img, 440, 80, this);
		g.drawImage(_img, 120, 280, this);
		g.drawImage(img, 280, 280, this);
		g.drawImage(img, 440, 280, this);*/
		
		g.drawImage(img, 120, 80, this);
		g.drawString("1号", 140, 200);

		g.drawImage(_img, 280, 80, this);
		g.drawString("2号", 300, 200);

		g.drawImage(img, 440, 80, this);
		g.drawString("3号", 460, 200);

		g.drawImage(_img, 120, 280, this);
		g.drawString("4号", 140, 400);

		g.drawImage(img, 280, 280, this);
		g.drawString("5号", 300, 400);

		g.drawImage(img, 440, 280, this);
		g.drawString("6号", 460, 400);

		/*g.drawString("1号", 140, 200);
		g.drawString("2号", 300, 200);
		g.drawString("3号", 460, 200);
		g.drawString("4号", 140, 400);
		g.drawString("5号", 300, 400);
		g.drawString("6号", 460, 400);*/
		
	}
	
	public void getDate(){
		
		// 取出数据
		List list = Db.getAll();
		for (Object obj : list) {
			carBeans = (CarBeans) obj;
			System.out.println(carBeans.getCarNo() +":"+ carBeans.getCarStatus());
		}
		
	}

	// exit
	private class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}

	public static void main(String[] args) throws UnknownHostException,
			IOException {

		new ListenCar();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}

