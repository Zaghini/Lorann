package model.Element.mobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Demon3 extends Mobile {
	
		private static Sprite Demon3 = new Sprite('3',"Demon3.png");
		private boolean alive;
		
		
		protected Demon3(){
			
			super(Demon3, Permeability.PENETRABLE);
		}
		
		public Boolean isAlive() {
	        return this.alive;
	    }
		
		public void die() {
		    this.alive = false;
		}

		protected Demon3(final int x, final int y, Sprite sprite, Permeability permeability) {
			super(sprite, permeability);
			this.setX(x);
			this.setY(y);
		}
	
}
