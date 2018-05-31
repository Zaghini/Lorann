package model.Element.mobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Lorann extends Mobile {

	private static Sprite Lorann1 = new Sprite('A',"Lorann1.png");
	private static Sprite Lorann2 = new Sprite('Z',"Lorann2.png"); 
	private static Sprite Lorann3 = new Sprite('E',"Lorann3.png"); 
	private static Sprite Lorann4 = new Sprite('R',"Lorann4.png"); 
	private static Sprite Lorann5 = new Sprite('T',"Lorann5.png"); 
	private static Sprite Lorann6 = new Sprite('Y',"Lorann6.png"); 
	private static Sprite Lorann7 = new Sprite('Q',"Lorann7.png"); 
	private static Sprite Lorann8 = new Sprite('C',"Lorann8.png"); 

	
	protected Lorann(){
			
			super(Lorann, Permeability.PENETRABLE);
		}
		
		public Boolean isAlive() {
	        return this.alive;
	    }
		
		public void die() {
		    this.alive = false;
		}

		protected Lorann(final int x, final int y, Sprite sprite, Permeability permeability) {
			super(sprite, permeability);
			this.setX(x);
			this.setY(y);
		}
	
}
