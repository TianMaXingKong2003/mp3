package com.b510.mp3.util.sreenshot;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;


/**
 * @author Hongten
 * @created 2014-7-28
 */
public class BackGroundPanel extends ImagePanel {
	private static final long serialVersionUID = 1L;
	int width, height;

	public BackGroundPanel() {
		super();
	}

	public BackGroundPanel(String imgUrl) {
		super(imgUrl);
	}

	public BackGroundPanel(Image img) {
		super(img);
	}

	@Override
	public void refreshImg(Image img) {
		this.img = img;
		width = getWidth();
		height = getHeight();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, img.getWidth(null), img.getHeight(null));
	}
}
