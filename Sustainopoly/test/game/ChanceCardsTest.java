package game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChanceCardsTest {

	private ChanceCards chanceCards;
	
	@Before
	public void setUp() throws Exception {
	    chanceCards = new ChanceCards();
	    chanceCards.addCard(new Chance("Get extra energy", 10, 0));
	    chanceCards.addCard(new Chance("Get extra hours", 0, 5));
	    chanceCards.addCard(new Chance("Get extra energy and hours", 5, 5));
	}


	@Test
	public void testAddCard() {
		this.chanceCards = new ChanceCards();
        int initialSize = chanceCards.getCards().size();
        Chance newChance = new Chance("Lose energy and hours", -5, -5);
        chanceCards.addCard(newChance);
        assertEquals(initialSize + 1, chanceCards.getCards().size());
        assertTrue(chanceCards.getCards().contains(newChance));
    }

	@Test
	public void testGetRandomCard() {
	    Chance randomCard = chanceCards.getRandomCard();
	    assertNotNull(randomCard);
	    assertTrue(chanceCards.getCards().contains(randomCard));
	}

}
