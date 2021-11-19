package net.mcmillan.populus.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainGUI {
	
	private JFrame window;
	private static final URL joeUrl = MainGUI.class.getResource("/net/mcmillan/populus/gui/joe.jpeg");
	
	private BufferedImage joeImage;
	private ImageIcon joeIcon;
	
	public MainGUI() {
		window = new JFrame("Populus");
		try {
			joeImage = ImageIO.read(joeUrl);
			joeIcon = new ImageIcon(joeImage.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		} catch (Exception e) {
			e.printStackTrace();
		}
		window.setIconImage(joeImage);
		JPanel filler1 = makePanel(new Dimension(300, 400), Color.GREEN);
		JPanel filler2 = makePanel(new Dimension(500, 100), Color.RED);
		
		JEditorPane ep = new JEditorPane();
		filler1.add(ep);
		ep.setPreferredSize(new Dimension(200, 300));
		
//		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, filler1, filler2);
//		sp.setPreferredSize(new Dimension(700, 400));
//		window.add(sp);
		
		JTabbedPane tp = new JTabbedPane();
		tp.insertTab("Filler 1", joeIcon, filler1, null, 0);
		tp.insertTab("Filler 2", joeIcon, filler2, "This is a tooltip for filler 2.", 1);
		window.add(tp);
		
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void start() {
		window.setVisible(true);
	}
	
	private JPanel makePanel(Dimension preferredSize, Color c) {
		JPanel p = new JPanel();
		p.setPreferredSize(preferredSize);
		p.setBackground(c);
		return p;
	}
}
