import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCard {
	Card card;

	@Before
	public void setUp() throws Exception {
		card = new Card();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		card.face = 1;
		card.value = 10;
		assertTrue(card.toString().equals("TDiamond"));

	}

}
