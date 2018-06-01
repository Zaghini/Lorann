package Test;

import static org.junit.Assert.*;

import javax.lang.model.element.Element;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.Element.Sprite;

public class ElementTest {
	Element element;
	Sprite sprite;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testgetSprite() {
		assertNotNull(this.sprite.getSprite());
	}

}
