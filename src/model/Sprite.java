package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Sprite {

	protected double x;
	protected double y;
	protected double width;
	protected double height;
	protected String imageUrl;
	protected BufferedImage img;

	protected double sX;
	protected double sY;

	public Sprite(double x, double y, double width, double height, BufferedImage image) throws IOException {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

		File file = new File(this.imageUrl);

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}

	public void render(Graphics g, int sx1, int sy1) throws IOException {
		g.drawImage(img, (int) (x - Game.sX), (int) (y - Game.sY), (int) (x + width - Game.sX),
				(int) (y + height - Game.sY), sx1, sy1, (int) (sx1 + width), (int) (sy1 + height), null);
	}
}
