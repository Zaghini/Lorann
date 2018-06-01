package view;

import java.awt.Panel;

import javax.swing.JFrame;

public class ViewFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1196137646320974558L;
	private int mapWidht;
	private int mapLenght;
	private ViewPanel Viewpanel;
	

	public ViewFrame(int width, int length, int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life) {
			this.setVisible(true);
			this.setTitle("Lorann");
		    this.setSize(640, 384);
		    this.setLocationRelativeTo(null);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setContentPane(new ViewPanel(motionMapDimension, motionMapImages, motionlessMap, life, score, width, length));
		}
	
	
	public int getMapWidht() {
		return mapWidht;
	}


	public void setMapWidht(int mapWidht) {
		this.mapWidht = mapWidht;
	}


	public int getMapLenght() {
		return mapLenght;
	}


	public void setMapLenght(int mapLenght) {
		this.mapLenght = mapLenght;
	}


	public ViewPanel getPanel() {
		return Viewpanel;
	}


	public void setPanel(ViewPanel Viewpanel) {
		this.Viewpanel = Viewpanel;
	}
	
	
}
