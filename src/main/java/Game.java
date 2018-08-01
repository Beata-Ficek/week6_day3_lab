import java.util.HashMap;

public class Game {
    private HashMap<String, Player> players;

    public Game() {
        this.players = new HashMap<>();
    }

    public void play(Player player1, Player player2, Deck deck){
        player1.drawCard(deck);
        System.out.println(player1.getName() + " draws the " + player1.getFirstCardNumber() + " of " +  player1.getFirstCardSuite());
        player2.drawCard(deck);
        System.out.println(player2.getName() + " draws the " + player2.getFirstCardNumber() + " of " +  player2.getFirstCardSuite());
        if (player1.getFirstCardNumber().getRank() >
                player2.getFirstCardNumber().getRank()){
            System.out.println( player1.getName() + " wins");
        }
        else if (player1.getFirstCardNumber().getRank() <
                player2.getFirstCardNumber().getRank()) {
            System.out.println(player2.getName() + " wins");
        }
        else {
            System.out.println("It's a draw! Everybody loses!");
        }

        player1.discardHand();
        player2.discardHand();
    }

    public void playWithTwoCards(Player player1, Player player2, Deck deck){
        player1.drawCard(deck);
        System.out.println(player1.getName() + " draws the " + player1.getFirstCardNumber() + " of " +  player1.getFirstCardSuite());
        player1.drawCard(deck);
        System.out.println(player1.getName() + " draws the " + player1.getSecondCardNumber() + " of " +  player1.getSecondCard().getSuite());
        player2.drawCard(deck);
        System.out.println(player2.getName() + " draws the " + player2.getFirstCardNumber() + " of " +  player2.getFirstCardSuite());
        player2.drawCard(deck);
        System.out.println(player2.getName() + " draws the " + player2.getSecondCardNumber() + " of " +  player2.getSecondCard().getSuite());

        int player1Total = player1.getFirstCardNumber().getRank() + player1.getSecondCardNumber().getRank();
        int player2Total = player2.getFirstCardNumber().getRank() + player2.getSecondCardNumber().getRank();
        if (player1Total > player2Total){
            System.out.println( player1.getName() + " wins");
        }
        else if (player1Total < player2Total) {
            System.out.println(player2.getName() + " wins");
        }
        else {
            System.out.println("It's a draw! Everybody loses!");
        }

        player1.discardHand();
        player2.discardHand();
    }

}
