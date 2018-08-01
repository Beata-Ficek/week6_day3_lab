import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck awesomeDeck;
    @Before
    public void before(){
        awesomeDeck = new Deck();
    }

    @Test
    public void hasAllTheCards(){
        awesomeDeck.addCards();
        assertEquals(52, awesomeDeck.getCards().size());
    }
    @Test
    public void canBeShuffled(){
        awesomeDeck.shuffleDeck();
        assertNotEquals(awesomeDeck.getCards().get(0).getNumber(), NumberType.TWO);
    }
}