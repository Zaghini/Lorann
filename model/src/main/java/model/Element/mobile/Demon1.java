package model.Element.mobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Demon1 extends Mobile {
	
		private static Sprite Demon1 = new Sprite('1',"Demon1.png");
		private boolean alive;
		
		
		protected Demon1(){
			
			super(Demon1, Permeability.PENETRABLE);
		}
		
		public Boolean isAlive() {
	        return this.alive;
	    }
		
		public void die() {
		    this.alive = false;
		}

		protected Demon1(final int x, final int y, Sprite sprite, Permeability permeability) {
			super(sprite, permeability);
			this.setX(x);
			this.setY(y);
		}
	
}
