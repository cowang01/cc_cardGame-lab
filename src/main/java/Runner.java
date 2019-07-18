public class Runner {

    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Player player3 = new Player(3);

        deck.populate();
//        int deckSize = deck.countNumberOfCards();

        dealer.addPlayer(player1);
        dealer.addPlayer(player2);
        dealer.addPlayer(player3);

        int player1_Score = 0;
        int player2_Score = 0;
        int player3_Score = 0;

        while (deck.countNumberOfCards() > dealer.numberOfPlayers()){

            deck.shuffle();

            dealer.dealCards(deck);

            int winner = dealer.getWinner().getNumber();
            
            if (winner == 1){
                player1_Score += 1;
            } else if (winner == 2) {
                player2_Score += 1;
            } else {
                player3_Score += 1;
            }


            for (Player player: dealer.getPlayers()){
                player.discardCard();
            }

        }
        System.out.println("Player One Score: " + player1_Score);
        System.out.println("Player Two Score: " + player2_Score);
        System.out.println("Player Three Score: " + player3_Score);
    }
}
