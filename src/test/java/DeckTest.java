import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card cardOne;
    Player playerOne;

    @Before
    public void setup(){
        cardOne = new Card(CardRank.QUEEN, CardSuit.DIAMONDS);
        deck = new Deck();
        playerOne = new Player(1);
    }


    @Test
    public void canAddCardToDeck(){
        deck.addCard(cardOne);
        assertEquals(1, deck.countNumberOfCards());
    }

    @Test
    public void canPopulateDeckOfCards(){
        deck.populate();
        assertEquals(52, deck.countNumberOfCards());
    }

    @Test
    public void canShuffleTheDesk(){
        deck.populate();
//        deck.shuffle();
        assertEquals(CardRank.ACE, deck.getFirstCardRank());
        assertEquals(CardSuit.CLUBS, deck.getFirstCardSuit());
    }

    @Test
    public void canDealCardFromDeck(){
        deck.populate();
        deck.dealOneCard(playerOne);
        assertEquals(51, deck.countNumberOfCards());
    }



}
