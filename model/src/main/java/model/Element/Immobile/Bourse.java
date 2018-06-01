package model.Element.Immobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Bourse extends Immobile {
	
	private static Sprite Bourse = new Sprite('B',"purse.png");
	
	Bourse(){
	super(Bourse,Permeability.PENETRABLE);	
	}

}