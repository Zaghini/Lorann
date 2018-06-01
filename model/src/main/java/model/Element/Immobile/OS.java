package model.Element.Immobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class OS extends Immobile {
	
	private static final Sprite OS = new Sprite('M',"bone.png");
	
	protected OS(){
		super(OS,Permeability.BLOCKING);
	}

}
