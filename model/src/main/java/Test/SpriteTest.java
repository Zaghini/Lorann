package Test;

import static org.junit.Assert.*;

import java.awt.Image;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.Element.Sprite;

public class SpriteTest {
	Sprite sprite;
	Image image;

	@Before
	public void setUp() throws Exception {
		this.sprite= Image("noimage.jpg");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSpriteCharString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSpriteChar() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetImage() {
		assertNotNull(this.sprite.getImage());
	}

	@Test
	public void testLoadImage() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetConsoleImage() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetImageName() {
		assertNotNull(this.sprite.getImage());
	}

	@Test
	public void testIsImageLoaded() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetImageLoaded() {
		fail("Not yet implemented");
	}

}
