package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ViewPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6786945841076036254L;
	private ImageIcon icoBandeFond;
	private Image imgBandeFond;
	private int[][] motionMapDimension;
	private String[] motionMapImages;
	private String[][] motionlessMap;
	private int score;
	private int life;
	private int width;
	private int lenght;
	private int mapWidth;
	private int mapLength;
	
	
	public ViewPanel(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life, int width, int length){
		this.setMotionMapDimension(motionMapDimension);
		this.setMotionMapImages(motionMapImages);
		this.setMotionlessMap(motionlessMap);
		this.setScore(score);
		this.setLife(life);
		this.setWidth(width);
		this.setLenght(length);
	}

	/*public void paintComponent(Graphics g){
		Font font = new Font("Courier", Font.BOLD, 20);
		g.setFont(font);
		g.setColor(Color.BLACK);
		g.drawString("Score :", 260, 330);
		g.fillRect(0, 0, this.mapWidth * 32, (this.mapLength * 32) + 40); 
		
		this.icoBandeFond = new ImageIcon(getClass().getResource("/image/lorann_b.png"));
		this.imgBandeFond = this.icoBandeFond.getImage();
		  g.drawImage(this.imgBandeFond, 0, 0, null);                
		  }*/

	public void paintComponent(Graphics g) { 
		g.setColor(Color.BLACK); 
		g.fillRect(0, 0, this.mapWidth * 32, (this.mapLength * 32) + 40); 
		Image img = null; 
		
	//Load motionlessMap 
		for (int i = 0; i < this.mapLength; i++) { 
			for (int j = 0; j < this.mapWidth; j++) { 
				this.icoBandeFond = new ImageIcon(getClass().getResource("/image/lorann_b.png"));
				this.imgBandeFond = this.icoBandeFond.getImage();
				//img = ImageIO.read(new File(this.motionlessMap[i][j])); 
				g.drawImage(img, j*32, i*32, this); } }
	//Load motionMap 
		for (int i = 0; i < 5; i++) { 
			if (motionMapDimension[i][0] != -1) { 
				this.icoBandeFond = new ImageIcon(getClass().getResource("/image/lorann_b.png"));
				this.imgBandeFond = this.icoBandeFond.getImage();
				//img = ImageIO.read(new File(this.motionMapImages[i])); 
				g.drawImage(img, this.motionMapDimension[i][0], this.motionMapDimension[i][1], this); } 
			else { 
	} 
} 
	//loadHud
		g.setColor(Color.WHITE); g.drawString("Lifes : " + this.life + " - Score : " + this.score, ((this.mapWidth * 32) / 2) - 60, (this.mapLength * 32) + 15); 
	}

	public int[][] getMotionMapDimension() {
		return motionMapDimension;
	}

	public void setMotionMapDimension(int[][] motionMapDimension) {
		this.motionMapDimension = motionMapDimension;
	}

	public String[] getMotionMapImages() {
		return motionMapImages;
	}

	public void setMotionMapImages(String[] motionMapImages) {
		this.motionMapImages = motionMapImages;
	}

	public String[][] getMotionlessMap() {
		return motionlessMap;
	}

	public void setMotionlessMap(String[][] motionlessMap) {
		this.motionlessMap = motionlessMap;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	} 
	  }       
