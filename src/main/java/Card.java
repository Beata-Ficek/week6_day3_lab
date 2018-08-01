public class Card {
    /*
    +number(NumberType)
    +suite(SuiteType)
     */

    private SuiteType suite;
    private NumberType number;

    public Card (SuiteType suite, NumberType number){
        this.suite = suite;
        this.number = number;
    }

    public SuiteType getSuite(){
        return this.suite;
    }

    public NumberType getNumber(){
        return this.number;
    }
 }
