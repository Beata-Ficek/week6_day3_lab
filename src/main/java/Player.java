import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }

    public void drawCard(Deck pileOfCards){
        this.hand.add(pileOfCards.getCards().get(0));
        pileOfCards.removeFirstCard();
    }

    public String getName(){
        return this.name;
    }

    public Card getFirstCard(){
        return this.hand.get(0);
    }

    public NumberType getFirstCardNumber(){
        return this.hand.get(0).getNumber();
    }

    public SuiteType getFirstCardSuite(){
        return this.hand.get(0).getSuite();
    }


    public Card getSecondCard(){
        return this.hand.get(1);
    }

    public NumberType getSecondCardNumber(){
        return this.hand.get(1).getNumber();
    }

    public SuiteType getSecondCardSuite(){
        return this.hand.get(1).getSuite();
    }

    public void discardHand(){
        this.hand.clear();
    }

}
