package model.Element.mobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Demon2 extends Mobile {
	
		private static Sprite Demon2 = new Sprite('2',"Demon2.png");
		private boolean alive;
		
		
		protected Demon2(){
			
			super(Demon2, Permeability.PENETRABLE);
		}
		
		public Boolean isAlive() {
	        return this.alive;
	    }
		
		public void die() {
		    this.alive = false;
		}

		protected Demon2(final int x, final int y, Sprite sprite, Permeability permeability) {
			super(sprite, permeability);
			this.setX(x);
			this.setY(y);
		}

}
	