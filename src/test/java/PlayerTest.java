import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlayerTest {
    Player duderino;
    Player duderina;
    Deck awesomeDeck;

    @Before
    public void before(){
        duderino = new Player("duderino");
        duderina = new Player("duderina");
        awesomeDeck = new Deck();
    }

    @Test
    public void playerHasOneCard(){
        awesomeDeck.addCards();
        awesomeDeck.shuffleDeck();
        duderino.drawCard(awesomeDeck);
        assertEquals(1, duderino.getHand().size());
    }

    @Test
    public void cardsAreDifferent(){
        awesomeDeck.addCards();
        awesomeDeck.shuffleDeck();
        duderina.drawCard(awesomeDeck);
        duderino.drawCard(awesomeDeck);
        assertNotEquals(duderina.getHand().get(0), duderino.getHand().get(0));
    }

    @Test
    public void playerHasDiscardedHand(){
        awesomeDeck.addCards();
        awesomeDeck.shuffleDeck();
        duderina.drawCard(awesomeDeck);
        duderina.drawCard(awesomeDeck);
        duderina.drawCard(awesomeDeck);
        duderina.drawCard(awesomeDeck);
        duderina.drawCard(awesomeDeck);
        duderina.drawCard(awesomeDeck);
        duderina.discardHand();
        assertEquals(0, duderina.getHand().size());

    }

}
