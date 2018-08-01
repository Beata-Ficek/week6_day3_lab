import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    /*
    +cards(ArrayList<Card>)
     */

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards(){
        return this.cards;

    }

    public ArrayList<Card> addCards(){
        SuiteType[] allSuites = SuiteType.values();
        NumberType[] allNumbers = NumberType.values();

        for (NumberType number : allNumbers) {
            for (SuiteType suite : allSuites) {
                Card newCard = new Card(suite, number);
                cards.add(newCard);
            }
        }


        return cards;
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public Card pickTopCard(){
        return cards.get(0);
    }


    public void removeFirstCard(){
        cards.remove(0);
    }

}
