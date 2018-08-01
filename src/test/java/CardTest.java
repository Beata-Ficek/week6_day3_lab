import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card aceOfSpades;
    @Before
    public void before(){
        aceOfSpades = new Card(SuiteType.SPADES, NumberType.ACE);
    }

    @Test
    public void cardHasSuite(){
        assertEquals(SuiteType.SPADES, aceOfSpades.getSuite());
    }

    @Test
    public void cardHasNumber(){
        assertEquals(NumberType.ACE, aceOfSpades.getNumber());
    }

    @Test
    public void cardHasNumberValue() {
        assertEquals(12, aceOfSpades.getNumber().getRank());
    }

    @Test
    public void cardHasSuiteValue(){
        assertEquals(3, aceOfSpades.getSuite().getRank());
    }

}
