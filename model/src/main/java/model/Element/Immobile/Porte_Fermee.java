package model.Element.Immobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Porte_Fermee extends Immobile {
	
	private static final Sprite Porte_Fermee = new Sprite('F',"gate_close.png");

			
	Porte_Fermee(){
		super(Porte_Fermee,Permeability.BLOCKING);
	}

}