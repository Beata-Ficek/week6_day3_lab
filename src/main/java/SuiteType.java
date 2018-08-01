public enum SuiteType {
    SPADES(3),
    HEARTS(2),
    DIAMONDS(1),
    CLUBS(0);

    private final int rank;

    SuiteType(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return this.rank;
    }
}
