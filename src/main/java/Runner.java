public class Runner {
    public static void main(String[] args) {
        Deck awesomeDeck = new Deck();
        awesomeDeck.addCards();
        awesomeDeck.shuffleDeck();
        Player player1 = new Player("duderino");
        Player player2 = new Player("duderina");
        Game weirdCardGame = new Game();
        weirdCardGame.play(player1, player2, awesomeDeck);
        weirdCardGame.playWithTwoCards(player1, player2, awesomeDeck);
    }
}
