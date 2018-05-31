package model.Element.mobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Demon4 extends Mobile {
	
		private static Sprite Demon4 = new Sprite('4',"Demon4.png");
		private boolean alive;
		
		
		protected Demon4(){
			
			super(Demon4, Permeability.PENETRABLE);
		} 
		
		public Boolean isAlive() {
	        return this.alive; 
	    }
		
		public void die() {
		    this.alive = false;
		}

		protected Demon4(final int x, final int y, Sprite sprite, Permeability permeability) {
			super(sprite, permeability);
			this.setX(x);
			this.setY(y);
		}
	
}
