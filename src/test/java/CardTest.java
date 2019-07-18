import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {


    Card cardOne;

    @Before
    public void before(){
        cardOne = new Card(CardRank.QUEEN, CardSuit.DIAMONDS);
    }



    @Test
    public void canGetSuit(){
        assertEquals(CardSuit.DIAMONDS, cardOne.getSuit());
    }
}
