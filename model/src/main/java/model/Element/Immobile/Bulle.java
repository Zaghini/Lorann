package model.Element.Immobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Bulle extends Immobile {
	
	private static Sprite Bulle = new Sprite('O',"crystal_ball.png");
	
	Bulle(){
		super(Bulle,Permeability.PENETRABLE);
	}

}