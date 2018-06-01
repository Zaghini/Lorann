package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.Element.Permeability;
import model.Element.Sprite;
import model.Element.Immobile.Immobile;
import model.Element.Immobile.ImmobileFactory;
import model.Element.Immobile.OS;

public  class ImmobileFactoryTest {
	
	
	private static final ImmobileFactory OS;
	
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateOS() {
		final Sprite expected = Os('M',Permeability.BLOCKING);
		assertEquals(expected,this.OS.OS);
	}

	@Test
	public void testCreateMur_Horinzontal() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateMur_Vertical() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreatePorte_Fermee() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateBulle() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateBourse() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreatePorte_Ouverte() {
		fail("Not yet implemented");
	}

}
