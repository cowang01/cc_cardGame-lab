import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Player playerOne;
    Player playerTwo;


    @Before
    public void setup(){
        dealer = new Dealer();
        deck = new Deck();
        playerOne = new Player(1);
        playerTwo = new Player(2);
    }


    @Test
    public void canAddPlayer(){
        dealer.addPlayer(playerOne);
        assertEquals(1, dealer.numberOfPlayers());
    }

    @Test
    public void canDealCardsToPlayers(){
        deck.populate();
        dealer.addPlayer(playerOne);
        dealer.addPlayer(playerTwo);
        dealer.dealCards(deck);
        assertEquals(50, deck.countNumberOfCards());
        assertEquals(1, playerOne.countNumberOfCards());
    }

    @Test
    public void playerWithHighestCardWins(){
        deck.populate();
        dealer.addPlayer(playerOne);
        dealer.addPlayer(playerTwo);
        deck.shuffle();
        dealer.dealCards(deck);
        assertEquals(playerOne, dealer.getWinner());
    }

    @Test
    public void playerDiscardsCard(){
        deck.populate();
        dealer.addPlayer(playerOne);
        dealer.dealCards(deck);
        dealer.addToDiscard(playerOne);
        assertEquals(0, playerOne.countNumberOfCards());

    }

}
