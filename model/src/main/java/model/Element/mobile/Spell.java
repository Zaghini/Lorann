package model.Element.mobile;

import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;

public class Spell extends Mobile {

	private static Sprite Spell1 = new Sprite('5',"Spell1.png");
	private static Sprite Spell2 = new Sprite('6',"Spell2.png"); 
	private static Sprite Spell3 = new Sprite('7',"Spell3.png"); 
	private static Sprite Spell4 = new Sprite('8',"Spell4.png"); 
	private static Sprite Spell5 = new Sprite('9',"Spell5.png"); 

	
	protected Spell() {
		
		super(Spell, Permeability.PENETRABLE);
	}
	
	public Boolean isAlive() {
        return this.alive;
    }
	
	public void die() {
	    this.alive = false;
	}

	protected Spell(final int x, final int y, Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
		this.setX(x);
		this.setY(y);
	}

}	
