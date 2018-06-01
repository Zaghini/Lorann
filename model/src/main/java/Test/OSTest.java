package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.Element.Permeability;
import model.Element.Immobile.OS;

public class OSTest extends ImmobileTest {
	OS OS;

	@Before
	public void setUp() throws Exception {
		this.OS= new OS();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
