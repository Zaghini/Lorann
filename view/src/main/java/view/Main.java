package view;

public abstract class Main extends ViewFrame{
	
	public Main(int width, int length, int[][] motionMapDimension, String[] motionMapImages, String[][] motionlessMap,
			int score, int life) {
		super(width, length, motionMapDimension, motionMapImages, motionlessMap, score, life);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5276643838848973371L;

	public static void main(String[] args) {
		
		ViewFrame fenetre = new ViewFrame(20, 10, null, args, null, 40, 50);
		
		
	}
}
